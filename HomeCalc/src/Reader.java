//���������� ��� ������ � ���������� swing
import javax.swing.*;

//���������� ��� ������ � ���������� awt
import java .awt.*;
//���������� ��� ������ � ���������� event
import java.awt.event.*;

public class Reader extends JFrame {
	//������� ������ � �������, ��� ���������� �� ���������� Jframe
	JButton minus, plus, divided, multiply, choice, clearButton, equallyButton,
	b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	
	//������� ������(������) � ������, ����� ���������� �� ���������� Jframe
	JLabel l1;
	
	//������� ���� ����� � ������, ����� ���������� �� ���������� Jframe
	JTextField t1;
	
//	����� ���� ��� �� ������� "���������" � ������ eHandler �� ������ ������� ��� �������� ��� �� �� ��������� � ��������� ��� ������� �������������� - �������.
	eHandler handler = new eHandler();
	
//	�������������� Reader � ������� ���� jframe � ������� super
	public Reader(String sTitle){
		super(sTitle); //title ���� ��������
		
		setLayout(new FlowLayout()); //������ �����������. ����� ����� �� �����.
		
		//������� ������ ����������� �� ������, ���� � ������ JFrame
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
		
		//������ ������ � ������� (�����)
		l1 = new JLabel("������� �����:");
		
		//������ ������. ���� ����� � ������� � ������
		t1 = new JTextField(15);
		
		//��������� ������ (��������) �� ������� ���� JFrame ��������� add();
		//���� ������
		add(l1);
		
		//���� �����
		add(t1);
		
		//���� ������
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
		
//		����������� ������ ������/��������� eHandler, ��� �������� ��� �������, ���������� ����� ������� handler, ������� ������ ������.
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
	
//	������� "���������/ActionListener" ��� ����� ������������ ������ �� �������� �����
	public class eHandler implements ActionListener {
//		��������������
		public void actionPerformed(ActionEvent e) {
//			����� �������� try ��� �������� ����������� ������ ��������, ���� �� try �� ������� �������� �� "������", 
//			����� ����� ���������� �� ��� ����, ��� catch;
			try {
				if(e.getSource() == b1) { //������� ��� ������� �� ������ bn, ���� ������� ����, ����� ����������� ��� ��� ������ if
					t1.setText(t1.getText()+"1"); //����������� ���� if true. ����� ��������� ���� ������������ � ���������� getText + 1 �� ����� ��� ��� �������� ������.
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
				
				//������� ��� ��� �������� � ���� �����
				if(e.getSource() == clearButton) {
					t1.setText(null);
				}
				
			} catch (Exception ex) { //catch () � ��������� ex - Exception ����� ����������� ���� �� ��������� try
				JOptionPane.showMessageDialog(null, "������"); //������� ����� � ������� �� ������(null) (����������� ����� �����������)
			}
			
		}
		
	}
}
