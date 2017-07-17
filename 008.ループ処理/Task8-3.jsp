<%-- 
    Document   : Task8-3
    Created on : 2017/07/17, 23:16:47
    Author     : Tomoharu Fujii
--%>

<%
int number = 0;
for(int x = 1; x <= 100; x++){
    out.println(number + "+" + x + "は");
    number = number + x;
    out.println(number);
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
