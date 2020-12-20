package co.edureka.jdbc;

import java.util.List;

import co.edureka.jdbc.dao.EmployeeDAO;
import co.edureka.jdbc.dao.EmployeeDAOFactory;
import co.edureka.jdbc.entity.Employee;

public class Main {

	public static void main(String[] args) throws Exception
	{		
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		/*
		//to save an Employee
		Employee emp = new Employee(106,"Charles",5585.75f);
		dao.saveEmp(emp);
		
		//to update an Employee
		emp = new Employee(102,"Sunil Joseph",7250f);
		dao.updateEmp(emp);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee No: ");
		int eno = sc.nextInt();
		Employee em = dao.searchEmployee(eno);
		if(em != null)
			System.out.println(em);
		else
			System.out.println("No matching employee for Emp No : "+ eno);
		
		System.out.print("enter an employee to delete: ");
		eno = sc.nextInt();
		dao.deleteEmp(eno);
		*/
		
		//to get all employess
		List<Employee> employees = dao.getEmployees();
		for(Employee emp : employees) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}
}
