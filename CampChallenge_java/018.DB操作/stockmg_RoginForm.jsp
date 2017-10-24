<%-- 
    Document   : DBtest_stock
    Created on : 2017/10/19, 18:59:33
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
        <h1>在庫管理システム＜ログイン＞</h1>
        <form action ="../stockmg_rogin" method ="get">
            ログインIDの入力<br>
            <input type ="text" name="stockID"><br>
            パスワードの入力<br>
            <input type ="text" name="password"><br>
            <input type="submit" name="btnsubmit">
    </form> 
    </body>
</html>
