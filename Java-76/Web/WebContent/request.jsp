<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("txtUid");
 pwd = request.getParameter("txtPwd");
 
 out.println("User Name = "+ uid+"<br>");
 out.println("Password = "+ pwd);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Method = <%=request.getMethod() %> <br>
Servlet Path = <%=request.getServletPath() %> <br>
Application = <%=request.getContextPath() %> <br>
Path = <%=request.getPathInfo() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Length = <%=request.getContentLength() %>
</h2>