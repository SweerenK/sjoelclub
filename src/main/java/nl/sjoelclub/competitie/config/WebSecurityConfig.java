package nl.sjoelclub.competitie.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
	    final Properties users = new Properties();
	    users.put("username",encoder().encode("password") + ",ROLE_ADMIN,enabled"); //adding for default jedimaster account	
	    return new InMemoryUserDetailsManager(users);
	}
	
	@Bean
	public DaoAuthenticationProvider authProvider() {
	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(inMemoryUserDetailsManager());
	    authProvider.setPasswordEncoder(encoder());
	    return authProvider;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService(inMemoryUserDetailsManager());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.csrf().disable()
	        .authorizeRequests()
	            .antMatchers("/", "/register", "/api/user/add").permitAll()
	            .anyRequest().authenticated()
	        .and()
	        .formLogin().permitAll()
	            .defaultSuccessUrl("/trein", true)
	        .and()
	        .httpBasic()
	        .and()
	        .logout()
	            .logoutUrl("/logout").permitAll()
	            .clearAuthentication(true)
	            .logoutSuccessUrl("/")
	            .invalidateHttpSession(true)
	            .deleteCookies("JSESSIONID");
	}
}
