<%-- 
    Document   : DBtest_10-form
    Created on : 2017/10/18, 20:58:25
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
        <h1>Hello World!</h1>
        <form action ="/WebApplication1/DBtest_10" method="get">
       消去したいアカウントのIDを入力してください。<br>
       <input type="text" name="DeleteID"><br><br>
        <input type="submit" name="btnsubmit">
    </form>
    </body>
</html>
