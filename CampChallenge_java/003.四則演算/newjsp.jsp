<%-- 
    Document   : newjsp
    Created on : 2017/09/13, 15:07:51
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
final int BASE = 100;

int num = 5;


int plus = BASE + num;

int minus = BASE - num;

int times = BASE * num;

int divided = BASE / num;

int remnant = BASE % 3;

out.print(plus);

out.print(minus);

out.print(times);

out.print(divided);

out.print(remnant);

out.print(remnant);

%>
