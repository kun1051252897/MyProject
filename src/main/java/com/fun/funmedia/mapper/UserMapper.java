package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    int updateUser();

    int deleteUser();

    User getUserById();

    List<User> getAllUser();
}
