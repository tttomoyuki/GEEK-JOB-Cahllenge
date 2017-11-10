<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    ArrayList<UserDataDTO> UDD = (ArrayList)request.getAttribute("resultData");
    HttpSession hs =request.getSession();
   hs.setAttribute("udd",UDD.get(0));
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <tr>
                <%for(int i=0;i<UDD.size();i++){%>
                <td><a href="ResultDetail?id=<%=UDD.get(i).getUserID()%>"><%= UDD.get(i).getName()%></a></td>
                <td><%= UDD.get(i).getBirthday()%></td>
                <td><%= UDD.get(i).getType()%></td>
                <td><%= UDD.get(i).getNewDate()%></td>
                
                <%}%>
            </tr>
        </table>
    </body>
    <%=jh.home()%>
</html>
