
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <jsp:useBean id="Registrara" scope="session" class="com.basico.Registro">
    <jsp:setProperty name="Registrara" property="nom" param="nom"/>
    <jsp:setProperty name="Registrara" property="uni" param="uni"/>
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Bienvenida Page</h3>

<jsp:getProperty  name="Registrara" property="nom"/>
<jsp:getProperty  name="Registrara" property="uni"/>
</body>
</html>