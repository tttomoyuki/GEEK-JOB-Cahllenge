<%-- 
    Document   : Map1
    Created on : 2017/09/14, 21:41:50
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>

<%
HashMap<String,String> geek= new HashMap<String,String>();

geek.put("1","AAA"); 

geek.put("hello", "world");

geek.put("soeda","33");

geek.put("20", "20");

out.print(geek.get("1"));


%>



