import java.util.Formatter;
import java.util.Scanner;

public class formatter {
	
	static Formatter x;
	static Scanner scn;
	
	public static void main(String args[]){
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			
			System.out.println("Сколько вам лет?");
//			int a = (int)Double.parseDouble(scn.next()); //кастование
			int a = scn.nextInt();
			System.out.println("Как вас зовут?");
			String b = scn.next();
			System.out.println("Где вы живете?");
			String c = scn.next();
			
//			открыли форматор
			x.format("Меня зовут %s, мне %d лет, я живу в городе %s", b, a, c);
			x.close();
//			закрыли форматор
		} catch (Exception e){};
	}
}


// Мне 27 лет, я живу в Харькове
// System.out.println("Мне 27 лет, я живу в Харькове");

// Иначе вывести через спецификаторы и форматор(класс форматор: java.util.Formatter)
// System.out.printf("Мне %d лет, я живу в %s", 27, "Харькове");
// Спецификаторы:
// %s - строка
// %d - целое число
// %f - число с плавающей точкой
// \n - новая строка (newline)

//Форматор как и сканнер всегда должен находится в try и catch 