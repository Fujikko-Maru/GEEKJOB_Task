/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fajii
 */
public class Task18_2 extends HttpServlet {
    Connection db_con = null;
    PreparedStatement db_st = null;
    ResultSet db_data = null;
    ResultSet db_data2 = null;
    String sql = "INSERT INTO profiles values(?, ?, ?, ?, ?)";
    String select = "SELECT * FROM profiles";
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
        Class.forName("com.mysql.jdbc.Driver").newInstance();  
        db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "tomoharu", "sweet625");
        db_st = db_con.prepareStatement(sql);
        db_st.setInt(1, 6); //1番目に6を設定する
        db_st.setString(2, "藤井 友晴");
        db_st.setString(3, "090-5278-5628");
        db_st.setInt(4, 35);
        db_st.setString(5, "1982-06-25");
        int i = db_st.executeUpdate();
        
        db_data = db_st.executeQuery(select);
        while(db_data.next()){
            out.print("ID：" + db_data.getString("profilesID"));
            out.print(" 名前：" + db_data.getString("name"));
            out.print(" 電話番号：" + db_data.getString("tel"));
            out.print(" 年齢：" + db_data.getString("age"));
            out.print(" 生年月日：" + db_data.getString("birthday") + "<br>");
        }
        
        db_data.close();
        db_st.close();
        db_con.close();
        }catch(SQLException e_sql){
            System.out.println("接続時にエラーが発生しました:" + e_sql.toString() + "<br>");
        }catch(Exception e) {
            System.out.println("接続時にエラーが発生しました:" + e.toString() + "<br>");
        }finally{
            if(db_con != null){
                try{
                db_data.close();
                db_st.close();
                db_con.close();
                }catch(Exception e_con){
                    System.out.println(e_con.getMessage());
                }
            }
           if(db_st != null){
                try{
                db_data.close();
                db_st.close();
                db_con.close();
                }catch(Exception e_con){
                    System.out.println(e_con.getMessage());
                }
           }
           if(db_data != null){
                try{
                db_data.close();
                db_st.close();
                db_con.close();
                }catch(Exception e_con){
                    System.out.println(e_con.getMessage());
                }
            }
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
