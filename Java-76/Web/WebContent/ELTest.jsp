<h2>
<%
 String uid = request.getParameter("txtU");
 out.println("User Name = "+ uid+"<br>"); 
%>
<hr>
<!-- using expression language in JSP2.0 -->
User Name = ${param.txtU}
</h2>