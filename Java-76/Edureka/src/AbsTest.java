
public class AbsTest {

	public static void main(String[] args) {
		//Shape s = new Shape(); //CE
		
		Shape s= null;
		
		s= new Circle("Yellow",5.6f);
		System.out.println("Color = "+ s.getColor());
		s.setColor("Blue");
		s.area();
		
		s = new Rectangle("Red", 8, 4);
		s.area();
	}
}
