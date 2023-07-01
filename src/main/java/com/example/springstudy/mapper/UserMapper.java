package com.example.springstudy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springstudy.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lichengcan
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}