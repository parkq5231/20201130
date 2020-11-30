package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {// 순서없이 값을 넣어서 막 나옴,중복허용x,인덱스값으로 못가져옴
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("World");
		set.add("Welcome");

		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("--------------------");
		Iterator<String> iter = set.iterator();// iterator =반복자
		while (iter.hasNext()) { // hasNext는 값이 있는지 채크 next는 값을 하나 가져오는거
			String str = iter.next();
			System.out.println(str);
		}

		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(26);
		numbers.add(38);

		numbers.remove(26);// 지울 때 인덱스값이 아닌 해당 값을 적어주면 됨
		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("numbers값:" + sum);

		System.out.println("---------------------");

		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(15);
		set2.add(20);
		set2.add(25);
		set2.add(30);
		set2.add(35);
		set2.add(40);
		set2.add(20);
		set2.add(25);

		int sum2 = 0;
		for (Integer i : set2) {
			sum2 += i;
		}
		System.out.println("중복값 제외 합:" + sum2);

		System.out.println("---------------------");

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		list.add(20);
		list.add(25);

		int sum3 = 0;
		for (Integer i : list) {
			sum3 += i;
		}
		System.out.println("중복값 존재 합:"+sum3);
		
		
		
		

	}// end of main
}// end of class
