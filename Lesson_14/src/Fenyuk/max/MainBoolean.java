package Fenyuk.max;

import java.util.Scanner;

public class MainBoolean {
	
	static void menu() {

		System.out.println("Введіть 1, щоб додати товар на вітрину");
		System.out.println("Введіть 2, щоб видалити товар з вітрини");
		System.out.println("Введіть 3, щоб замінити товар на вітрині");
		System.out.println("Введіть 4, щоб відсортувати товари по назві");
		System.out.println("Введіть 5, щоб відсортувати товари по довжині");
		System.out.println("Введіть 6, щоб відсортувати товари по ширині");
		System.out.println("Введіть 7, щоб відсортувати товари по вазі");
		System.out.println("Введіть 8, щоб ввести товар по його порядковому номеру на вітрині");
		System.out.println("Введіть 9, щоб вийти з програми");
	}
	

	public static void main(String[] args) {
		
		Showcase showcase = new Showcase();
		Scanner scanner = new Scanner(System.in);
		
		Boolean myLoopControl = true;
		
		while(myLoopControl) {
			menu();
			
			String strUserInput = scanner.next();
			int intUserInput = Integer.parseInt(strUserInput);
			
			if (intUserInput == 1) {
				showcase.addCommodity();
			}
			else if (intUserInput == 2) {
				showcase.removeCommodity();
			}
			else if(intUserInput == 3) {
				showcase.replaceCommodity();
			}
			else if(intUserInput == 4) {
				showcase.sortByName();
			}
			else if(intUserInput == 5) {
				showcase.sortByLength();
			}
			else if(intUserInput == 6) {
				showcase.sortByWidth();
			}
			else if(intUserInput == 7) {
				showcase.sortByWeight();
			}
			else if(intUserInput == 8) {
				showcase.getCommodity();
			}
			else if (intUserInput == 9){
				myLoopControl = false;
				System.out.println("Ви вийшли з програми");
			}
			else {
				System.out.println("Введіть число від 1 до 9!");
			}
		}
		scanner.close();
	}
}
