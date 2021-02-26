package webSecurity.service;


import webSecurity.model.Role;
import webSecurity.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

    List<Role> getRoles();
}
