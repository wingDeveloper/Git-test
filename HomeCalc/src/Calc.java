import javax.swing.JFrame;

public class Calc {
	public static void main (String args[]) {
//		������� ��� ������ ��� ������ ������� Reader
		Reader r = new Reader("Calc");
		
//		����������� ���� jframe
		r.setVisible(true); //����������� ����
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �������� ���� - ���������
		
		r.setSize(200, 250); // ������ + ������ ����
		r.setResizable(false); //���������� ��������� ������ flase ��� true
		r.setLocationRelativeTo(null); //������������ ���� ������������ ���� ������.
	}
}
