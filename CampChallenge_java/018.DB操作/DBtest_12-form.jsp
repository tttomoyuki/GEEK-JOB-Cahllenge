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
        <form action ="../DBtest_12" method="get">
        <アカウント情報の検索(全て入力してください）><br><br>
            
     
       プロフィール情報を入力<br><br>
       名前<br>
       <input type ="text" name="searchName"><br>
       年齢<br>
        <input type ="text" name="searchage"><br>
       誕生日<br>
         <input type ="text" name="searchbirthday"><br>
         
         
       <input type="submit" name="btnsubmit">
    </form>
    </body>
</html>
