package com.fun.funmedia.mapper;

import com.fun.funmedia.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    List<Emp> getAllEmp();

    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    Emp getEmpAndDeptStepOne(@Param("empId") Integer empId);

    List<Emp> getDeptAndEmpStepTwo(@Param("dept_id") Integer dept_id);
}
