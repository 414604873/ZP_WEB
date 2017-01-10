/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javabeans.entity;

import java.util.LinkedList;

/**
 * 用户类
 *
 * @author lenovo
 */
public class User {
    private String userName;//用户名
    private String password;//用户密码
    
    private LinkedList<TouchScreenDevice> touchScreenDevices;//用户管理的所有触摸屏

    public User() {
    }

    public User(String userName, String password, LinkedList<TouchScreenDevice> touchScreenDevices) {
        this.userName = userName;
        this.password = password;
        this.touchScreenDevices = touchScreenDevices;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LinkedList<TouchScreenDevice> getTouchScreenDevices() {
        return touchScreenDevices;
    }

    public void setTouchScreenDevices(LinkedList<TouchScreenDevice> touchScreenDevices) {
        this.touchScreenDevices = touchScreenDevices;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    


}
