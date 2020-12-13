package co.edureka.except;

public class ThrowTest {

	public static void main(String[] args) {
		try {
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide an integer by 0");
		}
		catch(Exception ex) {
			System.out.println("Message: "+ ex.getMessage());
			System.out.println(ex.toString());			
		}
	}

}
