/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javabeans.entity;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/**
 *
 * 底层设备的类
 * @author lenovo
 */
public class Device {
    String devName;//设备名
    int devAdd;
    int regAdd;//端口
    int devCtlMode;//设备的控制方式
    String enDevName;
    int zhengFanZhuan;//设备的正反转

    public byte[] getDeviceBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
         DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(devName.length()*2);
            out.writeChars(devName);
            out.writeInt(devAdd);
            out.writeInt(regAdd);
            out.writeInt(enDevName.length()*2);
            out.writeChars(enDevName);
            out.writeInt(zhengFanZhuan);
        } catch (Exception ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bao.toByteArray();
    }

    public Device() {
        
    }

    public Device(String devName, int devAdd, int regAdd, int devCtlMode, int zhengFanZhuan, String enDevName) {
        this.devName = devName;
        this.devAdd = devAdd;
        this.regAdd = regAdd;
        this.devCtlMode = devCtlMode;
        this.zhengFanZhuan = zhengFanZhuan;
        this.enDevName = enDevName;
    }

    public int getDevAdd() {
        return devAdd;
    }

    public void setDevAdd(int devAdd) {
        this.devAdd = devAdd;
    }

    public int getDevCtlMode() {
        return devCtlMode;
    }

    public void setDevCtlMode(int devCtlMode) {
        this.devCtlMode = devCtlMode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getEnDevName() {
        return enDevName;
    }

    public void setEnDevName(String enDevName) {
        this.enDevName = enDevName;
    }

    public int getRegAdd() {
        return regAdd;
    }

    public void setRegAdd(int regAdd) {
        this.regAdd = regAdd;
    }

    public int getZhengFanZhuan() {
        return zhengFanZhuan;
    }

    public void setZhengFanZhuan(int zhengFanZhuan) {
        this.zhengFanZhuan = zhengFanZhuan;
    }


}
