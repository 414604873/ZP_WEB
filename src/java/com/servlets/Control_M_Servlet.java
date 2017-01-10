/*
 * 
 * 控制方式
 */
package com.servlets;

import com.javabeans.entity.AutoParamInfo;
import com.javabeans.entity.Device;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import com.thread.ReceiveThread;
import com.udp.Send;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lenovo
 */
public class Control_M_Servlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //int devicesNum = Integer.valueOf(request.getParameter("devicesNum"));
            UDPData data = new UDPData();
            data.getMessage().setSender("zptest1");
            data.getMessage().setReceiver("dev0");
            data.getMessage().setText("");
            data.getMessage().setMessageContext(MessageContextType.GETDEVICEINFO);
            Send send = new Send();
            send.send(data, 33226, "192.168.1.120");//丢包情况未考虑
            ReceiveThread Rthred = new ReceiveThread(send);
            FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthred);
            new Thread(futureTask).start();
            //int num = futureTask.get().getDeviceNum();
            int wd = Integer.valueOf(request.getParameter("wendu"));
            int gz = Integer.valueOf(request.getParameter("guangzhao"));
            int sd = Integer.valueOf(request.getParameter("shidu"));
            System.out.println("nihao" + wd);


            data.getMessage().setMessageContext(MessageContextType.SAVEDEVICEINFO);
            data.setWenduAutoParamInfo(futureTask.get().getWenduAutoParamInfo());
            data.getWenduAutoParamInfo().setCtlMode((byte) (wd & 0x000000ff));
            data.setShiduAutoParamInfo(futureTask.get().getShiduAutoParamInfo());
            data.setGuangzhaoAutoParamInfo(futureTask.get().getGuangzhaoAutoParamInfo());
            data.setCurrentDevices(futureTask.get().getCurrentDevices());
            data.setDeviceNum(futureTask.get().getDeviceNum());
            Send s = new Send();
            s.send(data, 33226, "192.168.1.120");

            ReceiveThread thred = new ReceiveThread(s);
            FutureTask<UDPData> future = new FutureTask<UDPData>(thred);
            new Thread(future).start();
            for (int i = 0; i < future.get().getDeviceNum(); i++) {
                //System.out.println(futureTask.get().getCurrentDevices().get(i).getDevName()+"   "+futureTask.get().getCurrentDevices().get(i).getDevCtlMode());
                System.out.println("alalala" + future.get().getWenduAutoParamInfo().getCtlMode());
            }
        } catch (Exception e) {
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
