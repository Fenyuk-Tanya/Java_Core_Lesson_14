package Fenyuk.max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Showcase {
	
	ArrayList<Commodity> showcase = new ArrayList<Commodity>();
	
	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву товару:");
		String name = sc.next();
		System.out.println("Введіть довжину товару, в см :");
		int length = sc.nextInt();
		System.out.println("Введіть ширину товару,в см :");
		int width = sc.nextInt();
		System.out.println("Введіть вагу товару, в г :");
		int weight = sc.nextInt();
		
		Commodity commodity = new Commodity(name,length,width,weight);
		
		showcase.add(commodity);
		System.out.println(" Товар " + commodity.toString() + " успішно доданий на вітрину  ");	
	}
		
	public void removeCommodity() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Введіть назву товару:");
		String name = sc.next();
		System.out.println("Введіть довжину товару, в см :");
		int length = sc.nextInt();
		System.out.println("Введіть ширину товару,в см :");
		int width = sc.nextInt();
		System.out.println("Введіть вагу товару, в г :");
		int weight = sc.nextInt();
		
		boolean typeCorrect = isCommodityExists(showcase,name,length,width,weight);
		
		if (typeCorrect) {
			Iterator<Commodity> iterator = showcase.iterator();
			
			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				
				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLength() == length
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println(" Товар " + nextCommodity.toString() + " успішно видалений з вітрини ");
				}
			}
		} else {
			System.out.println(" Ввудуного товару немає на вітрині ");
		}
		
	}
	
	public void replaceCommodity() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Введіть назву товару:");
		String name = sc.next();
		System.out.println("Введіть довжину товару, в см :");
		int length = sc.nextInt();
		System.out.println("Введіть ширину товару,в см :");
		int width = sc.nextInt();
		System.out.println("Введіть вагу товару, в г :");
		int weight = sc.nextInt();
		
		boolean typeCorrect = isCommodityExists(showcase, name, length, width, weight);

		if (typeCorrect) {
			for (Commodity commodity : showcase) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("Введіть нову назву товару: ");
					String newName = sc.next();
					System.out.println("Введіть нову довжину товару, см: ");
					int newLength = sc.nextInt();
					System.out.println("Введіть нову ширину товару, см: ");
					int newWidth = sc.nextInt();
					System.out.println("Введіть нову вагу товару, г :");
					int newWeight = sc.nextInt();
					commodity.setName(newName);
					commodity.setLength(newLength);
					commodity.setWidth(newWidth);
					commodity.setWeight(newWeight);
					
					System.out.println("Введений товар успішно замінений на " + commodity.toString());
					}
				}
				} else {
					System.out.println(" Ввудуного товару немає на вітрині ");
				}
	}

	public void sortByName() {
		System.out.println("Перед сортуванням товари на вітрину були в даному порядку : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
		
		Collections.sort(showcase,new CommodityNameComparator());
		System.out.println("Після сортування товари на вітрині мають даний вигляд : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
	}
	
	public void sortByLength() {
		System.out.println("Перед сортуванням товари на вітрину були в даному порядку : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
		
		Collections.sort(showcase,new CommodityLengthComparator());
		System.out.println("Після сортування товари на вітрині мають даний вигляд : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWidth() {
		System.out.println("Перед сортуванням товари на вітрину були в даному порядку : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
		
		Collections.sort(showcase,new CommodityWidthComparator());
		System.out.println("Після сортування товари на вітрині мають даний вигляд : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
	}
	
	public void sortByWeight() {
		System.out.println("Перед сортуванням товари на вітрину були в даному порядку : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
		
		Collections.sort(showcase,new CommodityWeightComparator());
		System.out.println("Після сортування товари на вітрині мають даний вигляд : ");
		for (Commodity commodity : showcase) {
			System.out.println(commodity);
		}
	}
	
	public void getCommodity() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Введіть порядковий номер на вітрині: ");
		int i = sc.nextInt();
		
		if (i < 0 || i > (showcase.size() - 1)) {
			System.out.println("Товару з таким номером немає на вітрині.");
		} else {
			System.out.println("Під номером " + i + " на вітрині знаходиться  " + showcase.get(i).toString());
		}
	}
	
	
	private boolean isCommodityExists(ArrayList<Commodity> showcase, String name, int length, int width, int weight) {
		boolean flag = false;
		
		for (Commodity commodity : showcase) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
					&& commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}
		
		return flag;
	}

}
