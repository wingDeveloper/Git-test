public class MainGui {
	public static void main(String args[]){
		ReaderGui r = new ReaderGui();
		r.Scan();
		
		r.i = count(r.i);
		r.k = count(r.k);
		
//		2 метод ReaderGui который перезапишится 
		r.Scan(r.i, r.k);
	}
	
	private static int count(int x){
		x = x + 1;
		return x;
	}
}
