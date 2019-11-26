package com.itrip.beans.pojo;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    private Integer id;//用户id
    private String userCode;//用户编号
    private String userPassword;//用户密码

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
