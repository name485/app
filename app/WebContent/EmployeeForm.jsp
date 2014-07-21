<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
<form action="./save.do">
<table>
<tr>
  <td>
Employee ID <input type="text" name="eId">
  </td>
</tr>
<tr>
  <td>
Employee name <input type="text" name="eName">
  </td>
    <td>
Employee salary <input type="text" name="esalary">
  </td>
</tr>
<tr>
  <td>
<input type="submit" value="submit">
  </td>
</tr>
</table>
</form>
</body>
</html>