package com.fun.funmedia;

import com.fun.funmedia.mapper.UserMapper;
import com.fun.funmedia.pojo.User;
import com.fun.funmedia.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
        System.out.println("执行结果" + result);
        sqlSession.close();
    }
}
