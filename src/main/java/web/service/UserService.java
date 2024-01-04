package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return  userDao.getAllUsers();
    }

    public User getUserById(int id) {
        return userDao.showUser(id);
    }
    public void saveUser(User user) {
        userDao.save(user);
    }

    public void updateUser(int id, User user) {
        userDao.update(id, user);
    }

    public void deleteUser(int id) {
        userDao.delete(id);
    }
}
