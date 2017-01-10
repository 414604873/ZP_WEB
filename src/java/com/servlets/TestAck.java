/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 测试方式选择
 */

package com.servlets;

import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import com.thread.ReceiveThread;
import com.udp.Send;
import java.io.IOException;
import java.util.concurrent.FutureTask;

/**
 *
 * @author hp-pc
 */
public class TestAck {
     public static void main(String[] args) throws Exception {
            UDPData data = new UDPData();
            data.getMessage().setSender("zptest1");
            data.getMessage().setReceiver("dev0");
            data.getMessage().setText("");
            data.getMessage().setMessageContext(MessageContextType.SWITCHCTLON);
            data.setWriteCoilStatus(1<<1);
            Send send=new Send();
            send.send(data,43202,"192.168.1.102");
            ReceiveThread Rthread=new ReceiveThread(send);
            FutureTask<UDPData> futureTask=new FutureTask<UDPData>(Rthread);
            new Thread(futureTask).start();
            Rthread.stopThread(true);
            System.out.println(futureTask.get().getOutputCoilStatus());
            
           
            
}
}
