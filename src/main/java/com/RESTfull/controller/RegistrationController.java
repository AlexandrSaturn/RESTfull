package com.RESTfull.controller;

import com.RESTfull.entity.User;
import com.RESTfull.service.MainService;
import com.RESTfull.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private MainService mainService;

    @Autowired
    private RegistrationService registrationService;


    @RequestMapping(value = "/{login}/{password}/{email}", method = RequestMethod.POST)
    public void addUser(@PathVariable("login") String login, @PathVariable("password") String password, @PathVariable("email") String email  ){

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        registrationService.addUser(user);
    }





    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        return mainService.getAll();
    }
}
