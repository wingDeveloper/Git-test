import java.util.Formatter;
import java.util.Scanner;

public class formatter {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]){
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			
			System.out.println("������� ��� ���?");
//			int a = (int)Double.parseDouble(scn.next()); //����������
			int a = scn.nextInt();
			System.out.println("��� ��� �����?");
			String b = scn.next();
			System.out.println("��� �� ������?");
			String c = scn.next();
			
//			������� ��������
			x.format("���� ����� %s, ��� %d ���, � ���� � ������ %s", b, a, c);
			x.close();
//			������� ��������
		} catch (Exception e){};
	}
}


// ��� 27 ���, � ���� � ��������
// System.out.println("��� 27 ���, � ���� � ��������");

// ����� ������� ����� ������������� � ��������(����� ��������: java.util.Formatter)
// System.out.printf("��� %d ���, � ���� � %s", 27, "��������");
// �������������:
// %s - ������
// %d - ����� �����
// %f - ����� � ��������� ������
// \n - ����� ������ (newline)

//�������� ��� � ������� ������ ������ ��������� � try � catch 