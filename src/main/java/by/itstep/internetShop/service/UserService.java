package by.itstep.internetShop.service;

import by.itstep.internetShop.dao.entity.User;
import java.util.List;

public interface UserService {
    User save(User user);

    void deleteUser(User user);

    void deleteUserById(Long id);

    User updateUser(User user);

    List<User> findAll();

    User findById(Long id);

    User findByName(String name);

}
