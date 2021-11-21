package com.boot.service.impl;

import com.boot.dao.StudentDao;
import com.boot.entity.Student;
import com.boot.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    //添加事务
    @Transactional
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectStudentById(id);
        return student;
    }
}
