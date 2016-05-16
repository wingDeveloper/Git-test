public class PhraseOMatic {
	public static void main(String[] args){
		String[] wordListOne = {"Ћюбима€", "футурама", "весло", "робот", "тостер", "праздик", "умный", "пикник", "веселье"};
		String[] wordListTwo = {"Ћеночка", "секс", "любовь", "компот", "дым", "лето", "баловатьс€", "саранча", "тоска"};
		String[] wordListThree = {"кот", "действие", "вера", "сок", "сон", "гул€ть", "сме€тьс€", "муравей", "гир€"};
		
//		вычисл€ем сколько слов в каждом списке
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
//		генерируем три случайных числа (числа это те слова что мы находим выше)
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
//		теперь строим фразу
		String phrase = wordListOne[rand1] + ", " + wordListTwo[rand2] + " и " + wordListThree[rand3];
		
//		теперь выводим фразу на экран
		System.out.println("¬се, что нам нужно, - это " + phrase);
	}
}
