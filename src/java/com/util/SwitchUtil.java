/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 方式选择工具类
 */
package com.util;

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
public class SwitchUtil {

    private Send send;

    public SwitchUtil(long statusCoil) throws InterruptedException, IOException {
        UDPData data = new UDPData();
        data.getMessage().setSender("zptest1");
        data.getMessage().setReceiver("dev0");
        data.getMessage().setText("");
        data.getMessage().setMessageContext(MessageContextType.SWITCHCTLON);
        data.setWriteCoilStatus(statusCoil);
        send = new Send();
        send.send(data, 33226, "192.168.1.120");

    }

    public Send getSend() {
        return send;
    }

    public void setSend(Send send) {
        this.send = send;
    }
}
