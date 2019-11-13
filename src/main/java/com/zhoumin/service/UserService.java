package com.zhoumin.service;
import com.zhoumin.domain.User;
import java.util.List;

public interface UserService {
    // 查询所有账户
    List<User> findAll();

    // 保存帐户信息
    void saveUser(User user);
}


