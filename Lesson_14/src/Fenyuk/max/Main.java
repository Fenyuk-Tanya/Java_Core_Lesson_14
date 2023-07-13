package Fenyuk.max;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println();
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

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				showcase.addCommodity();
				break;
			}

			case 2: {
				showcase.removeCommodity();
				break;
			}

			case 3: {
				showcase.replaceCommodity();
				break;
			}

			case 4: {
				showcase.sortByName();
				break;
			}

			case 5: {
				showcase.sortByLength();
				break;
			}

			case 6: {
				showcase.sortByWidth();
				break;
			}

			case 7: {
				showcase.sortByWeight();
				break;
			}

			case 8: {
				showcase.getCommodity();
				break;
			}

			case 9: {
				System.exit(0);
				break;
			}

			default: {
				System.out.println("Введіть число від 1 до 9!");
				scanner.close();
				break;
			}
			}
		}

	}

		
		
	}

