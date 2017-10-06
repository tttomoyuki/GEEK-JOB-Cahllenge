<%-- 
    Document   : quest_1
    Created on : 2017/10/05, 20:54:14
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
        総額<br>
        <form action ="./questling_1.jsp" method="get">
            
            <input type="number" name="total"><br>
                個数<br>
            <input type="number" name="count"><br>
             
            商品種別<br>
            <input type="radio" name="type" value="1:雑貨">雑貨<br>
            <input type="radio" name="type" value="2：生鮮食品">生鮮食品<br>
            <input type="radio" name="type" value="3：その他">その他<br>
           
            <input type="submit" name="btnSubmit" value="送信">
            <input type="reset" name="rstSubmit" value="リセット">
            
        </form>
        </body>
</html>
