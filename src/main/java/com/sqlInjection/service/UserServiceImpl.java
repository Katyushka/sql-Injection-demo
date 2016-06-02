package com.sqlInjection.service;


import com.sqlInjection.domain.User;
import com.sqlInjection.domain.UserCreateForm;
import com.sqlInjection.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 02.06.16.
 */


@Service
@Transactional
public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(long id) {
        LOGGER.debug("Getting user={}", id);
        return userRepository.findOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        LOGGER.debug("Getting all users");
        List<User> users = new ArrayList<User>();
        for (User user : userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    @Override
    public User create(UserCreateForm form) {
        LOGGER.debug("Create new user");
        User user = new User();
        user.setLogin(form.getLogin());
        return userRepository.save(user);
    }

    @Override
    public User save(User user) {
        LOGGER.debug("Save user");
        return userRepository.save(user);
    }
}
