<%-- 
    Document   : searchresult
    Created on : 2017/11/07, 12:56:29
    Author     : guest1Day
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    HttpSession HS =request.getSession();
    HS.getAttribute("select");
    ArrayList<String> select = (ArrayList<String>)HS.getAttribute("select");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>検索結果</title>
    </head>
    <body>
        検索結果を表示します <br><br><br>
        
        <% 
           int size = select.size();
           int num = 0;
           int number = 1;
          for(num =0; num<size; num++){
            out.println(number+":");  
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
            out.println(select.get(num)+"<br>"+"<br>");
            number=number+1;
        }
            %>
            
    </body>
</html>
