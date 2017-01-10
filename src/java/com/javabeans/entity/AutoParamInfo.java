/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 * 自动参数信息
 */

package com.javabeans.entity;

import com.javabeans.udpentity.CtlMode;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/**
 *
 * @author lenovo
 */
public class AutoParamInfo {
    private String paramName;
    private float fallTopValue;
    private float fallLowValue;
    private float raiseTopValue;
    private float raiseLowValue;
    private int time;
    private byte ctlMode;
    private int time2;//???byte还是int

    private float fallTopValue_2;
    private float fallLowValue_2;
    private float raiseTopValue_2;
    private float raiseLowValue_2;

    public byte[] getAutoParamInfoBytes() {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(bao);

        try {
            out.writeInt(paramName.length()*2);
            out.writeChars(paramName);
            out.writeFloat(fallTopValue);
            out.writeFloat(fallLowValue);
            out.writeFloat(raiseTopValue);
            out.writeFloat(raiseLowValue);
            out.writeInt(time);
            out.writeByte(ctlMode);
            out.writeInt(time2);
            
            out.writeFloat(fallTopValue_2);
            out.writeFloat(fallLowValue_2);
            out.writeFloat(raiseTopValue_2);
            out.writeFloat(raiseLowValue_2);
        } catch (Exception ex) {
            //Logger.getLogger(Message.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bao.toByteArray();
    }

    public AutoParamInfo() {
        paramName = null;
        fallTopValue = 0f;
        fallLowValue = 0;
        raiseTopValue = 0;
        raiseLowValue = 0;
        time = 10;
        ctlMode = CtlMode.MANUAL;
        time2 = 4;
    }

    public AutoParamInfo(String str)
    {
        paramName = str;
        fallTopValue = 0f;
        fallLowValue = 0;
        raiseTopValue = 0;
        raiseLowValue = 0;
        time = 10;
        ctlMode = CtlMode.MANUAL;
        time2 = 4;
    }

    public byte getCtlMode() {
        return ctlMode;
    }

    public void setCtlMode(byte ctlMode) {
        this.ctlMode = ctlMode;
    }

    public float getFallLowValue() {
        return fallLowValue;
    }

    public void setFallLowValue(float fallLowValue) {
        this.fallLowValue = fallLowValue;
    }

    public float getFallLowValue_2() {
        return fallLowValue_2;
    }

    public void setFallLowValue_2(float fallLowValue_2) {
        this.fallLowValue_2 = fallLowValue_2;
    }

    public float getFallTopValue() {
        return fallTopValue;
    }

    public void setFallTopValue(float fallTopValue) {
        this.fallTopValue = fallTopValue;
    }

    public float getFallTopValue_2() {
        return fallTopValue_2;
    }

    public void setFallTopValue_2(float fallTopValue_2) {
        this.fallTopValue_2 = fallTopValue_2;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public float getRaiseLowValue() {
        return raiseLowValue;
    }

    public void setRaiseLowValue(float raiseLowValue) {
        this.raiseLowValue = raiseLowValue;
    }

    public float getRaiseLowValue_2() {
        return raiseLowValue_2;
    }

    public void setRaiseLowValue_2(float raiseLowValue_2) {
        this.raiseLowValue_2 = raiseLowValue_2;
    }

    public float getRaiseTopValue() {
        return raiseTopValue;
    }

    public void setRaiseTopValue(float raiseTopValue) {
        this.raiseTopValue = raiseTopValue;
    }

    public float getRaiseTopValue_2() {
        return raiseTopValue_2;
    }

    public void setRaiseTopValue_2(float raiseTopValue_2) {
        this.raiseTopValue_2 = raiseTopValue_2;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime2() {
        return time2;
    }

    public void setTime2(int time2) {
        this.time2 = time2;
    }

    
}
