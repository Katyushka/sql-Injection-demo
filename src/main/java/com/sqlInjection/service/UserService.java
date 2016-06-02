package com.sqlInjection.service;

import com.sqlInjection.domain.User;
import com.sqlInjection.domain.UserCreateForm;

import java.util.List;

/**
 * Created by user on 02.06.16.
 */
public interface UserService {
    User getUserById(long id);
    List<User> getAllUsers();
    User create(UserCreateForm form);
    User save(User user);
}
