package co.edureka.except;
class Logic{
	void bLogic() throws InterruptedException
	{
	 System.out.println("-- Business Logic --");
	 //logic 
	}
}

public class ThrowsTest {
	public static void main(String[] args) throws InterruptedException{
		Logic obj = new Logic();
		/*
		try {
		 obj.bLogic();
		}catch(Exception ex) {}
		*/
		obj.bLogic();
	}
}
