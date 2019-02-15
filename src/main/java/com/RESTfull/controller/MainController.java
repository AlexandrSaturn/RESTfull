package com.RESTfull.controller;

import com.RESTfull.entity.User;
import com.RESTfull.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<User> getAllUsers(){
        return mainService.getAll();
    }

    @RequestMapping(value = "/main/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Integer userId) {
        return mainService.getById(userId);
    }

}
