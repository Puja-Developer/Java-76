class Employee 
{
	/*--- instance variables ---*/
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Naveen";
		sal = 5000f;
	}

	void printDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}
} //Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		//create an instance of Employee
		Employee emp = new Employee();

		//accessing the state of Employee object
		System.out.println(emp.empno + " | "+ emp.name+" | "+emp.sal);

		//1) change the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;

		emp.printDetails();

		//2) change the state of object using method
		emp.setDetails();
		emp.printDetails();
	}
}