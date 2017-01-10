/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 发送UDP
 */

package com.udp;

import com.javabeans.entity.Device;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 用于生成待发送数据包和发送数据包
 *
 * @author lenovo
 */
public class Send {
    private DatagramSocket socket;
    private DatagramPacket packet;
    private ByteArrayOutputStream bao = new ByteArrayOutputStream();
    private DataOutputStream out = new DataOutputStream(bao);

    public Send() {
        try {
            socket = new DatagramSocket();
        } catch (Exception e) {
        }
    }

    public void send(UDPData waitSendData, int remotePort, String remoteHost) {
        try {
            createPacket(waitSendData);
            InetAddress add = InetAddress.getByName(remoteHost);
            packet = new DatagramPacket(bao.toByteArray(),bao.toByteArray().length,add,remotePort);
            socket.send(packet);
        } catch (Exception ex) {
            //Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createPacket(UDPData data) {
        try {
            out.writeShort(data.getLength());
            out.writeInt(data.getZP_KEY_CLIENT());
            out.writeInt(data.getTALK());
            out.write(data.getMessage().getMessageBytes());

            /*************Message*******************/
            /*out.writeInt(data.getMessage().getKind());
            out.write(data.getMessage().getSenderBytes());
            out.write(data.getMessage().getReceiverBytes());
            out.write(data.getMessage().getTextBytes());
            out.writeInt(data.getMessage().getMessageContext());*/

            switch(data.getMessage().getMessageContext()){
                case MessageContextType.GETDEVICEINFO:
                    break;
                case MessageContextType.GETAUTOPARAM:
                    break;
                case MessageContextType.SWITCHCTLON:
                {
                    out.writeLong(data.getWriteCoilStatus());
                }
                break;
                case MessageContextType.SAVEAUTOPARAM:
                {
                    //依次存入温度 光照 湿度AutoParamInfo
                    out.write(data.getWenduAutoParamInfo().getAutoParamInfoBytes());
                    out.write(data.getGuangzhaoAutoParamInfo().getAutoParamInfoBytes());
                    out.write(data.getShiduAutoParamInfo().getAutoParamInfoBytes());
                }
                break;
                case MessageContextType.SAVEDEVICEINFO:
                {
                    //依次存入温度 光照 湿度AutoParamInfo
                    out.write(data.getWenduAutoParamInfo().getAutoParamInfoBytes());
                    out.write(data.getGuangzhaoAutoParamInfo().getAutoParamInfoBytes());
                    out.write(data.getShiduAutoParamInfo().getAutoParamInfoBytes());
                    //存入设备数量
                    out.writeInt(data.getDeviceNum());
                    //存入设备列表
                    for (Device device : data.getCurrentDevices()) {
                        out.write(device.getDeviceBytes());
                    }
                }
                break;
            }
        } catch (IOException ex) {
            //Logger.getLogger(Send.class.getName()).log(Level.SEVERE, null, ex);
        }

        //return bao.toByteArray();
    }

    public DatagramSocket getCurrentSocket() {
        return socket;
    }

    
}
