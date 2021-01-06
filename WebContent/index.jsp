<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Iniciar Sesion</title>


</head>
<body>


<form action="/SonetProyecto/InicioSesion" method="post">

<input type="email" name="correo" placeholder = "correo electronico" required /> <br />

<input type="password" name="contrasenia" placeholder = "Contrasena" required/> <br />

<input type="submit" value="Iniciar Sesion" name="btn_inicioSesion" id="btn"  />


</form>
</body>
</html>