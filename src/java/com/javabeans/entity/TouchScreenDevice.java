/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javabeans.entity;

import java.util.LinkedList;

/**
 * 该类为设备类(触摸屏)
 *
 * @author lenovo
 */
public class TouchScreenDevice {
    private String ipAddress;//好友IP地址
    private int port;//好友Port
    private CurrentParam currentParams;//该设备环境参数
    private int OutputCoilStatus;
    private int InputCoilStatus;
    private int devNum;//触摸屏上设备的个数
    private LinkedList<Device> currentDevices;//该触摸屏管理的所有设备
    private int status;
    private String TouchScreenDeviceName;

    public TouchScreenDevice(String ipAddress, int port, CurrentParam currentParams, int OutputCoilStatus, int InputCoilStatus, int devNum, LinkedList<Device> currentDevices) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.currentParams = currentParams;
        this.OutputCoilStatus = OutputCoilStatus;
        this.InputCoilStatus = InputCoilStatus;
        this.devNum = devNum;
        this.currentDevices = currentDevices;
    }

    public TouchScreenDevice() {

    }

    public String getTouchScreenDeviceName() {
        return TouchScreenDeviceName;
    }

    public void setTouchScreenDeviceName(String TouchScreenDeviceName) {
        this.TouchScreenDeviceName = TouchScreenDeviceName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getInputCoilStatus() {
        return InputCoilStatus;
    }

    public void setInputCoilStatus(int InputCoilStatus) {
        this.InputCoilStatus = InputCoilStatus;
    }

    public int getOutputCoilStatus() {
        return OutputCoilStatus;
    }

    public void setOutputCoilStatus(int OutputCoilStatus) {
        this.OutputCoilStatus = OutputCoilStatus;
    }

    public LinkedList<Device> getCurrentDevices() {
        return currentDevices;
    }

    public void setCurrentDevices(LinkedList<Device> currentDevices) {
        this.currentDevices = currentDevices;
    }

    public CurrentParam getCurrentParams() {
        return currentParams;
    }

    public void setCurrentParams(CurrentParam currentParams) {
        this.currentParams = currentParams;
    }

    public int getDevNum() {
        return devNum;
    }

    public void setDevNum(int devNum) {
        this.devNum = devNum;
    }



    
}
