<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userName, email;%>
<%
userName=request.getParameter("username");
email=request.getParameter("email");
%>


<h3> Hello <%userName %> your email is <%= email %> <h3>
<h3>Hello again <%person.getUserName() %> your email is <%person.getEmail() %></h3>
<jsp:userBean id="p1" class="com.revature.jsp.Person"></jsp:userBean>
<jsp:setProperty property="*" name="p1" value="<%=userName%>"/>
 "Displaying<jsp:getProperty property="userName" name="p1"/>



</body>
</html>