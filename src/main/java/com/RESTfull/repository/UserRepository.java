package com.RESTfull.repository;

import com.RESTfull.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User,Long> {
    List<User> findByEmail(String email);
    List<User> findByLogin(String login);
    void deleteById (Long id);
    User findById(Integer id);

}
