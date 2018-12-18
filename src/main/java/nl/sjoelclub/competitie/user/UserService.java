package nl.sjoelclub.competitie.user;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;

import nl.sjoelclub.competitie.config.SimpleSecurityController;
import nl.sjoelclub.competitie.exception.UserNotFoundException;

@Controller
@Transactional
public class UserService {
	private final UserRepository userRepository;
	private final SimpleSecurityController securityController;
	private final PasswordEncoder encoder;

	@Autowired
	public UserService(UserRepository userRepository, SimpleSecurityController securityController,
			PasswordEncoder encoder) {
		this.userRepository = userRepository;
		this.securityController = securityController;
		this.encoder = encoder;
	}

	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserByUsername(String username) {
		User result = userRepository.findByUsername(username);
		
		if (result != null) {
			return result;
		} else {
			throw new UserNotFoundException("[username : " + username + "] - User not found");
		}
	}
	
	public User addUser(User user) { 
		try {
			getUserByUsername(user.getUsername());
			return new User();
		} catch (UserNotFoundException e) {
			User savedUser = userRepository.save(user.setPassword(encoder.encode(user.getPassword())));
			if (savedUser != null) {
			    securityController.add(savedUser.getUsername(), savedUser.getPassword(), savedUser.getRole());
			}
			return savedUser;
		}
	}
	
	public String deleteUser(String username) { 
		if (isUserExists(username)) {
			userRepository.deleteById(userRepository.findByUsername(username).getId());
			securityController.remove(username);
			return "User deleted [username: "+ username + "]";
			
		} else {
			return "Delete user request can not proceed because of non existing user [username: " + username + "]";
		}
		
	}
	
	public void initUsers() { 
		for (User u : getAllUsers()) {
		    securityController.add(u.getUsername(), u.getPassword(), u.getRole());
		}
		
	}
	
	public boolean isUserExists(String username) { 
		return securityController.userExists(username);	
	}
	
	
	
}
