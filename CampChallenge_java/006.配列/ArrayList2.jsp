<%-- 
    Document   : ArrayList2
    Created on : 2017/09/14, 21:32:09
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%
 ArrayList<String>data= new ArrayList<String>();
 
data.add("10");

data.add("100");

data.add("soeda");

data.add("hayasi");

data.add("-20");

data.add("118");

data.add("END");

data.set(2,"33");

out.print(data.get(2));






%>