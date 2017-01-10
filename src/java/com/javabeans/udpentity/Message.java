/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabeans.udpentity;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *udp所要发送的消息类
 * @author hp-pc
 */
public class Message {

    private int kind;				//消息类型
    private String sender;			//发送者
    private String receiver;		        //接收者
    private String text;			//消息内容
    private int messageContext;                 //消息内容类型

    Message() {
        kind = 0;
    }

    public byte[] getMessageBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(kind);
            out.writeInt(sender.length()*2);
            out.writeChars(sender);
            out.writeInt(receiver.length()*2);
            out.writeChars(receiver);
            out.writeInt(text.length()*2);
            out.writeChars(text);
            out.writeInt(messageContext);
        } catch (IOException ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bao.toByteArray();
    }
    
    public byte[] getSenderBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(sender.length() * 2);
            out.writeChars(sender);
        } catch (IOException ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }       

        return bao.toByteArray();
    }

    public byte[] getReceiverBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(receiver.length() * 2);
            out.writeChars(receiver);
        } catch (IOException ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bao.toByteArray();
    }

    public byte[] getTextBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(text.length() * 2);
            out.writeChars(text);
        } catch (IOException ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bao.toByteArray();
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getMessageContext() {
        return messageContext;
    }

    public void setMessageContext(int messageContext) {
        this.messageContext = messageContext;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
