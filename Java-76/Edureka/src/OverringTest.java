class Employee{
	int empno;
	String name;
	float sal;
	
	public Employee(int empno, String name, float sal) {	
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [" + empno + " | " + name + " | " + sal + "]";
	}		
}

public class OverringTest {
	public static void main(String[] args) {
		Employee emp = new Employee(101,"edureka",2500f);
		System.out.println("Type of emp = "+ emp.getClass().getName());
		System.out.println(emp); //toString()
	}
}
