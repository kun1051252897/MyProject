package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.User;
import org.apache.ibatis.annotations.MapKey;
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

    User checkLoginByMap(Map<String, Object> map);

    int insertUserByBean(User user);

    User checkLoginByParams(@Param("username") String username, @Param("password") String password);

    int countUser();

    Map<String, Object> getUserByIdToMap(@Param("user_id") int id);

    //List<Map<String, Object>> getAllUserToMap();
    @MapKey("user_id")
    Map<String, Object> getAllUserToMap();

    //模糊查询
    List<User> getUserByLike(@Param("like") String like);

    //批量删除
    int deleteMoreUser(@Param("ids") String ids);

    //动态设置表名
    List<User> getAllUserByTable(@Param("tableName") String tableName);

    //插入一条数据获取自增的主键
    void insertUserGetId(User user);
}
