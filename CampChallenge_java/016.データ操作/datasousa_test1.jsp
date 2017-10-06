<%-- 
    Document   : datasouda_test1
    Created on : 2017/10/05, 19:32:25
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    request.setCharacterEncoding("UTF-8");
    
out.print(request.getParameter("txtName")+"<br>");

out.print(request.getParameter("rdoSample")+"<br>");

out.print(request.getParameter("mulText"));

    


%>
    

    
