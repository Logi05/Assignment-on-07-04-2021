package com.practice;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Anu", 21));
		al.add(new Student(103, "Ramya", 13));
		al.add(new Student(102, "Logi", 18));
		al.add(new Student(105, "priya", 24));
		al.add(new Student(104, "Gayu", 15));
		Predicate<Student> p1 = i -> (i.age >= 18);
		Predicate<Student> p2 = e -> (e.age < 18);
		for (Student s : al) {
			if (p1.test(s)) {

				System.out.println("Student Age is :" + s.age + " " + "Student Name is:" + s.name);
				System.out.println("Allowed to watch movie");
				System.out.println(" ");
			}

			else if (p2.test(s)) {

				System.out.println("Student Age is :" + s.age + " " + "Student Name is:" + s.name);
				System.out.println("Not Allowed to watch movie");
				System.out.println("  ");
			}

		}
	}
}

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

