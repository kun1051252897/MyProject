package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int insertUser();

    int updateUser();

    int deleteUser();

    User getUserById();

    List<User> getAllUser();

    User getUserByName(String name);

    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String,Object> map);

    int insertUserByBean(User user);

    User checkLoginByParams(@Param("username") String username,@Param("password")  String password);
}
