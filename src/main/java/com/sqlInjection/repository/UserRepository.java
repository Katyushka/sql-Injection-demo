package com.sqlInjection.repository;

/**
 * Created by user on 30.05.16.
 */

import com.sqlInjection.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findByLogin(String login);

    User findById(Long id);

}
