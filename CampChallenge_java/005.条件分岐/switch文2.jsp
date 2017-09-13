<%-- 
    Document   : newjsp1
    Created on : 2017/09/13, 21:33:26
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
char language=('A');


switch(language){
    case ('A'):
        out.print("英語");
        break;
      
        
    case('あ'):
        out.print("日本語");
        break;
   
     default:
        break;

}
    %>
                
        
            
    
      
