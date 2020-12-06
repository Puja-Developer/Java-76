
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka";
		System.out.println("Size = "+ str.length());
		System.out.println("Char @ index 1 = "+ str.charAt(1));
		System.out.println("Index of \"e\" = "+ str.indexOf("e"));
		System.out.println("Last Index of \"e\" = "+ str.lastIndexOf("e"));
		System.out.println(str.indexOf("ear")); //-1
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('e','*'));
		
		System.out.println(str);
		
		String s1 = "ABC";
		//String s2 = "ABC";
		String s2 = "ADA";
		int n = s1.compareTo(s2);
		System.out.println(n);
	}
}
