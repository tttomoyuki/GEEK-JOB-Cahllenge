<%@page import="jums.UserDataDTO"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd =(UserDataDTO)request.getAttribute("udd");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        
        <h1>変更結果</h1><br>
        名前:
        <%=udd.getName()%><br>
        生年月日:
        <%=udd.getBirthday()%><br>
        種別:
        <%=udd.getType()%> <br>
        電話番号:
        <%=udd.getTell()%><br>
        自己紹介:
        <%=udd.getComment()%><br>
        以上の内容で更新しました。<br>
       
    </body>
    <%=jh.home()%>
    </body>
</html>
