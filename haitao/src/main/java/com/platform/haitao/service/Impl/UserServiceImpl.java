/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.service.Impl;

import com.platform.haitao.dao.UserMapper;
import com.platform.haitao.pojo.User;
import com.platform.haitao.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *UserServiceImpl:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/20 17:31
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    public String login(String name, String password) {
        return null;
    }
    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
