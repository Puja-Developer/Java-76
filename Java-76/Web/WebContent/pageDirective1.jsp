<%@page import="java.util.Date" %>
<%!
 Date today;
%>
<h2 style="text-align:center">
<%
 today = new Date();
 out.println(today);
%>
</h2>