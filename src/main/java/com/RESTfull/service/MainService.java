package com.RESTfull.service;

import com.RESTfull.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MainService {
    Iterable<User> getAll();
    Optional<User> getById(Long id);
    void save(User user);
    void deleteById(long id);

}
