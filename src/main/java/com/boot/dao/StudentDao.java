package com.boot.dao;

import com.boot.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//告诉mybatis这是dao接口，创建此接口的代理对象
@Mapper
public interface StudentDao {
    Student selectStudentById(@Param("stuId") Integer id);
//    Student selectStudentById(Integer id);
}
