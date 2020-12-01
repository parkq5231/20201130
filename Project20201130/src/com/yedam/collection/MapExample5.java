package com.yedam.collection;

import java.util.TreeSet;

public class MapExample5 {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		tset.add(50);
		tset.add(30);
		tset.add(45);
		tset.add(55);

		tset.first();
		tset.last();

		System.out.println(tset.first());
		System.out.println(tset.last());

		TreeSet<String> tstr = new TreeSet<>();

		tstr.add("HONG");
		tstr.add("HWANG");
		tstr.add("PARK");
		tstr.add("CHOI");

		System.out.println(tstr.first());
		System.out.println(tstr.last());

		TreeSet<Student> tstu = new TreeSet<>();
		tstu.add(new Student(100, "HONG", 70));
		tstu.add(new Student(101, "HWANG", 80));
		tstu.add(new Student(102, "PARK", 90));

		System.out.println(tstu.first().getStudentNo() + "," + tstu.first().getStudentName());
		System.out.println(tstu.last().getStudentNo() + "," + tstu.last().getStudentName());

	}// end of main
}// end of class