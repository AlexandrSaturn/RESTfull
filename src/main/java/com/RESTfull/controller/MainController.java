package com.RESTfull.controller;

import com.RESTfull.entity.User;
import com.RESTfull.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<User> getAllUsers(){
        return mainService.getAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable("id") Long userId) {
        return mainService.getById(userId);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long userId){
        mainService.deleteById(userId);
    }


}
