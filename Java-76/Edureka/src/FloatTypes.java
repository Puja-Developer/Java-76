
public class FloatTypes {

	public static void main(String[] args) {
		//float sal = 2500.5; //error
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float)2500.5; //explicit typecasting
		System.out.println("My Salary = " + sal);

		double data = 25005;
		System.out.println(data);
		
		float index = 2500.841124f; 
		System.out.printf("%.2f",index);
	}

}
