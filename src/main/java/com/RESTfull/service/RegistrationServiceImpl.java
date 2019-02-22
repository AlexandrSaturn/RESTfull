package com.RESTfull.service;

import com.RESTfull.entity.User;
import com.RESTfull.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    @Autowired
    UserRepository userRepository;


    public ResponseEntity addUser(User user) {
        if (userRepository.findByEmail(user.getEmail())!=null) {
            //hashPass(user);
            userRepository.save(user);
            return ResponseEntity.ok("Registration successful!");
        } else {
            return ResponseEntity.badRequest().body("A user with this email already exists!");
        }
    }



}
