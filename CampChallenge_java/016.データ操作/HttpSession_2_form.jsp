<%-- 
    Document   : HttpSession_2_form
    Created on : 2017/10/08, 13:44:18
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/WebApplication1/HttpSession_2" method="post">
            <!--formタグで括られた入力項目はこれら-->
            名前の入力<br>
            <input type="text" name="txtName"><br>
            性別の選択<br>
            男<input type="radio" name="rdoSample" value="男"><br>
            女<input type="radio" name="rdoSample" value="女"><br>
            趣味は何ですか？<br>
            <textarea name="mulText" ciks="50" rows="10" >
            </textarea>
            <br>
            <input type="submit" name="btnSubmit">
            
                   
            
            
            
            
        </form>
        
    </body>
</html>
