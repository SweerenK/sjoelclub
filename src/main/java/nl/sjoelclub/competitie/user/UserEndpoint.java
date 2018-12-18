package nl.sjoelclub.competitie.user;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@Path("/user")
@Controller
public class UserEndpoint {
	private final UserService userService;
	
	@Autowired
	public UserEndpoint(UserService userService) {
	    this.userService = userService;
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@GET
	@Path("/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity getUserByUsername(@PathParam("username") @NotBlank String username) {
		return ResponseEntity.ok(userService.getUserByUsername(username));
	}
	
	@GET
	@Path("/exist/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity isUserExist(@PathParam("username") @NotBlank String username) {
		return ResponseEntity.ok(userService.isUserExists(username));
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity addUser(@RequestBody @Valid User user) {
		return ResponseEntity.ok(userService.addUser(user));
	}
	
	@DELETE
	@Path("/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity deleteUser(@PathParam("username") @NotBlank String username) {
	    return ResponseEntity.ok(userService.deleteUser(username));
	}
	
}
