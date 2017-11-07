<%-- 
    Document   : searchresult
    Created on : 2017/11/06, 10:17:31
    Author     : guest1Day
--%>

<%@page import="jums.JumsHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession hs1 = request.getSession();
    
    %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索.削除画面</title>
    </head>
    <body>
        <form action="searchresult" method="GET">
            あなたの登録情報を確認します。<br><br>
            名前.生年月日.種別を入力してください。<br><br>
            未入力の場合は全ての登録データを表示します。<br><br><br>
            
            
         名前:
          <input  type="text" name="name" value="">
          <br><br>
          
          生年月日:
          
           <select name="year">
              <option value="">----</option>
              <%
                  for(int i = 1995; i<=2010; i++){%>
                  <option value="<%=i%>"><%=i%></option>
                  <%}%>
          </select>年
          
          <select name="month">
              <option value="">----</option>
              <%
                  for(int i = 1; i<=12; i++){%>
                  <option value="<%=i%>"><%=i%></option>
                  <%}%>
          </select>月
          
          <select name="day">
              <option value="">----</option>
              <%
                  for(int i = 1; i<=12; i++){%>
                  <option value="<%=i%>"><%=i%></option>
                  <%}%>
          </select>日
          <br><br>
          種別:
          <br>
          <input type="radio" name="type" value="1">エンジニア<br>
          <input type="radio" name="type" value="2">営業<br>
          <input type="radio" name="type" value="3">その他<br>
          <br><br>
          
        <input type="submit" name="btnSubmit" value="確認画面へ">
        </from>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
