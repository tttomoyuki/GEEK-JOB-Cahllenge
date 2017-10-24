/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "DBtest_7", urlPatterns = {"/DBtest_7"})
public class DBtest_7 extends HttpServlet {
    Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;

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
            throws ServletException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
              try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/GeekJob_db","GEEKJOB","password");
                //ageが30のデータを取得
                db_st = db_con.prepareStatement
                ("update profiles set name = ?  where profilesID = 1");
                db_st.setString(1,"松岡修三");
                db_st.executeUpdate();
                
                 db_st = db_con.prepareStatement
                ("update profiles set birthday = ?  where profilesID = 1");
                db_st.setString(1,"1967-11-06");
                db_st.executeUpdate();
                
                 db_st = db_con.prepareStatement
                ("update profiles set birthday = ?  where profilesID = 1");
                db_st.setString(1,"1967-11-06");
                db_st.executeUpdate();
                
                db_st = db_con.prepareStatement("select * from profiles");
                
                db_data = db_st.executeQuery();
                
                
                while(db_data.next()){
                    
                 out.print("ID"+db_data.getString("profilesID")+"<br>");
                    out.print("名前"+db_data.getString("name")+"<br>");
                    out.print("電話番号"+db_data.getString("tel")+"<br>");
                    out.print("年齢"+db_data.getString("age")+"<br>");
                    out.print("誕生日"+db_data.getString("birthday")+"<br><br>");
                }
            
                db_data.close();
                db_st.close();
                db_con.close();
            } catch (SQLException e_sql){
                out.println("接続時にエラーが発生しました。"+e_sql.toString());
            } catch (Exception e){
                out.println("接続時にエラーが発生しました。"+e.toString());
            } finally{
                if(db_con != null){
                    try{
                        db_con.close();
                    }catch (Exception e_con){
                        System.out.println(e_con.getMessage());
                    }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBtest_7.class.getName()).log(Level.SEVERE, null, ex);
        }
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
