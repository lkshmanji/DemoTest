<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration Form</h1>
<pre>
<form:form action="./save.htm" modelAttribute="s" method="Post">
<table border="2">
  <tr>
    <th>Student ID</th>
    <td><form:input path="sid"/></td>
  </tr>
  
   <tr>
    <th>Student NAME</th>
    <td><form:input path="name"/></td>
  </tr>
   <tr>
    <th>Student Email</th>
    <td><form:input path="email"/></td>
  </tr>
  
   <tr>
    <th>Select your  Gender</th>
    <td><form:radiobuttons path="gender" items="${gender}"/></td>
  </tr>
  
   <tr>
    <th>Cousre Timing</th>
    <td><form:checkboxes path="timing" items="${timing}"/></td>
  </tr>
  
  <tr>
    <th>Select Your Course</th>
    <td><form:select path="course">
    <form:option value="" label="Select Your Course"/>
    <form:options items="${course}"/>
    </form:select>
    </td>
  </tr>
  
  

  
  <tr>
  <th>Ente The Address</th>
  <td><form:textarea path="address" cols="15" rows="7"/></td>
  
  </tr>
  
  <tr>
  <th>Ente The Password</th>
  <td><form:password path="password" /></td>
  
  </tr>
   <tr>
  
  <td><input type="reset" value="reset"></td>
   <td><input type="submit" value="Login"></td>
  
  </tr>
  
  
  
  
 
</table>






</form:form>
</pre>
</body>
</html>