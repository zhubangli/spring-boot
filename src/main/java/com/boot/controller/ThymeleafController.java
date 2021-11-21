package com.boot.controller;

import com.boot.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafController {
    @RequestMapping("/target")
    public String test01(Model model) {
        model.addAttribute("data", "thymeleaf显示数据");
        return "target";
    }

    @RequestMapping("/eachList")
    public String test02(Model model) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1001, "张三", 20));
        studentList.add(new Student(1002, "李四", 20));
        studentList.add(new Student(1003, "王五", 20));
        studentList.add(new Student(1004, "张柳", 20));
        model.addAttribute("studentList", studentList);
        model.addAttribute("data", true);
        model.addAttribute("mydate", new Date());
        model.addAttribute("mynum", 12.11155);
        return "eachList";
    }

    @RequestMapping("/head")
    public String test03(Model model) {
        model.addAttribute("data", "thymeleaf显示数据");
        return "common/head";
    }
}
