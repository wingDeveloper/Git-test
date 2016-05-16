import javax.swing.JFrame;

public class Calc {
	public static void main (String args[]) {
//		Создаем имя класса для нового обьекта Reader
		Reader r = new Reader("Calc");
		
//		настраиваем окно jframe
		r.setVisible(true); //отображение окна
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //кнопка закрытия окна - закрывала
		
		r.setSize(200, 250); // ширина + высота окна
		r.setResizable(false); //разрешения ресайзить окошко flase или true
		r.setLocationRelativeTo(null); //расположение окна относительно окна экрана.
	}
}
