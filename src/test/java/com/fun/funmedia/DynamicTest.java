package com.fun.funmedia;

import com.fun.funmedia.mapper.DynamicMapper;
import com.fun.funmedia.pojo.Emp;
import com.fun.funmedia.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicTest {
    @Test
    public void getEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "", 21, "男");
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        empByCondition.forEach(System.out::println);
    }

    @Test
    public void insertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Emp emp = new Emp(null, "小明1", 21, "男");
        Emp emp1 = new Emp(null, "小明2", 21, "男");
        Emp emp2 = new Emp(null, "小明3", 21, "男");
        Emp emp3 = new Emp(null, "小明4", 21, "男");
        List<Emp> emps = Arrays.asList(emp, emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);

    }

    @Test
    public void deleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        Integer[] integers = new Integer[]{6,7};
        mapper.deleteMoreEmp(integers);
    }

}
