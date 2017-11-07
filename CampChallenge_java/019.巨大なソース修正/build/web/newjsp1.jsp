<%-- 
    Document   : newjsp1
    Created on : 2017/11/07, 13:20:42
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<String> select = new ArrayList<String>();
    select.add("た");
    select.add("け");
    select.add("だ");
    select.add("と");
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            
           int size = select.size();
           int num = 0;
          for(num =0; num<size; num++){
            out.println("名前:");    
            out.println(select.get(num));
            num=num+1;
            out.println("誕生日:");
            out.println(select.get(num));
             num=num+1;
            out.println("種別:");
            out.println(select.get(num));
             num=num+1;
            out.println("登録日:");
            out.println(select.get(num)+"<br>");
        }
            %>
    </body>
</html>
