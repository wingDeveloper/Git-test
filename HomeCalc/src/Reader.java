//подключаем все классы в библиотеке swing
import javax.swing.*;

//подключаем все классы в библиотеке awt
import java .awt.*;
//подключаем все классы в библиотеке event
import java.awt.event.*;

public class Reader extends JFrame {
	//создаем кнопки с именами, тип переменных от библиотеки Jframe
	JButton minus, plus, divided, multiply, choice, clearButton, equallyButton,
	b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	
	//создаем текста(лейблы) с именем, типом переменной от библиотеки Jframe
	JLabel l1;
	
	//создаем поле ввода с именем, типом переменной от библиотеки Jframe
	JTextField t1;
	
//	После того как мы создали "слушателя" с именем eHandler мы должны создать его обьектом что бы он заработал и применять его функцию отрабатыванияи - кнопкам.
	eHandler handler = new eHandler();
	
//	перезаписываем Reader и создаем окно jframe с тайтлом super
	public Reader(String sTitle){
		super(sTitle); //title окна браузера
		
		setLayout(new FlowLayout()); //задаем направление. Стоит слева на право.
		
		//создаем обекты определения на кнопки, поля и лейблы JFrame
		minus = new JButton("-");
		plus = new JButton("+");
		divided = new JButton("/");
		multiply = new JButton("*");
		choice = new JButton("+/-");
		clearButton = new JButton("C");
		equallyButton = new JButton("=");
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		//создан обьект с текстом (лейбл)
		l1 = new JLabel("Введите число:");
		
		//создан обьект. поле ввода с шириной в скобке
		t1 = new JTextField(15);
		
		//Добавляем кнопки (элементы) на рабочее окно JFrame свойством add();
		//поле текста
		add(l1);
		
		//поле ввода
		add(t1);
		
		//поле кнопок
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		
		add(minus);
		add(plus);
		add(divided);
		add(choice);
		add(clearButton);
		add(equallyButton);
		
//		Задействуем кнопки класса/слушателя eHandler, при создании его обьекта, используем класс обьекта handler, который создан вверху.
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b0.addActionListener(handler);
		
		clearButton.addActionListener(handler);
	}
	
//	Создаем "слушателя/ActionListener" где будет отрабатывать евенты по действию мышки
	public class eHandler implements ActionListener {
//		перезаписываем
		public void actionPerformed(ActionEvent e) {
//			пишем оператор try для проверки испробовать данную операцию, если же try не пройдет проверку на "правду", 
//			тогда будет выполнятся то что ниже, это catch;
			try {
				if(e.getSource() == b1) { //событие при нажатии на кнопку bn, если нажатие было, тогда выполняется все что внутри if
					t1.setText(t1.getText()+"1"); //выполняется если if true. Берем переменую окна калькулятора и прибавляем getText + 1 ту цифру что нам отвечает кнопка.
				}
				if(e.getSource() == b2) {
					t1.setText(t1.getText()+"2");
				}
				if(e.getSource() == b3) {
					t1.setText(t1.getText()+"3");
				}
				if(e.getSource() == b4) {
					t1.setText(t1.getText()+"4");
				}
				if(e.getSource() == b5) {
					t1.setText(t1.getText()+"5");
				}
				if(e.getSource() == b6) {
					t1.setText(t1.getText()+"6");
				}
				if(e.getSource() == b7) {
					t1.setText(t1.getText()+"7");
				}
				if(e.getSource() == b8) {
					t1.setText(t1.getText()+"8");
				}
				if(e.getSource() == b9) {
					t1.setText(t1.getText()+"9");
				}
				if(e.getSource() == b0) {
					t1.setText(t1.getText()+"0");
				}
				
				//стираем все что выведено в поле ввода
				if(e.getSource() == clearButton) {
					t1.setText(null);
				}
				
			} catch (Exception ex) { //catch () с переменой ex - Exception будет срабатывать если не пропустит try
				JOptionPane.showMessageDialog(null, "Ошибка"); //выводим алерт с текстом по центру(null) (всплывающее окноп уведомления)
			}
			
		}
		
	}
}
