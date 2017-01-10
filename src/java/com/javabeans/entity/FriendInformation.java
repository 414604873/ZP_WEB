/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javabeans.entity;

/**
 *好友信息
 * @author hp-pc
 */
public class FriendInformation {
    private String account;
    private String name;
    private int avatarNumber;
    private int status;
    private int type1;
    private int type2;
    private int type3;
    private int type4;
    private String about;
    private String remark;			//好友备注
    private String ipAddress;			//好友IP地址
    private int port;					//好友Port

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAvatarNumber() {
        return avatarNumber;
    }

    public void setAvatarNumber(int avatarNumber) {
        this.avatarNumber = avatarNumber;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType1() {
        return type1;
    }

    public void setType1(int type1) {
        this.type1 = type1;
    }

    public int getType2() {
        return type2;
    }

    public void setType2(int type2) {
        this.type2 = type2;
    }

    public int getType3() {
        return type3;
    }

    public void setType3(int type3) {
        this.type3 = type3;
    }

    public int getType4() {
        return type4;
    }

    public void setType4(int type4) {
        this.type4 = type4;
    }

    public FriendInformation()
    {	avatarNumber = status = 0;	}
}
