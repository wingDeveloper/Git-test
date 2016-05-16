
public class MassLong {
	public static void main (String args[]) {
//		int m[][] = new int[3][3];
		int m2[][] = {{1,4,6},{8,9},{2,5,3}};
		
		 for(int row = 0; row < m2.length; row++){
			for(int col = 0; col < m2[row].length; col++){
				System.out.print(m2[row][col] + " | ");
			}
			System.out.println();
		}
	}
}
