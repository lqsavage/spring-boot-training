package com.neo.repository;

import com.neo.model.User;

/**
 * @author LIQI
 */
public interface UserRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}
