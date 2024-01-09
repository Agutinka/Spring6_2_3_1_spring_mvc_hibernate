package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.index();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.show(id);
    }

    @Override
    @Transactional(readOnly = false)
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateUser(int id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteUser(int id) {
        userDao.delete(id);
    }
}
