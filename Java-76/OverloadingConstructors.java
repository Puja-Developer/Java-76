class Employee
{
	int empno;
	String name;
	float sal;

	Employee(){}

	Employee(int empno, String name){
		this.empno = empno;
		this.name = name;
	}

	Employee(int a, String s, float f){
		this(a,s); //constructor chaining
		/*
		empno = a;
		name = s;
		*/
		sal = f;
	}

	void printDetails(){
		System.out.println(this.empno+" | "+this.name+" | "+this.sal);
	}  
}

class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
                  
      Employee emp1 = new Employee();
      Employee emp2 = new Employee(101,"Sunil");
      Employee emp3 = new Employee(102,"Naveen",2500.5f);

      emp1.printDetails();
      emp2.printDetails();
      emp3.printDetails();
	}
}