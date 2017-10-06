<%-- 
    Document   : questling_2
    Created on : 2017/10/06, 21:25:31
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
 request.setCharacterEncoding("UTF-8");
 
int i = Integer.parseInt(request.getParameter("num"));

int d = i;



while(d > 1){      //dnが1より大きければ繰り返す
                if(d % 2 == 0){        //dnを2で割った時あまりは0
                    out.print("2, ");
                    d /= 2;
                }else if(d % 3 == 0){      //dnを3で割った時あまりは0
                    out.print("3, ");
                    d /= 3;
                }else if(d% 5 == 0){      //dnを5で割った時あまりは0
                    out.print("5, ");
                    d /= 5;
                }else if(d % 7 == 0){      //dnを7で割った時あまりは0
                    out.print("7, ");
                    d /= 7;
                }else{
                    
                    break;
                }
            }
out.print("元々の値は"+i);
out.print("余りは" + d);   





%>
