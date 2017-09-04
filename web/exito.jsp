<%-- 
    Document   : exito
    Created on : 09-04-2017, 03:14:01 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.modelo.Empleado" %>
<!DOCTYPE html>

<%-- 
    agregar import 
y  agregar scriblest
--%>

<%
    //se hara un castin em se covierte en tipo Empleado
    Empleado em=(/*casting*/Empleado)request.getSession().getAttribute("empleado");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Empleado</h1>
        <p>Codigo: <%= em.getCodigo() %></p>
        <p>Nombre :<%= em.getNombre()%></p>
        <p>Edad :<%= em.getEdad()%></p>
        <p>Genero :<%= em.getGenero()%></p>
        <p>Cargo :<%= em.getCargo()%></p>
        <p>Intereses: 
            <%
                for(int i=0;i<em.getIntereses().length;i++)
                {
                    out.print(em.getIntereses()[i]+"<br>");
                }
            %></p>
        <p>Sueldo <%= em.getSueldo()%></p>
    </body>
</html>
