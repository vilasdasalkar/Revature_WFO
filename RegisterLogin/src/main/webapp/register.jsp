<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="regFrom" method="post">
   Name:<input type="text" name="name1"/><br/><br/>
   Email:<input type="text" name="email1"/><br/><br/>
   Password:<input type="password" name="pass1"/><br/><br/>
   Gender:<input type="radio" name="gender1" value="Male"/>Male<input type="radio" name="gender1" value="Female"/> Female<br/><br/>
  
  
  
  
  
  city:<select name="city1">    
  
  <option value="select city">select city</option>    
  <option value="delhi">delhi</option>    
  <option value="Mumbai">Mumbai</option>    
  <option value="Pune">Pune</option>    
  <option value="Hyderabad">Hyderabad</option>    
  <option value="Bangalore">Bangalore</option>
  
  </select><br/><br/>
   <input type="submit" value="Register"/>
   </form>
   
   

</body>
</html>