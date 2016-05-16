import java.util.Random;

public class AddClass implements Runnable{
	
	int time;
	String name; //посто€нна€ переменна€, локальна€
	Random r = new Random();

	public AddClass(String name){
		this.name = name; //временна€ переменна€
		time = r.nextInt(999);
	}
	public void run() {
		System.out.printf("ѕоток %s спит %d\n", name, time);
		
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("ѕоток %s проснулс€ и закончилс€\n", name);
	}
}
