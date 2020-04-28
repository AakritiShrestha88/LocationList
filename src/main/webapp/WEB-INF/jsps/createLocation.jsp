<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Location</title>
</head>
<body>
<form action ="saveLoc" method="post">
<pre>
Id:<input type="text" name="id"/>
Code:<input type="text" name="code"/>
Name:<input type="text" name="name"/>
Type: Urban<input type="radio" name="type" value="URBAN"/>
      Rural<input type="radio" name="type" value="RURAL"/>
      <!-- //if we dnot do value in radio button than both will be on if we give value than one will be on -->
      <input type="submit" value="save"/>
      </pre>
</form>
${message}
<a href="displayLocations">View All</a>
</body>
</html>