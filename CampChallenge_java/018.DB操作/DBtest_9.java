/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*; 

/**
 *
 * @author guest1Day
 */
public class DBtest_9 extends HttpServlet {

   Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            
            String id = request.getParameter("ID") ;
            
            String name = request.getParameter("Name");
            
            String tel = request.getParameter("tel");
            
            String age =request.getParameter("age");
            
            String birthday = request.getParameter("birthday");
           
            
           
              try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/GeekJob_db","GEEKJOB","password");
                //
               
                
                db_st = db_con.prepareStatement
        ("INSERT INTO profiles VALUES (?,?,?,?,?)");
                
                db_st.setString(1,id);
                
                db_st.setString(2, name);
                
                db_st.setString(3, tel);
                
                db_st.setString(4, age);
                
                db_st.setString(5, birthday);
                
                db_st.executeUpdate();
                
                db_st = db_con.prepareStatement
                       ("select * from profiles" );
                
                db_data=db_st.executeQuery();
                        
                
                
                
                
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
