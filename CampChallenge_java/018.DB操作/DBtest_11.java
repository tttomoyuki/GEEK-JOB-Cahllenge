/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author guest1Day
 */
public class DBtest_11 extends HttpServlet {
    
     Connection db_con = null;
            PreparedStatement db_st = null;
            ResultSet db_data = null;
            
           
            



  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            request.setCharacterEncoding("UTF-8");
            
             String UserID =request.getParameter("changeID");
             
             String Name =request.getParameter("changeName");
             
             String tel =request.getParameter("changetel");
             
             String age =request.getParameter("changeage");
             
             String birthday =request.getParameter("changebirthday");
             
             String departmentID =request.getParameter("changedepartmentID");
             
             String stationID =request.getParameter("changestationID");
             
             
                try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/GeekJob_db","GEEKJOB","password");
                //ageが30のデータを取得
                db_st = db_con.prepareStatement
                ("update user set name = ?,tell = ?,age = ?,birthday = ?,departmentID = ?,stationID = ? where userID = ?");
                
                db_st.setString(1,Name);
                db_st.setString(2, tel);
                db_st.setString(3,age);
                db_st.setString(4,birthday);
                db_st.setString(5,departmentID);
                db_st.setString(6,stationID);
                db_st.setString(7, UserID);
                
                db_st.executeUpdate();
                
                db_st = db_con.prepareStatement
                        ("select * from user");
                
                db_data = db_st.executeQuery();
                
                while(db_data.next()){
                   out.print("ID"+db_data.getString("userID")+"<br>");
                    out.print("名前"+db_data.getString("name")+"<br>");
                    out.print("電話番号"+db_data.getString("tell")+"<br>");
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

