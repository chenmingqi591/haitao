/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.dao;

import com.platform.haitao.pojo.User;

/**
 *UserMapper:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/20 17:32
 */
public interface UserMapper {
     User selectByPrimaryKey(Integer userId);
}
