/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 自动参数
 */
package com.servlets;

import com.javabeans.udpentity.MessageContextType;
import com.javabeans.udpentity.UDPData;
import com.thread.ReceiveThread;
import com.udp.Send;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp-pc
 */
public class AutoServlet extends HttpServlet {

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
            float wdft = Float.valueOf(request.getParameter("wdft"));
            /*String wdrt = request.getParameter("wdrt");
            String wdfl = request.getParameter("wdfl");
            String wdrl = request.getParameter("wdrl");
            String gzft = request.getParameter("gzft");
            String gzrt = request.getParameter("gzrt");
            String gzfl = request.getParameter("gzfl");
            String gzrl = request.getParameter("gzrl");
            String sdft = request.getParameter("sdft");
            String sdrt = request.getParameter("sdrt");
            String sdfl = request.getParameter("sdfl");
            String sdrl = request.getParameter("sdrl");
            String wdt = request.getParameter("wdt");
            String gzt = request.getParameter("gzt");
            String sdt = request.getParameter("sdt");*/


            UDPData data = new UDPData();
            data.getMessage().setSender("zptest1");
            data.getMessage().setReceiver("dev0");
            data.getMessage().setText("");
            data.getMessage().setMessageContext(MessageContextType.GETAUTOPARAM);
            Send send = new Send();
            send.send(data, 33226, "192.168.1.120");
            ReceiveThread Rthred = new ReceiveThread(send);
            FutureTask<UDPData> futureTask = new FutureTask<UDPData>(Rthred);
            new Thread(futureTask).start();
            futureTask.get().getShiduAutoParamInfo();

            data.getMessage().setMessageContext(MessageContextType.SAVEAUTOPARAM);
            data.setWenduAutoParamInfo(futureTask.get().getWenduAutoParamInfo());
            data.getWenduAutoParamInfo().setFallTopValue(wdft);
            data.setShiduAutoParamInfo(futureTask.get().getShiduAutoParamInfo());
            data.setGuangzhaoAutoParamInfo(futureTask.get().getGuangzhaoAutoParamInfo());

            Send s = new Send();
            s.send(data, 33226, "192.168.1.120");


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
