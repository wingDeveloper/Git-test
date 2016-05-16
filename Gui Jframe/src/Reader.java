import javax.swing.*;
import java .awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	
	int i, k;
	String a, b;
	
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		
		b1 = new JButton("��������");
		b2 = new JButton("���������");
		l1 = new JLabel("������� ������ �����");
		l2 = new JLabel("������� ������ �����");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		
//		buttons
		add(b2);
		add(b1);
		
//		label field 1
		add(t1);
		add(l1);
		
//		label field 2
		add(t2);
		add(l2);
		
//		labels empty
		add(l3);
		add(l4);
		
		b2.addActionListener(handler);
		b1.addActionListener(handler);
	}
	
//	���������
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource()==b2) {
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					
					i++;
					k++;
					
					a = "���� ������ ����� ����� " + i;
					b = "���� ������ ����� ����� " + k;
					l3.setText(a);
					l4.setText(b);
				}
				
				if(e.getSource()==b1) {
					t1.setText(null);
					t2.setText(null);
					
					l3.setText(null);
					l4.setText(null);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "������� � ���� �����");
			}
		}
	}
}
