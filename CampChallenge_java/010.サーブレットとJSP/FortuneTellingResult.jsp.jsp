<%-- 
    Document   : rgn jsp
    Created on : 2017/09/21, 18:09:29
    Author     : guest1Day
--%>

<%@page import="org.mypackage.sample.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    
ResultData data = (ResultData)request.getAttribute("DATA");

%>

<meta http-equiv="contentType" content="test/html: charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<%
    if(data != null){
        out.print("<h1>あなたの"+data.getD() +"の運勢は"+data.getLuck()+"です<h1>");
        
    }
    %>
   </body>
</html>