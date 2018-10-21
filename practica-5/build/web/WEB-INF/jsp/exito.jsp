<%-- 
    Document   : exito
    Created on : Oct 12, 2018, 5:56:42 AM
    Author     : Lino
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito</title>
    </head>
    <body>
        <h1>Todo OK!</h1>
        <br>
        <p>Nombre: ${requestScope.estudiante.nombre}</p>
        <p>Carrera: ${requestScope.estudiante.carrera}</p>
        <p>Fecha de nacimiento: ${requestScope.estudiante.fechanac}</p>
        <p>Contraseña: ${requestScope.estudiante.contra}</p>
        <p>Correo electrónico: ${requestScope.estudiante.correoe}</p>
    </body>
</html>