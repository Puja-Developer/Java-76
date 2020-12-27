<%!
  String name ="edureka";

  public int add(int x, int y){
	  int sum = x+y;
	  return sum;
  }
%>
<h2>
<%
 out.println("My Name is "+ name+"<br>");
 out.println("Sum = "+ add(10,20));
%>
</h2>