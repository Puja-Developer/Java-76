package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args)throws Exception {
		
		Connection con = ConnectionFactory.getConnection(); 
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Anil',2500)";
		String sql = "insert into emp(empno,ename,sal) values(102,'Sunil',2500),(103,'Arun',3450),(104,'Sachin',5600),(105,'Rahul',3250)";
		
		try {
			int employees_saved = st.executeUpdate(sql);
			System.out.println("Employees Saved - "+ employees_saved);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		st.close();
		con.close();
	}
}
