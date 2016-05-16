
public class MassCycle {
	public static void main(String args[]) {
		int[] m = {24, 534, 3};
		
		int[] m2 = {32, 2, 55, 5, 3};
		
		int[] m3 = new int[5];
		
		for(int x=0; x<m.length; x++){
			m[x] = m[x] * -1;
			System.out.println(m[x]);
		}
		System.out.println("---------");
		for(int k=0; k<5; k++){
			System.out.println(m2[k]);
		}
		System.out.println("---------");
		for(int j=0; j<m3.length; j++){
			m3[j] = j;
			System.out.println(m3[j]);
		}
	}
}
