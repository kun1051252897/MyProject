package com.fun.funmedia;

import com.fun.funmedia.mapper.UserMapper;
import com.fun.funmedia.pojo.User;
import com.fun.funmedia.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void TestInsert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.insertUser();
        System.out.println("执行结果" + result);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestUpdate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.updateUser();
        System.out.println("执行结果" + result);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestDelete() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int result = mapper.deleteUser();
        System.out.println("执行结果" + result);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestSelect() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User result = mapper.getUserById();
        System.out.println("执行结果" + result);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestSelectAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> result = mapper.getAllUser();
        System.out.println("执行结果");
        result.forEach(System.out::println);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestSelectName() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("admin");
        System.out.println("执行结果" + user);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin","123456");
        System.out.println("执行结果" + user);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println("执行结果" + user);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestInsertByBean() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "xsx", "123123", 22, "男", "123123@qq.com");
        int result = mapper.insertUserByBean(user);
        System.out.println("执行结果" + result);
        sqlSession.close();
    }

    @org.junit.Test
    public void TestLoginByParams() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("xsx","123123");
        System.out.println("执行结果" + user);
        sqlSession.close();
    }
}
