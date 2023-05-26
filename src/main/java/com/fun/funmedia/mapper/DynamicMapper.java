package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapper {
    List<Emp> getEmpByCondition(Emp emp);

    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
