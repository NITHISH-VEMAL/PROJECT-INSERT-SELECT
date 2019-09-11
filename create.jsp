<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Insert" method="post">

	<select name="type">
	  <option value="marriage">Marriage</option>
  	  <option value="bday">birthday party</option>
      <option value="reunion">Reunion</option>
 	</select><br>
 	
 	<input type="text" name="for"><br>
 	<input type="text" name="desc"><br>
 	
 	<input type="submit" value="Submit"><br>

</form>

</body>
</html>