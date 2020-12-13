package co.edureka;

import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {
	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sin(0));
		out.println(cos(0));
		
		out.println(sqrt(25));
		
		out.println(pow(5,3));
		
		out.println(min(10,20));
		System.out.println(max(10,20));
		
		System.out.println(Math.floor(10.9)); //10.0
		System.out.println(Math.ceil(10.1)); //11.0
		
		double rand = Math.random();
		int otp = (int)(rand*10000);
		System.out.println("OTP = "+ otp);
	}

}
