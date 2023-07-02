package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        try {
            List<User> users = new ArrayList<>();
            userRepository.findAll().forEach(users::add);
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public User getUserById(int userid) {
        try {
            Optional<User> optionalUser = userRepository.findById(userid);
            return optionalUser.orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveOrUpdate(User user) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int userid) {
        try {
            userRepository.deleteById(userid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(User user, int userid) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int login(String email, String password) {
        try {
            User user = userRepository.findByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}

