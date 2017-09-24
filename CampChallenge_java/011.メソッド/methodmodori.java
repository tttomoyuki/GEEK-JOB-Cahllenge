
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



 
@WebServlet(name = "練習用", urlPatterns = {"/___"})
public class method extends HttpServlet {
    
    
    

  
     boolean myprf(PrintWriter pw){
     
       pw.print("私の名前は武田です"+"<br>");
       pw.print("歳は21です"+"<br>");
       pw.print("好きな食べ物はインドカレーです"+"<br>"); 
       return true;
     
    }
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
          for(int i=0;i<10;i++){
                  
                myprf(out);}
          if (myprf(out)==true){
              out.print("この処理は正しく実行できました");
          }else{
              out.print("この処理は正しく実行できませんでした");
          }
              
            
            
            
            
            
            
              
            
         
               
       
           

            
            
            
            
            
            
            
            
            
                  
            
            
            
             
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet 練習用</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet 練習用 at " + request.getContextPath() + "</h1>");
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


