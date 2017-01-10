/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabeans.udpentity;

/**
 *消息内容类型
 * @author hp-pc
 */
public class MessageContextType {
    public static final int SAVEDEVICEINFO = 161;  //保存设备信息
    public static final int DEVICEINFO = 160;      //设备信息
    public static final int GETDEVICEINFO = 159;     //获取设备信息
    public static final int SAVEAUTOPARAM = 158;        //SAVE自控参数
    public static final int GETAUTOPARAM = 157;       //get自控参数
    public static final int AUTOPARAM = 156;     //自控参数传输
    public static final int OutputCoil = 155;       
    public static final int SWITCHCTLOFF = 154;     //开关控制 OFF
    public static final int SWITCHCTLON = 153;       //开关控制 ON
    public static final int ACKMESSAGE = 152;      //应答消息
    public static final int BEGINSENDPARAM = 151;   //开始发送参数
    public static final int CURRENTPARAM = 150;     //当前参数
}
