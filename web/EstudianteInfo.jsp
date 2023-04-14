<%-- 
    Document   : EstudianteInfo
    Created on : 14/04/2023, 01:45:04 PM
    Author     : Diego
--%>

<%@page import="java.util.Date"%>
<%@page import="co.unipiloto.clases.NameHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola!</title>
        <style>
            body {
                background-color: #b3cde0;
            }
            p {
                font-family: monospace;
                color: #cc0000;
                font-size: 16px;
                display: inline;
            }
        </style>
    </head>
    <body>
        <jsp:useBean id="myBean" scope="session" class="co.unipiloto.clases.NameHandler" />
        <jsp:setProperty name="myBean" property="name" /> 
        <jsp:setProperty name="myBean" property="fecha_nacimiento"/>
        <% String saludo = myBean.saludo();%> <%=saludo%> <p><jsp:getProperty name="myBean" property="name" /></p>, su fecha de nacimiento es: <p><jsp:getProperty name="myBean" property="fecha_nacimiento" /></p>
        <%String edad = myBean.edad();%>, y su edad es: <p><%=edad%></p>
    </body>
</html>
