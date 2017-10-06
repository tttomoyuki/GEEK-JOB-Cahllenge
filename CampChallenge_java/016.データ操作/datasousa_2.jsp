<%-- 
    Document   : datasousa_2
    Created on : 2017/10/05, 20:07:50
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <form action ="./datasousa_test2.jsp"method="post">
            <!--select要素フォーム--!>
        <select name="example">
            <!--jspページでYesを選ぶと"はい"が、Noを選ぶと"いいえ"が表示される--!>
            <option value="はい">Yes</option>
            <option value="いいえ">No</option>
            
             <input type="submit" name="btnSubmit">
        </form>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
