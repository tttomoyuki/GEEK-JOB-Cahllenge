/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockManagement;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


/**
 *
 * @author guest1Day
 */
public class stockmg_rogin extends HttpServlet {
    //各クラスのインスタンスを作成
    Connection db_con = null;
            
    PreparedStatement db_st = null;
            
    ResultSet db_data = null;

    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Rogin.jspから受け取ったデータからstockmanageテーブルと照らし合わせ、
            //ログインIDとパスワードが登録されていればメインページのjspに飛ぶ。
          request.setCharacterEncoding("UTF-8");
          
          HttpSession session=request.getSession(false);
          
          String stockID=request.getParameter("stockID");
          
          String pass=request.getParameter("password");
         try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/GeekJob_db","GEEKJOB","password");
                //ageが30のデータを取得
                db_st = db_con.prepareStatement
                ("select * from stockmanage where stockID=? or pass=?");
                
                db_st.setString(1,stockID);
                db_st.setString(2, pass);
                
                
                db_data = db_st.executeQuery();
                
                if(db_data.next()){
                  
                    session.setAttribute("login","ok");
                    response.sendRedirect("http://localhost:8080/WebApplication1/DB_Stockmag/stockmg_main.jsp");
                }else{
                    response.sendRedirect("http://localhost:8080/WebApplication1/DB_Stockmag/stockmg_RoginForm.jsp");
                }
            
                db_data.close();
                db_st.close();
                db_con.close();
                
                  RequestDispatcher dispatch = request.getRequestDispatcher("../stockmg_main");
		dispatch.forward(request, response);
               
                
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
