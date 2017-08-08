/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 *
 * @author Tomoharu Fujii
 */
public class Task11_8 extends HttpServlet {
       private HashMap<String, String> method(int x){
        HashMap<String, String> user = new HashMap<String, String>();
        switch(x){
            case 1:
                user.put("ID", "1"); 
                user.put("name", "藤井");
                user.put("bod", "1982年6月25日");
                user.put("add", "神奈川県");
                break;
            
            case 2:
                user.put("ID", "2");
                user.put("name", "奥澤");
                user.put("bod", "1988年9月18日"); 
                user.put("add", null);
                break;
                
            case 3:
                user.put("ID", "3"); 
                user.put("name", "乃一");
                user.put("bod", "1988年3月24日");
                user.put("add", "徳島県");
                break;
        }      
        return user;           
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        HashMap<String, String> data = new HashMap<String, String>();
        int limit = 1;
        for(int i = 1; i <= 3; i++){
            data = method(i);
            if(data.get("name") == null){
            }else if(data.get("bod") == null){
            }else if(data.get("add") == null){
            }else{
                if(limit > 2){
                }else{
                out.print("ID:" + i + "氏名：" + data.get("name") + "、生年月日：" + data.get("bod") + "、住所" + data.get("add") + "<br>");
                limit ++;
                }
            }
        }
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
