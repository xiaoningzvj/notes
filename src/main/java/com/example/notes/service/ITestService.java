package com.example.notes.service;

import com.example.notes.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author kangning
 * @since 2019-12-03
 */
public interface ITestService extends IService<Test> {

    List<Test> queryStudent();
}
