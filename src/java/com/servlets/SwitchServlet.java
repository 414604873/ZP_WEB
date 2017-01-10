/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 方式选择
 */
package com.servlets;

import com.javabeans.entity.Device;
import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import com.thread.ReceiveThread;
import com.udp.Send;
import com.util.SwitchUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp-pc
 */
public class SwitchServlet extends HttpServlet {

    String action;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            action = request.getParameter("action");
            System.out.println(action); 
            if ("外遮阳打开".equals(action)) {
                SwitchUtil switchUtil = new SwitchUtil(1 << 0);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("外遮阳关闭".equals(action)) {
                SwitchUtil switchUtil = new SwitchUtil(1 << 1);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("内遮阳打开".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 2);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("内遮阳关闭".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 3);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("顶窗打开".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 4);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("顶窗关闭".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 5);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("后窗打开".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 6);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("后窗关闭".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 7);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("风机".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 8);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("补光灯1".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 9);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("补光灯2".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 10);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("补光灯3".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 11);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("环流风机".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 12);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("微喷".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 13);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }
            else if("湿帘泵".equals(action))
            {
                SwitchUtil switchUtil = new SwitchUtil(1 << 14);
                ReceiveThread Rthread = new ReceiveThread(switchUtil.getSend());
                FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthread);
                new Thread(futureTask).start();
                Rthread.stopThread(true);
                RequestDispatcher re = request.getRequestDispatcher("SwitchAck.jsp");
                re.forward(request, response);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(SwitchServlet.class.getName()).log(Level.SEVERE, null, ex);
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
