package co.edureka;

public class Main {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator(); 
		Nums obj = locator.getNums();
		
		System.out.println("Sum = "+ obj.addNum(10, 21));
		System.out.println("Diff = "+ obj.subNum(20.5f, 9.2f));
	}
}
