package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptStepTwo(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpById(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpStepOne(@Param("deptId") Integer deptId);
}
