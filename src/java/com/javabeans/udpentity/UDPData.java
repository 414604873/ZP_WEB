/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor
 * 总的接收发送数据
 */

package com.javabeans.udpentity;

import com.javabeans.entity.AutoParamInfo;
import com.javabeans.entity.CurrentParam;
import com.javabeans.entity.Device;
import com.javabeans.entity.FriendInformation;
import com.servlets.test;
import java.util.ArrayList;



/**
 * 数据类
 * @author lenovo
 */
public class UDPData {
    private short length = 10;   //数据包长度
    private int ZP_KEY_CLIENT = 987656789;    //客户端标识码
    private int ZP_KEY_SERVER; //服务器标识码
    private int TALK = 3;     //请求类型
    private Message message=new Message();    //消息
    private long WriteCoilStatus;   //按下哪个按钮
    private AutoParamInfo wenduAutoParamInfo;   //温度的自动化参数信息
    private AutoParamInfo shiduAutoParamInfo;   //湿度的自动化参数信息
    private AutoParamInfo guangzhaoAutoParamInfo;   //光照的自动化参数信息
    private short deviceNum;    //触摸屏上传感器的个数
    private ArrayList<Device> currentDevices=new ArrayList<Device>();  //触摸屏上传感器的列表
    private int replyKind;//回复类型
    private int blockSize = 0;
    private FriendInformation myself=new FriendInformation();//朋友信息
    private long OutputCoilStatus=0;//
    private CurrentParam currentParam=new CurrentParam();

    public UDPData() {
       
    }

    public void setLength(short length) {
        this.length = length;
    }

    public CurrentParam getCurrentParam() {
        return currentParam;
    }

    public void setCurrentParam(CurrentParam currentParam) {
        this.currentParam = currentParam;
    }
    public long getOutputCoilStatus() {
        return OutputCoilStatus;
    }

    public void setOutputCoilStatus(long OutputCoilStatus) {
        this.OutputCoilStatus = OutputCoilStatus;
    }

    public int getZP_KEY_SERVER() {
        return ZP_KEY_SERVER;
    }

    public void setZP_KEY_SERVER(int ZP_KEY_SERVER) {
        this.ZP_KEY_SERVER = ZP_KEY_SERVER;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public FriendInformation getMyself() {
        return myself;
    }

    public void setMyself(FriendInformation myself) {
        this.myself = myself;
    }

    public int getReplyKind() {
        return replyKind;
    }

    public void setReplyKind(int replyKind) {
        this.replyKind = replyKind;
    }
    public int getTALK() {
        return TALK;
    }

    public int getZP_KEY_CLIENT() {
        return ZP_KEY_CLIENT;
    }

    public long getWriteCoilStatus() {
        return WriteCoilStatus;
    }

    public void setWriteCoilStatus(long WriteCoilStatus) {
        this.WriteCoilStatus = WriteCoilStatus;
    }

    public ArrayList<Device> getCurrentDevices() {
        return currentDevices;
    }

    public void setCurrentDevices(ArrayList<Device> currentDevices) {
        this.currentDevices=currentDevices;
    }

    public short getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(short deviceNum) {
        this.deviceNum = deviceNum;
    }

    public AutoParamInfo getGuangzhaoAutoParamInfo() {
        return guangzhaoAutoParamInfo;
    }

    public void setGuangzhaoAutoParamInfo(AutoParamInfo guangzhaoAutoParamInfo) {
        this.guangzhaoAutoParamInfo = guangzhaoAutoParamInfo;
    }

    public short getLength() {
        return length;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public AutoParamInfo getShiduAutoParamInfo() {
        return shiduAutoParamInfo;
    }

    public void setShiduAutoParamInfo(AutoParamInfo shiduAutoParamInfo) {
        this.shiduAutoParamInfo = shiduAutoParamInfo;
    }

    public AutoParamInfo getWenduAutoParamInfo() {
        return wenduAutoParamInfo;
    }

    public void setWenduAutoParamInfo(AutoParamInfo wenduAutoParamInfo) {
        this.wenduAutoParamInfo = wenduAutoParamInfo;
    }

    
}
