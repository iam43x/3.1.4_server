package web.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService{

    User addUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    List<User> getAllUsers();
    User getUserByUsername(String username);
    User getUserById(Long id);
}
