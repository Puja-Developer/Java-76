//program to divide a number by another where the data is given as command-line arguments
class Except3 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);

		System.out.println("--- DONE ---");
	}
}
