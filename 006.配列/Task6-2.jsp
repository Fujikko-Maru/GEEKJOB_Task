<%-- 
    Document   : Task5-4
    Created on : 2017/07/16, 22:57:21
    Author     : Tomoharu Fujii
--%>

<%@ page import = "java.util.ArrayList" %>

<%
    ArrayList<String> datas = new ArrayList<String>();
    
    datas.add("10");
    datas.add("100");
    datas.add("soeda");
    datas.add("hayashi");
    datas.add("-22");
    datas.add("30");
    out.println("変更前の配列は" + datas);
    
    datas.set(2, "33");
    out.println("変更後の配列は" + datas);
        
 
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
