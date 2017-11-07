<%-- 
    Document   : searchresult_2
    Created on : 2017/11/07, 14:53:55
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
    HttpSession HS =request.getSession();
    if(HS!=null){HS.getAttribute("select");
    ArrayList<String> select = (ArrayList<String>)HS.getAttribute("select");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
         <form action="insertresult" method="POST">
             <input type="radio" name="type" 
                    id="check01">>さくら<label>
                     value="1">エンジニア<br>
             
             <input type="submit" name="name" value="">
                    
        </form>
    </body>
</html>
