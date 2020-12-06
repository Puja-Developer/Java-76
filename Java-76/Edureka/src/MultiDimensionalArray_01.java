
public class MultiDimensionalArray_01 {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		
		System.out.println("Size of Array = "+ n.length);
		
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/*---- array iteration in a matrix form using nested loop -----*/
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
