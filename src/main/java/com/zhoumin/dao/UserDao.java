package com.zhoumin.dao;
import com.zhoumin.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository  //此注解代表这是一个持久层，用法类似@controller、@service
public interface UserDao {

    @Select(value = "select * from test_user")
    List<User> findAll();

    @Insert("insert into test_user(id,name) value(#{id},#{name})")
    void saveUser(User user);
}



