/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 测试获取设备信息
 */
package com.servlets;

import com.javabeans.entity.Device;
import com.javabeans.entity.TouchScreenDevice;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import com.thread.ReceiveThread;
import com.udp.Send;
import com.util.Operater;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Thread;
import java.util.ArrayList;
/**
 *
 * @author hp-pc
 */
public class test {

    public static void main(String[] args) {
        try {
            //Operater operater=new Operater();
            //for(int i=0;i<operater.touchScreenDevicesQuery("zptest1").size();i++)
            //System.out.print(operater.touchScreenDevicesQuery("zptest1").get(i).getIpAddress());
            UDPData data = new UDPData();
            data.getMessage().setSender("zptest1");
            data.getMessage().setReceiver("dev0");
            data.getMessage().setText("");
            data.getMessage().setMessageContext(MessageContextType.GETDEVICEINFO);
            Send send = new Send();
            send.send(data, 33226, "192.168.1.120");
            ReceiveThread Rthred = new ReceiveThread(send);
            FutureTask<UDPData> futureTask=new FutureTask<UDPData>(Rthred);
            new Thread(futureTask).start();
            Rthred.stopThread(true);
            for(int i=0;i<futureTask.get().getDeviceNum();i++)
            {
                System.out.println(futureTask.get().getCurrentDevices().get(i).getDevName());
                System.out.println(futureTask.get().getCurrentDevices().get(i).getZhengFanZhuan());
            }
            
        } catch (Exception ex) {
            System.out.println("服务器意外终止 ！");
        }

    }
}
