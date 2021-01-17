<h2>
<%
 String uid = request.getParameter("txtUid");
 out.println("User Name = "+ uid);
 pageContext.setAttribute("name", uid, PageContext.SESSION_SCOPE);
%>
</h2>
<a href="pageContext2.jsp">Next Page</a>