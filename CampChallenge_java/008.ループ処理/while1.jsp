<%-- 
    Document   : while1
    Created on : 2017/09/19, 18:04:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

double num =1000;

int count =0;

while(num >=100==true){
    num=num/2;
    count++;}

out.print(num+"<br>");

out.print(count+"回ループしました");
%>