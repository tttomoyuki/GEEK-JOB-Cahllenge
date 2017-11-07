<%-- 
    Document   : newjsp
    Created on : 2017/11/05, 13:59:07
    Author     : guest1Day
--%>

<%@page import="java.util.Calendar"%>
<%@page import="jums.UserDataBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
   Calendar birthday = Calendar.getInstance();
    birthday.set(1996,02,9,0,0,0);
    
    
    %>
    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%=birthday.getTime()%>
    </body>
</html>
