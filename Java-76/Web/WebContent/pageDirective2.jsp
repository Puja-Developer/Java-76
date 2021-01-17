<%@page errorPage="handler.jsp" %>
<%!
 int x=10,y=10,z;
 int[] n = new int[6];
%>
<h2>
<%
 z = x/y;
 out.println(x+" / "+y+" = "+z+"<br>");
 out.println(n[15]);
%>
</h2>