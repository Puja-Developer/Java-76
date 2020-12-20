package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {
	public static void main(String[] args) throws Exception{
		//1) Initialize MySQL JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2) Connect to MySQL "edureka" Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "");
		System.out.println("Connected to DB ");
		
		//3) Create an object for passing SQL Queries to DB
		Statement st = con.createStatement();
		
		//4) frame SQL query and pass the Query to DB
		String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table Created!");
		}catch(Exception ex) {
			System.out.println("Database Table could not be Created with ERROR: "+ex.toString());
		}
		
		//5) close the connection with DB
		st.close();
		con.close();
	}
}
