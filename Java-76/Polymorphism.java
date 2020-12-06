class A{
	void display(){
		System.out.println("In class A");
	}
}

class B extends A{
	@Override
	void display(){
		System.out.println("In class B");
	}
}


class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		A obj = new B(); //the type of the object is decided at runtime , rather than compile time - runtime polymorphism
		obj.display();
	}
}
