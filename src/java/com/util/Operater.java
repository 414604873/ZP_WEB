package com.util;

import com.javabeans.entity.CurrentParam;
import com.javabeans.entity.Device;
import com.javabeans.entity.TouchScreenDevice;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 * 对查询的结果集进行处理，得到对象或对象链表
 *
 * @author lenovo
 */
public class Operater {

    DBUtil dbUtil = new DBUtil();

    /**
     * 查询触摸屏当前环境参数,返回值仅为环境参数
     * 
     * @param touchScreenName 触摸屏的名字
     * @return 触摸屏的所有当前参数
     */
    public CurrentParam currentParamQuery(String touchScreenName) {
        String sqlString = "select * from currentdevparam where account=?";
        ResultSet rs = dbUtil.executQuery(sqlString, new String[]{touchScreenName});

        CurrentParam i = new CurrentParam();
        try {
            while (rs.next()) {
                i.setInnerWendu(Float.parseFloat(rs.getString("currentTemp")));
                i.setInnerShidu(Float.parseFloat(rs.getString("currentHumid")));
                i.setInnerGuangzhao(Float.parseFloat(rs.getString("currentGuangZhao")));
                i.setInnerFengsu(Float.parseFloat(rs.getString("currentCO2")));
                i.setOuterWendu(Float.parseFloat(rs.getString("sensorData1_0")));
                i.setOuterShidu(Float.parseFloat(rs.getString("sensorData1_1")));
                i.setOuterGuangzhao(Float.parseFloat(rs.getString("sensorData1_2")));
                i.setOuterFengsu(Float.parseFloat(rs.getString("sensorData1_3")));
            }
        } catch (SQLException ex) {
            // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("读取结果出错，当前参数" + ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return i;
    }

    /**
     * 该用户管理的触摸屏的查询，根据用户名查询
     * 用户登录后的第一步
     * 
     * @param username 用户名
     * @return 该用户管理的所有触摸屏，一个触摸屏名字的链表
     */
    public ArrayList<String> touchScreenListQuery(String username) {
        ArrayList<String> returnResult = new ArrayList<String>();

        String sqlString = "select two from friends where one = ?";
        ResultSet rs = dbUtil.executQuery(sqlString, new String[]{username});

        try {
            while (rs.next()) {
                String i = rs.getString(1);
                returnResult.add(i);
            }
        } catch (SQLException ex) {
            // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("读取结果出错，当前参数" + ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                //Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return returnResult;
    }

    /**
     * 查询该用户管理的触摸屏的除参数信息的所有信息
     * ?????单表查询or多表联合查询
     * 
     * @param username 用户名
     * @return
     */
    public ArrayList<TouchScreenDevice> touchScreenDevicesQuery(String username) {
        ArrayList<TouchScreenDevice> returnResult = new ArrayList<TouchScreenDevice>();

        String sqlString = "select account,status,userIP,userPort,ouputCoilStatus,inputCoilStatus from currentdevparam where account = ?";
        for (String s : touchScreenListQuery(username)) {
            ResultSet rs = dbUtil.executQuery(sqlString, new String[]{s});//查询当前参数表
            try {
                while (rs.next()) {
                    TouchScreenDevice i = new TouchScreenDevice();
                    i.setTouchScreenDeviceName(rs.getString(1));
                    i.setStatus(Integer.parseInt(rs.getString(2)));
                    i.setIpAddress(rs.getString(3));
                    i.setPort(Integer.parseInt(rs.getString(4)));
                    i.setOutputCoilStatus(Integer.parseInt(rs.getString(5)));
                    i.setInputCoilStatus(Integer.parseInt(rs.getString(6)));
                    i.setCurrentParams(currentParamQuery(s));
                    returnResult.add(i);
                }
            } catch (SQLException ex) {
                // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("读取结果出错，当前参数" + ex);
            } finally {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    //Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return returnResult;
    }

    /** 测试所用
     * 查询触摸屏当前环境参数,返回值仅为环境参数
     *
     * @param touchScreenName 触摸屏的名字
     * @return 触摸屏的所有当前参数
     */
    public CurrentParam currentQuery(int n) {
        String sqlString = "select * from currentdevparam where num=?";
        ResultSet rs = dbUtil.executQuery(sqlString, new String[]{n + ""});

        CurrentParam i = new CurrentParam();
        try {
            while (rs.next()) {
                i.setInnerWendu(Float.parseFloat(rs.getString("currentTemp")));
                i.setInnerShidu(Float.parseFloat(rs.getString("currentHumid")));
                i.setInnerGuangzhao(Float.parseFloat(rs.getString("currentGuangZhao")));
                i.setInnerFengsu(Float.parseFloat(rs.getString("currentCO2")));
                i.setOuterWendu(Float.parseFloat(rs.getString("sensorData1_0")));
                i.setOuterShidu(Float.parseFloat(rs.getString("sensorData1_1")));
                i.setOuterGuangzhao(Float.parseFloat(rs.getString("sensorData1_2")));
                i.setOuterFengsu(Float.parseFloat(rs.getString("sensorData1_3")));
            }
        } catch (SQLException ex) {
            // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("读取结果出错，当前参数" + ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                // Logger.getLogger(Operater.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return i;
    }
}
