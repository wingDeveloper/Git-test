import javax.swing.JFrame;

public class MainGui {
	public static void main (String args[]) {
		Reader r = new Reader("Title");
		
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}
