/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "methodmodori2", urlPatterns = {"/methodmodori2"})
public class methodmodori2 extends HttpServlet {
    
    //dataメソッドを作成  
    String[] data(){   //datas配列を作成し値を4つ入れる
              String[] datas = {"0123","松永久秀","2/9","大和国"};
      //data()メソッドを呼び出すとdatas配列が返却される。
      return datas;
      }
          
   
      
    

    
           
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           //data1配列を宣言(初期値無し）data1にdata()メソッドを呼び出させている。
           String[] data1=data();
           
           out.print("名前は"+data1[1]+"<br>");
           out.print("誕生日は"+data1[2]+"<br>");
           out.print("住所は"+data1[3]+"<br>");
           
           
           
           
           
          
           
            
            
            
            
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet methodmodori2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet methodmodori2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

    private static class HashMap<T0, T1> {

        public HashMap() {
        }
    }

}
