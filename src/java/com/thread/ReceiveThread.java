/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 接收线程
 */
package com.thread;

import com.javabeans.entity.AutoParamInfo;
import com.javabeans.entity.Device;
import com.javabeans.entity.FriendInformation;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;

import com.udp.Send;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.Callable;

;

import java.net.DatagramPacket;

/**
 *接收触摸屏传过来的信息
 * @author hp-pc
 */
public class ReceiveThread implements Callable<UDPData> {

    ArrayList<Device> devices = new ArrayList<Device>();
    private FriendInformation myself = new FriendInformation();
    private UDPData data = new UDPData();
    // private int BlockSize = 0;
    // int replyKind, ZP_KEY_SERVER;
    //  Message message;
    Send send = new Send();
    //private static Thread thread;
    //private MessageListener messageListener;// 消息监听接口对象
    byte[] inBuffer = new byte[2000];
    DatagramPacket inPacket = new DatagramPacket(inBuffer, 2000);
    ByteArrayInputStream block;
    DataInputStream in;
    private boolean run;

    public String StringToH(int strLen) throws IOException {           //将c string转换为java string
        if (strLen < 0) {
            strLen = 0;
        }
        byte[] strByte = new byte[strLen];
        for (int i = 0; i < strLen; i++) {
            strByte[i] = in.readByte();
        }
        String Str = new String(strByte, "utf-16");
        return Str;
    }

   
    public UDPData getData() {
        return data;
    }

    public void setData(UDPData data) {
        this.data = data;
    }

    public ReceiveThread(Send ssend) throws IOException {
        send = ssend;
        //  thread = new Thread(new Runnable() {
        send.getCurrentSocket().receive(inPacket);
        block = new ByteArrayInputStream(inPacket.getData());
        in = new DataInputStream(block);
        run = true;

    }

    public void stopThread(boolean run) {
        this.run = !run;
    }

    public UDPData call() throws Exception {

        // @Override
        // public void run() {
        //    while (run) {
        // try {

        if (data.getBlockSize() == 0) {
            data.setBlockSize(in.readShort());                  //读16位的int
        }
        if (inPacket.getLength() < data.getBlockSize()) {
            data.setBlockSize(0);
        } else {
            data.setZP_KEY_SERVER(in.readInt());                //读服务器标识码
            System.out.println(data.getZP_KEY_SERVER());
            if (data.getZP_KEY_SERVER() != 123454321 && data.getZP_KEY_SERVER() != 987656789) {
                data.setBlockSize(0);
            } else {
                data.setReplyKind(in.readInt());                //读 replykind
                // if (EnumValue.TALK == data.getReplyKind()) {
                // }
                data.getMessage().setKind(in.readInt());        //读消息类型
                data.getMessage().setSender(StringToH(in.readInt()));//读send类型
                data.getMessage().setReceiver(StringToH(in.readInt()));//读receive类型
                data.getMessage().setText(StringToH(in.readInt()));//读text类型
                data.getMessage().setMessageContext(in.readInt());//读消息内容类型
                switch (data.getMessage().getMessageContext()) {
                    case MessageContextType.ACKMESSAGE:
                        System.out.println("ACK");
                    case MessageContextType.CURRENTPARAM://读各种参数
                        data.setOutputCoilStatus(in.readLong());
                        data.getCurrentParam().setInnerWendu(in.readFloat());
                        data.getCurrentParam().setInnerShidu(in.readFloat());
                        data.getCurrentParam().setInnerGuangzhao(in.readFloat());
                        data.getCurrentParam().setInnerFengsu(in.readFloat());
                        data.getCurrentParam().setOuterWendu(in.readFloat());
                        data.getCurrentParam().setOuterShidu(in.readFloat());
                        data.getCurrentParam().setOuterGuangzhao(in.readFloat());
                        data.getCurrentParam().setOuterFengsu(in.readFloat());

                        data.getCurrentParam().setInnerWendu_2(in.readFloat());
                        data.getCurrentParam().setInnerShidu_2(in.readFloat());
                        data.getCurrentParam().setInnerGuangzhao_2(in.readFloat());

                        data.getCurrentParam().setYaLi(in.readFloat());
                        data.getCurrentParam().setYaLi_2(in.readFloat());

                        data.getCurrentParam().setFloatNum2_5(in.readFloat());
                        data.getCurrentParam().setFloatNum2_6(in.readFloat());
                        data.getCurrentParam().setFloatNum2_7(in.readFloat());
                        data.getCurrentParam().setFloatNum2_8(in.readFloat());
                        data.getCurrentParam().setFloatNum2_9(in.readFloat());

                        data.getCurrentParam().setFloatNum3_1(in.readFloat());
                        data.getCurrentParam().setFloatNum3_2(in.readFloat());
                        data.getCurrentParam().setFloatNum3_3(in.readFloat());
                        data.getCurrentParam().setFloatNum3_4(in.readFloat());
                        data.getCurrentParam().setFloatNum3_5(in.readFloat());
                        data.getCurrentParam().setFloatNum3_6(in.readFloat());
                        data.getCurrentParam().setFloatNum3_7(in.readFloat());
                        data.getCurrentParam().setFloatNum3_8(in.readFloat());
                        data.getCurrentParam().setFloatNum3_9(in.readFloat());

                        data.getCurrentParam().setFloatNum4_1(in.readFloat());
                        data.getCurrentParam().setFloatNum4_2(in.readFloat());
                        data.getCurrentParam().setFloatNum4_3(in.readFloat());
                        data.getCurrentParam().setFloatNum4_4(in.readFloat());
                        data.getCurrentParam().setFloatNum4_5(in.readFloat());
                        data.getCurrentParam().setFloatNum4_6(in.readFloat());
                        data.getCurrentParam().setFloatNum4_7(in.readFloat());
                        data.getCurrentParam().setFloatNum4_8(in.readFloat());
                        data.getCurrentParam().setFloatNum4_9(in.readFloat());

                        data.getCurrentParam().setFloatNum5_1(in.readFloat());
                        data.getCurrentParam().setFloatNum5_2(in.readFloat());
                        data.getCurrentParam().setFloatNum5_3(in.readFloat());
                        data.getCurrentParam().setFloatNum5_4(in.readFloat());
                        data.getCurrentParam().setFloatNum5_5(in.readFloat());
                        data.getCurrentParam().setFloatNum5_6(in.readFloat());
                        data.getCurrentParam().setFloatNum5_7(in.readFloat());
                        data.getCurrentParam().setFloatNum5_8(in.readFloat());
                        data.getCurrentParam().setFloatNum5_9(in.readFloat());
                        break;
                    case MessageContextType.OutputCoil:
                        data.setOutputCoilStatus(in.readLong());
                        System.out.println(data.getOutputCoilStatus());
                        break;
                    case MessageContextType.AUTOPARAM:
                        AutoParamInfo Wendu = new AutoParamInfo();//温度
                        Wendu.setParamName(StringToH(in.readInt()));
                        Wendu.setFallTopValue(in.readFloat());
                        Wendu.setFallLowValue(in.readFloat());
                        Wendu.setRaiseTopValue(in.readFloat());
                        Wendu.setRaiseLowValue(in.readFloat());
                        Wendu.setTime(in.readInt());
                        Wendu.setCtlMode(in.readByte());
                        Wendu.setTime2(in.readInt());
                        Wendu.setFallTopValue_2(in.readFloat());
                        Wendu.setFallLowValue_2(in.readFloat());
                        Wendu.setRaiseTopValue_2(in.readFloat());
                        Wendu.setRaiseLowValue_2(in.readFloat());
                        data.setWenduAutoParamInfo(Wendu);
                        //分割线
                        AutoParamInfo Guangzhao = new AutoParamInfo();//光照
                        Guangzhao.setParamName(StringToH(in.readInt()));
                        Guangzhao.setFallTopValue(in.readFloat());
                        Guangzhao.setFallLowValue(in.readFloat());
                        Guangzhao.setRaiseTopValue(in.readFloat());
                        Guangzhao.setRaiseLowValue(in.readFloat());
                        Guangzhao.setTime(in.readInt());
                        Guangzhao.setCtlMode(in.readByte());
                        Guangzhao.setTime2(in.readInt());
                        Guangzhao.setFallTopValue_2(in.readFloat());
                        Guangzhao.setFallLowValue_2(in.readFloat());
                        Guangzhao.setRaiseTopValue_2(in.readFloat());
                        Guangzhao.setRaiseLowValue_2(in.readFloat());
                        data.setGuangzhaoAutoParamInfo(Guangzhao);
                        //分割线
                        AutoParamInfo Shidu = new AutoParamInfo();//湿度
                        Shidu.setParamName(StringToH(in.readInt()));
                        Shidu.setFallTopValue(in.readFloat());
                        Shidu.setFallLowValue(in.readFloat());
                        Shidu.setRaiseTopValue(in.readFloat());
                        Shidu.setRaiseLowValue(in.readFloat());
                        Shidu.setTime(in.readInt());
                        Shidu.setCtlMode(in.readByte());
                        Shidu.setTime2(in.readInt());
                        Shidu.setFallTopValue_2(in.readFloat());
                        Shidu.setFallLowValue_2(in.readFloat());
                        Shidu.setRaiseTopValue_2(in.readFloat());
                        Shidu.setRaiseLowValue_2(in.readFloat());
                        data.setShiduAutoParamInfo(Shidu);
                        System.out.print("0");
                        break;
                    case MessageContextType.DEVICEINFO:
                        AutoParamInfo Wendu1 = new AutoParamInfo();//温度
                        Wendu1.setParamName(StringToH(in.readInt()));
                        Wendu1.setFallTopValue(in.readFloat());
                        Wendu1.setFallLowValue(in.readFloat());
                        Wendu1.setRaiseTopValue(in.readFloat());
                        Wendu1.setRaiseLowValue(in.readFloat());
                        Wendu1.setTime(in.readInt());
                        Wendu1.setCtlMode(in.readByte());
                        Wendu1.setTime2(in.readInt());
                        Wendu1.setFallTopValue_2(in.readFloat());
                        Wendu1.setFallLowValue_2(in.readFloat());
                        Wendu1.setRaiseTopValue_2(in.readFloat());
                        Wendu1.setRaiseLowValue_2(in.readFloat());
                        data.setWenduAutoParamInfo(Wendu1);
                        //分割线
                        AutoParamInfo Guangzhao1 = new AutoParamInfo();//光照
                        Guangzhao1.setParamName(StringToH(in.readInt()));
                        System.out.println(Guangzhao1.getParamName());
                        Guangzhao1.setFallTopValue(in.readFloat());
                        Guangzhao1.setFallLowValue(in.readFloat());
                        Guangzhao1.setRaiseTopValue(in.readFloat());
                        Guangzhao1.setRaiseLowValue(in.readFloat());
                        Guangzhao1.setTime(in.readInt());
                        Guangzhao1.setCtlMode(in.readByte());
                        Guangzhao1.setTime2(in.readInt());
                        Guangzhao1.setFallTopValue_2(in.readFloat());
                        Guangzhao1.setFallLowValue_2(in.readFloat());
                        Guangzhao1.setRaiseTopValue_2(in.readFloat());
                        Guangzhao1.setRaiseLowValue_2(in.readFloat());
                        data.setGuangzhaoAutoParamInfo(Guangzhao1);
                        //分割线
                        AutoParamInfo Shidu1 = new AutoParamInfo();//湿度
                        Shidu1.setParamName(StringToH(in.readInt()));
                        Shidu1.setFallTopValue(in.readFloat());
                        Shidu1.setFallLowValue(in.readFloat());
                        Shidu1.setRaiseTopValue(in.readFloat());
                        Shidu1.setRaiseLowValue(in.readFloat());
                        Shidu1.setTime(in.readInt());
                        Shidu1.setCtlMode(in.readByte());
                        Shidu1.setTime2(in.readInt());
                        Shidu1.setFallTopValue_2(in.readFloat());
                        Shidu1.setFallLowValue_2(in.readFloat());
                        Shidu1.setRaiseTopValue_2(in.readFloat());
                        Shidu1.setRaiseLowValue_2(in.readFloat());
                        data.setShiduAutoParamInfo(Shidu1);

                        data.getCurrentDevices().clear();
                        data.setDeviceNum(in.readShort());

                        for (int n = 0; n < data.getDeviceNum(); n++) {
                            Device deviceInfoTemp = new Device();
                            deviceInfoTemp.setDevName(StringToH(in.readInt()));//读设备名
                            deviceInfoTemp.setDevAdd(in.readByte());//读
                            deviceInfoTemp.setRegAdd(in.readByte());//读
                            deviceInfoTemp.setDevCtlMode(in.readByte());//读设备控制方式
                            deviceInfoTemp.setEnDevName(StringToH(in.readInt()));
                            deviceInfoTemp.setZhengFanZhuan(in.readByte());//读设备正反转
                            devices.add(deviceInfoTemp);
                        }
                        data.setCurrentDevices(devices);
                        break;
                    default:
                        break;
                }
            }

        }
        Thread.sleep(1000);
        //  } //catch (Exception e) {
        //e.printStackTrace();
        //}
        return data;
    }
}
/* public UDPData getUDPData(){
return  data;
}*/
