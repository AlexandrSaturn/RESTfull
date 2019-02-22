package com.RESTfull.service;

import com.RESTfull.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {

    public ResponseEntity addUser(User user);

}
