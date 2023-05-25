package com.fun.funmedia;

import com.fun.funmedia.mapper.DeptMapper;
import com.fun.funmedia.mapper.EmpMapper;
import com.fun.funmedia.pojo.Dept;
import com.fun.funmedia.pojo.Emp;
import com.fun.funmedia.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpTest {
    @org.junit.Test
    public void getAllEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(System.out::println);
        sqlSession.close();
    }

    @org.junit.Test
    public void getEmpAndDeptByEmpId(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(emp);
    }

    @org.junit.Test
    public void getEmpAndDeptByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptStepOne(1);
        System.out.println(emp.getEmpName());
    }

    @org.junit.Test
    public void getDeptAndEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpById(1);
        System.out.println(dept);
    }

    @org.junit.Test
    public void getDeptAndEmpByStep(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpStepOne(1);
        System.out.println(dept);
    }
}
