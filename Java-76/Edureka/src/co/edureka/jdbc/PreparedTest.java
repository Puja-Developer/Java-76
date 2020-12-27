package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
				
		Scanner sc = new Scanner(System.in);
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		   	System.out.println("enter empno, name, salary:");
		   	int eno = sc.nextInt();
		   	String name = sc.next();
		   	float sal = sc.nextFloat();
		   	
		   	pst.setInt(1, eno);
		   	pst.setString(2, name);
		   	pst.setFloat(3, sal);
		   	
		   	int n = pst.executeUpdate();
		   	if(n>0)
		   		System.out.println("Employee Saved");
		   	System.out.print("Do you want to add more employees: ");
		   	req = sc.next();
		}//loop
		
		sc.close();
		pst.close();
		con.close();
	}
}
