package com.example.notes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.notes.entity.Test;
import com.example.notes.mapper.TestMapper;
import com.example.notes.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kangning
 * @since 2019-12-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Autowired
    private TestMapper testMapper;

    //在service里实现逻辑
    @Override
    public List<Test> queryStudent() {
        List<Test> tests = testMapper.selectList(new QueryWrapper<Test>());
        return tests;
    }
}
