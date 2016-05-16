import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.File;

public class MainSection {
	static String[][] m = new String[5][3];
	static Scanner scn;
	
	public static void main(String args[]){
		openFile();
		readFile();
		out();
	}

	private static void out() {
		for(int row = 0; row < m.length; row++ ){
			for(int col = 0; col < m[row].length; col++){
				System.out.print(m[row][col] + "  ");
			}
			System.out.println();
		}
	}
	
//2
//	bool true false
	private static void readFile() {
		while(scn.hasNext()){ //пока не прочтет весь файл будет Правда, как прочтет - будет false
			for(int row = 0; row < m.length; row++ ){
				for(int col = 0; col < m[row].length; col++){
					m[row][col] = scn.next();
				}
			}
		}
	}

//	1
	private static void openFile() {
		try{
			scn = new Scanner(new File("res//1.txt"));
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "Файл не найден");
		}
	}
}
