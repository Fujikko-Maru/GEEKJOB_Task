<%-- 
    Document   : Task6-1
    Created on : 2017/07/16, 23:02:03
    Author     : Tomoharu Fujii
--%>

<%@ page import = "java.util.HashMap" %>

<%
    HashMap<Integer, String> data1 = new HashMap<Integer, String>();
    HashMap<String, String> data2 = new HashMap<String, String>();
    HashMap<String, Integer> data3 = new HashMap<String, Integer>();
    HashMap<Integer, Integer> data4 = new HashMap<Integer, Integer>();
    
    data1.put(1, "AAA");
    data2.put("hello", "world");
    data3.put("soeda", 33);
    data4.put(20, 20);
    
    out.println(data1.get(1));
    out.println(data2.get("hello"));
    out.println(data3.get("soeda"));
    out.println(data4.get(20));
    
    
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
