import javax.swing.JOptionPane;

public class ReaderGui {
	int i, k;
	String n1, n2;
	
	public void Scan(){
		n1 = JOptionPane.showInputDialog("������� ������ �����");
		n2 = JOptionPane.showInputDialog("������� ������ �����");
//		JOptionPane.showInputDialog("����"); ������� ���� ����� � ����������.
		
		i = Integer.parseInt(n1);
//		Integer.parseInt(n1) � (n2) ��������� ��������� n1 � n2 � ������������.
		k = Integer.parseInt(n2);
	}
	
	public void Scan(int a, int b){
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = " + a);
		JOptionPane.showMessageDialog(null, "������ ���� ������ ����� = " + b);
	}
}
