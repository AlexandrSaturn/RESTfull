package com.RESTfull.service;

import com.RESTfull.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface MainService {
    Iterable<User> getAll();
    User getById(Integer id);
    User save(User user);
    void deleteById(long id);
}
