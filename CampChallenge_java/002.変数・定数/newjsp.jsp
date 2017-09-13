<%-- 
    Document   : newjsp
    Created on : 2017/09/13, 15:07:51
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int age =21;

String name="タケダトモユキ";
String like="インドカレー";

out.print("こんにちは、私の名前は");
       
out.print(name);

out.print("です");

out.print("好きな食べ物は");

out.print(like);

out.print("です");

out.print("私は");

out.print(age);

out.print("歳です");

%>
