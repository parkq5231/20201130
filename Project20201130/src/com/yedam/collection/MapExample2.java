package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(101, "윤태현"), 80);
		map.put(new Student(102, "정병인"), 90);
		map.put(new Student(201, "김종인"), 70);
		map.put(new Student(201, "김종인"), 80);
		map.put(new Student(103, "정병인"), 88);// 동명이인인데 어떻게 인식할까
		// 1. keySet()
		Set<Student> set = map.keySet();
		for (Student student : set) {
			System.out.println(
					"학번: " + student.getStudentNo() + ",이름: " + student.getStudentName() + ",점수: " + map.get(student));
		}
		System.out.println("==============");

		int sum = 0;
		Set<Student> set2 = map.keySet();
		for (Student num : set2) {
			System.out.println(map.get(num));
			sum += map.get(num);
		}
		System.out.println("평균: " + sum / map.size());

		System.out.println("==================");
		// 2.entrySet()
		Set<Entry<Student, Integer>> aa = map.entrySet();

		sum = 0;
		for (Entry<Student, Integer> i : aa) {
			System.out.println("점수: " + i.getValue());
			sum += i.getValue();
		}
		System.out.println(sum / map.size());

	}// end of main
}// end of class