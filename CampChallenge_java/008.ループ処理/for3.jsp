<%-- 
    Document   : for3
    Created on : 2017/09/19, 17:43:51
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int answer =0;

int bairitu=1;

for(int i=1; i<=100; i++){
answer=answer+bairitu;
        
bairitu=bairitu+1;       

out.print(answer+"<br>");}

out.print(answer);

%>
