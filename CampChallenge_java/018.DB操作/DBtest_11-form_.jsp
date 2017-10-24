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
        <form action ="/WebApplication1/DBtest_11" method="get">
      <アカウント情報の上書き(全て入力してください。><br>
      IDを入力<br>
       <input type="text" name="changeID"><br><br>
       プロフィール情報を入力<br><br>
       名前<br>
       <input type ="text" name="changeName"><br>
       電話番号<br>
        <input type ="text" name="changetel"><br>
        年齢<br>
        <input type ="text" name="changeage"><br>
        誕生日<br>
         <input type ="text" name="changebirthday"><br>
         所属<br>
         部署の選択<br>
            開発<input type="radio" name="changedepartmentID" value="1"><br>
            営業<input type="radio" name="changedepartmentID" value="2"><br>
            総務<input type="radio" name="changedepartmentID" value="3"><br>
         最寄り駅<br>
            九段下<input type="radio" name="changestationID" value="1"><br>
            永田町<input type="radio" name="changestationID" value="2"><br>
            渋谷<input type="radio" name="changestationID" value="3"><br>
            神保町<input type="radio" name="changestationID" value="4"><br>
            上井草<input type="radio" name="changestationID" value="5"><br>
            
         
       <input type="submit" name="btnsubmit">
    </form>
    </body>
</html>
