<%!
  String name ="edureka";

  public int add(int x, int y){
	  int sum = x+y;
	  return sum;
  }
%>
<h2>
Name = <%=name %>
<br><br>
<%="Sum = " + add(12,34) %>
</h2>