package com.example.notes.mapper;

import com.example.notes.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kangning
 * @since 2019-12-03
 */
@Mapper
@Repository
public interface TestMapper extends BaseMapper<Test> {

}
