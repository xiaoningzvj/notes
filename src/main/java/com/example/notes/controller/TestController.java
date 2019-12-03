package com.example.notes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.notes.entity.Test;
import com.example.notes.mapper.TestMapper;
import com.example.notes.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author kangning
 * @since 2019-12-03
 */
@RestController
@RequestMapping("/notes/test")
public class TestController {
    //相当于new
    @Autowired
    private ITestService iTestService;

    /*
    查询学生列表
     */
    @GetMapping("/queryStudent")
    public  List<Test> queryStudent() {

        return iTestService.queryStudent();
    }

}
