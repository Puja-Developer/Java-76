package co.edureka;

public class WrapperTest {

	public static void main(String[] args) {
		Integer i1 = new Integer(12);
		Integer i2 = new Integer("12");
		Integer i3 = Integer.valueOf(12);
		Integer i4 = Integer.valueOf("12");
		System.out.println(i1+" | "+i2+" | "+i3+" | "+i4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1+" | "+c2);
		System.out.println("--------------------");
		
		//get the primitive value from wrapper object
		Integer intObj = Integer.valueOf(25);
		byte b = intObj.byteValue();
		short s = intObj.shortValue();
		int n = intObj.intValue();
		long l = intObj.longValue();
		float f = intObj.floatValue();
		double d = intObj.doubleValue();
		System.out.println(b+" | "+s+" | "+n+" | "+l+" | "+f+" | "+d);
		
		//boxing an unboxing
		
		int n1 = 26;
		Integer n2 = n1; //boxing
		int n3 = n2; //unboxing
		System.out.println(n1+" | "+n2+" | "+n3);
		
		Integer fno = Integer.valueOf(34);
		Integer sno = 23;
		Integer sum = fno + sno;  //unboxing, adding , boxing
		System.out.println(sum);
		
		//Parsing methods
		byte data = Byte.parseByte("24");
		System.out.println(data);
		
		short data1 = Short.parseShort("26");
		System.out.println(data);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE+" bits"); //1 byte (8 bits)
	}
}
