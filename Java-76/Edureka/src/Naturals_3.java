
public class Naturals_3 {

	public static void main(String[] args) {		
		printNaturals(); //method call
		printNaturals(); //method call
		printNaturals(); //method call		
	} //main method ends
	
	//method definition to display first 10 Natural numbers
	static void printNaturals() {
		System.out.println("First 10 Natural Numbers are: ");
		
		for(int n=1;n<=10;n++)
		{
			if(n==10) {
				System.out.println(n+".");
			}
			else {
				System.out.print(n + ", ");
			}		
		}
	} //printNaturals method ends

} //class ends
