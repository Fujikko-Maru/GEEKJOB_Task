<%-- 
    Document   : Task5-3
    Created on : 2017/07/17, 22:54:24
    Author     : Tomoharu Fujii
--%>

<%
    char x = 'あ';
    switch(x){
        case 'A':
            out.println("英語");
            break;
        
        case 'あ':
            out.println("日本語");
            break;
        
        default:
            out.println(" ");
            break;
    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
