package com.example.notes.service.impl;

import com.example.notes.entity.Test;
import com.example.notes.mapper.TestMapper;
import com.example.notes.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
