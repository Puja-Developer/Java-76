package co.edureka;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.dao.EmployeeDAO;
import co.edureka.entity.Employee;

public class Main {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	 
	 EmployeeDAO dao = context.getBean("empdao", EmployeeDAO.class);
	 
	 //to insert a new Employee
	 Employee emp = new Employee(110,"Rajeen",8500f);
	 dao.saveEmp(emp);
	 
	 //to update an Employee
	 emp = new Employee(101,"Anil Kumar",8525.5f);
	 dao.updateEmp(emp);
	 
	 //to delete an Employee
	 Scanner sc = new Scanner(System.in);
	 System.out.print("enter an employee number to delete: ");
	 int eno = sc.nextInt();
	 dao.deleteEmp(eno);
	 System.out.println("---------------------------------------");
	 
	 
	 List<Employee> emps = dao.getEmployees();
	 for(Employee e : emps) {
		 System.out.println(e);
	 }
 }
}
