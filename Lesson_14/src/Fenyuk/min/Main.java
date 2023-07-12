package Fenyuk.min;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		Set<Student> st = new HashSet<Student>();
		st.add(new Student("Петро", 25));
		st.add(new Student("Василь", 45));
		st.add(new Student("Максим", 19));
		st.add(new Student("Іван", 55));
		st.add(new Student("Семен", 63));

		System.out.println();
		System.out.println("HashSet виводить елементи в випадковому порядку");
		for (Student studentComparator : st) {
			System.out.println(studentComparator);
		}

		Set<Student> st1 = new LinkedHashSet<Student>();
		st1.add(new Student("Петро", 25));
		st1.add(new Student("Василь", 45));
		st1.add(new Student("Максим", 19));
		st1.add(new Student("Іван", 55));
		st1.add(new Student("Семен", 63));

		System.out.println();
		System.out.println("LinkedHashSet виводить елементи в порядку їх додавання");
		for (Student studentComparator : st1) {
			System.out.println(studentComparator);
		}

		Set<Student> st2 = new TreeSet<Student>();
		st2.add(new Student("Петро", 25));
		st2.add(new Student("Василь", 45));
		st2.add(new Student("Максим", 19));
		st2.add(new Student("Іван", 55));
		st2.add(new Student("Семен", 63));

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку, перевизначеному в Comparable (за замовчуванням)");
		for (Student studentComparator : st2) {
			System.out.println(studentComparator);
		}

		Set<Student> st3 = new TreeSet<Student>(new StudentComparator());
		st3.add(new Student("Петро", 25));
		st3.add(new Student("Василь", 45));
		st3.add(new Student("Максим", 19));
		st3.add(new Student("Іван", 55));
		st3.add(new Student("Семен", 63));

		System.out.println();
		System.out.println("TreeSet виводить елементи в порядку, перевизначеному в Comparable");
		for (Student studentComparator : st3) {
			System.out.println(studentComparator);
		}
	}

}
