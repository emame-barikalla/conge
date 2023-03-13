package com.portailRH.User.Service;

import com.portailRH.User.Entity.User;
import java.util.List;


public interface IUserService {
    List<User> findAllusers();
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(String login);
    /*Optional<User> findByName(String nom);*/
}

