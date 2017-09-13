<%-- 
    Document   : newjsp1
    Created on : 2017/09/13, 21:09:04
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
 int type=1;

switch(type){
    
    case 1:
       out.print("one");
       break;
       
    case 2:
       out.print("two");
       break;
       
    default: 
       out.print("想定外");
       break;
}
%>