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
@WebServlet(name = "method5on2", urlPatterns = {"/method5on2"})
public class method5on2 extends HttpServlet {

   String[] data(int ID){   //引数がIDのdataメソッドを作成
              String[] data1 = {"0123","松永久秀","2/9","奈良"};
              String[] datas2 = {"0124","佐久間信盛","2/10",null};
              String[] datas3 = {"0125","明智光秀","2/11","岐阜"};
              String[] dataselse = {"不明","不明","不明","不明"};
              
           
              
              
              
              switch(ID){
                  case 0: 
                      return data1;
                     
                  case 1:
                      return  datas2;
                      
                  case 2:
                      return datas3;
                  default:
                      return null;
              }}
        
              
                 
                 
         protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
           
          
           
           
          for(int i=0;i<3;i++){
           
           String[] datas=data(i);       
    
          for(int z=1;z<=3;z++){
              
            if(datas[z]==null){
          continue;
            }else{
              out.print(datas[z]);}
          }
          }
            
            
          
        
          
          
           
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet method5on2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet method5on2 at " + request.getContextPath() + "</h1>");
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

}
