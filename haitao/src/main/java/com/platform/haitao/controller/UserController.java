/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.controller;

import com.platform.haitao.pojo.User;
import com.platform.haitao.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 *UserController:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/20 17:30
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(HttpServletRequest request,Model model){

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        model.addAttribute("name",name);
        return "login";

      /*return  userService.login(name,password);*/
    }


    @RequestMapping(value ="/showUser",method = RequestMethod.GET, produces = "application/json;charset=UTF-8, text/plain;charset=UTF-8")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }

    @RequestMapping(value="/{name}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name){

        ModelAndView model = new ModelAndView();
        model.setViewName("index2");
        model.addObject("msg", name);

        return model;
    }


}
