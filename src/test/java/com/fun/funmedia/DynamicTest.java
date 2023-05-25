package com.fun.funmedia;

import com.fun.funmedia.mapper.DynamicMapper;
import com.fun.funmedia.pojo.Emp;
import com.fun.funmedia.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
