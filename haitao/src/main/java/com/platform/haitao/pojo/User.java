/**
 * Copyright (c) 2014-2018 墨泊云舟 All Rights Reserved.
 */
package com.platform.haitao.pojo;

import lombok.Data;

/**
 *User:
 *
 * @author chenmingqi
 * @version 1.00
 * @since 2018/1/20 17:34
 */

public class User {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String userName;

    private String password;

    private Integer age;
}
