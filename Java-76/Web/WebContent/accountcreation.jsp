<jsp:useBean id="acc" class="co.edureka.Account"></jsp:useBean>
<jsp:setProperty name="acc" property="*"/>

<h2>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
Name: <jsp:getProperty property="name" name="acc"/> <br>
Balance: <jsp:getProperty property="bal" name="acc"/> <br>


<hr>
<jsp:setProperty property="acno" name="acc" value="10005124"/>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
</h2>