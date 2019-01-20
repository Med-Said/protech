<%-- 
    Document   : result
    Created on : Jan 19, 2019, 3:08:15 PM
    Author     : Med Said M'bareck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
         String v1 = request.getParameter("v1");
         String v2 = request.getParameter("v2");
         
         int num1 = Integer.parseInt(v1);
         int num2 = Integer.parseInt(v2);
       
        %>
    </head>
    <body>
        <h1>compare!</h1>
        <%
        if(num1>num2)
        {
        
        out.print(num1+" est superieur a "+num2);
        }
        else{
            out.print(num2+" est superieur a "+num1);
        }
        
        %>
    </body>
</html>

















































<!--int num1 = Integer.parseInt(v1);
         int num2 = Integer.parseInt(v2);
         
         if(num1 > num2){
             System.out.println(num1 + ">" + num2);
         }else{
             System.out.println(num2 + ">" + num1);
         }-->