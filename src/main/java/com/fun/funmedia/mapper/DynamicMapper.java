package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.Emp;

import java.util.List;

public interface DynamicMapper {
    List<Emp> getEmpByCondition(Emp emp);
}
