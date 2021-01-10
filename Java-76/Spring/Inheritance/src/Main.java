import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		Student st1 = (Student)ctx.getBean("stud1");
		System.out.println(st1);
		
		Student st2 = (Student)ctx.getBean("stud2");
		System.out.println(st2);
	}

}
