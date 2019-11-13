package com.zhoumin.service.Impl;
import com.zhoumin.dao.UserDao;
import com.zhoumin.domain.User;
import com.zhoumin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        System.out.println("Service业务层：查询所有用户...");
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        System.out.println("Service业务层：保存用户...");
        userDao.saveUser(user);//调用service中的saveUser(user)方法
    }
}


