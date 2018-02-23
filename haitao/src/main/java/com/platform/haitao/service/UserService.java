/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.service;

import com.platform.haitao.pojo.User;

/**
 *UserService:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/20 17:30
 */
public interface UserService {
     String login(String name,String password);

     User getUserById(int userId);
}
