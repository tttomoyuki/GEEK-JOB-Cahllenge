<%-- 
    Document   : stockmg_regi
    Created on : 2017/10/20, 19:55:14
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>在庫管理システム<商品の登録></h1>
        <form action ="/WebApplication1/NewServlet11" method ="get">
            在庫Noの設定<br>
            <input type = "text" name="stockNo"><br>
            <br>
            在庫の名前の設定<br>
            <input type ="text" name="stockName"><br>
            <input type="submit" name="btnsubmit">
        </form>
    </body>
</html>
