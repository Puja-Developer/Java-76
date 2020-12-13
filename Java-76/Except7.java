class Except7 
{
	public static void main(String[] args) 
	{
      try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);
	  }
	  catch(Exception ex){
        System.out.println("exception occured....");
		System.out.println("Message = "+ ex.getMessage());
		System.out.println("toString() = " + ex.toString());//exception objecttype with msg
		ex.printStackTrace(); //toString() + call stack
	  }

      System.out.println("--- DONE ---");
	}
}

