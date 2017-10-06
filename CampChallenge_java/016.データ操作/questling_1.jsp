<%-- 
    Document   : questling_1
    Created on : 2017/10/06, 20:55:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

    request.setCharacterEncoding("UTF-8");

int i = Integer.parseInt(request.getParameter("total"));
int c = Integer.parseInt(request.getParameter("count"));
int t = i/c;
out.print("商品種別は");

out.print(request.getParameter("type")+"<br>");
        
        
out.print("1個当たりの値段は"+t+"となります。"+"<br>");

if(i>=5000){
    double p5 = i*0.05;
    out.print(p5+"ポイントが付きます。");
}else if(i>=3000){
    double p4 = i*0.05;
    out.print(p4+"ポイントが付きます。");
}else{
    out.print("ポイントは付きません。");
}






    %>
    
   