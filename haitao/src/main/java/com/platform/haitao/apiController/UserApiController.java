/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.apiController;

import com.platform.haitao.pojo.User;
import com.platform.haitao.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 *UserApiController:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/28 20:38
 */
@Controller("userApiController")
@RequestMapping("/apiUser")
public class UserApiController {


    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public User toIndex(HttpServletRequest request){
        User user = this.userService.getUserById(1);
        return user;
    }
}
