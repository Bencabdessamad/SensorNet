package com.example.demo;

import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Collections;


@RestController
@RequestMapping("/api/user")
public class UserController {
			private static Logger logger = LoggerFactory.getLogger(UserController.class);
			
			@Autowired
			UserRepository userRepository;
					
			@Autowired
			UserService userService;
			
			@GetMapping("/get-all-users")
			private List<User> getAllUser(){
				logger.debug("getAllUser()");
				return userService.getAllUser();
			}
			
			@GetMapping("/get-user/{id}")
			private User getUser(@PathVariable("id") int userid) {
				logger.debug("getUser()");
				return userService.getUserById(userid);
			}
			
			@DeleteMapping("/delete-user/{id}") 
			private void deleteUser(@PathVariable("id") int userid) {
				 logger.debug("deleteUser()");
				userService.delete(userid);
			}
			
			@PostMapping("/create-user")
			private int saveUser(@RequestBody User user) {
				logger.debug("saveUser()");
				logger.debug(user.toString());
				userService.saveOrUpdate(user);
				return user.getUserid();
			}
			
			@PostMapping("/login")
			public int login(@RequestBody User user) {
				logger.debug("login()");
			    return userService.login(user.getEmail(), user.getPassword());
			}
			
			@PutMapping("/update-user/{id}")
			private User update(@RequestBody User user) {
				logger.debug("update()");
                                logger.debug(user.toString());
				userService.saveOrUpdate(user);
				return user;
			}
			
			/*@GetMapping("/search-user")
			public List<User> searchUsers(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom) {
			logger.debug("searchUsers()");
    			List<User> users = userRepository.findByNomAndPrenom(nom, prenom);
			logger.debug(users.toString());
    			return users;
			}*/


			@GetMapping("/search-user")
			public List<User> searchUsers(@RequestParam(value = "nom", required = false) String nom, @RequestParam(value = "prenom", required = false) String prenom) {
    			logger.debug("searchUsers()");
    
    			if (nom != null && prenom != null) {
        		// Both nom and prenom are provided, search by both criteria
        		List<User> users = userRepository.findByNomAndPrenom(nom, prenom);
        		logger.debug(users.toString());
        		return users;
    			} else if (nom != null) {
        		// Only nom is provided, search by nom
        		List<User> users = userRepository.findByNom(nom);
        		logger.debug(users.toString());
        		return users;
    			} else if (prenom != null) {
        		// Only prenom is provided, search by prenom
        		List<User> users = userRepository.findByPrenom(prenom);
        		logger.debug(users.toString());
        		return users;
    			} else {
        		// No search criteria provided, return an empty list
        		return Collections.emptyList();
    			}
			}


}
