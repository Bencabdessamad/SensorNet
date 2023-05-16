package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
		@Autowired
		UserRepository userRepository;

		public List<User> getAllUser() {
			List<User> user = new ArrayList<User>();
			userRepository.findAll().forEach(user1 -> user.add(user1));
			return user;
		}

		public User getUserById(int userid) {
			
			return userRepository.findById(userid).get();
		}

		public void saveOrUpdate(User user) {
			userRepository.save(user);
			
		}
		
		public void delete(int id)   
		{  
			userRepository.deleteById(id);  
		} 
		
		public void update(User user, int userid)   
		{  
			userRepository.save(user);  
		}
		
		
		
		
}
