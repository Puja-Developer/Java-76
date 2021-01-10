package co.edureka;

import org.springframework.beans.factory.annotation.Autowired;

public class B {
	@Autowired
	A aObj;	

	public void methodB() {
		System.out.println("B class method");
		aObj.methodA();
	}
}
