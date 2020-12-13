class A{
	final void display(){}
}

class B extends A{
	//void display(){}
}

class FinalTest 
{
	//final FinalTest(){} //error: modifier final not allowed here

	final int n = 25; //instance variable
	static int data = 45;

	public static void main(String[] args) 
	{
		final int n = 12; //local variable
		System.out.println(n);

		//n = 13; //cannot assign a value to final variable
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);

		//obj.n = 25; //cannot assign a value to final variable
		System.out.println(obj.n);
		System.out.println(data);
	}
}
