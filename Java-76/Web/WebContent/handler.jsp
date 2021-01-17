<%@page isErrorPage="true" %>
<body style="background-color:#200;color:white">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("Calculation Issue: "+ exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Invalid Array Index: "+ exception.getMessage());
 else
	 out.println("Internal Server Error!");
%>
</h2>
</body>