package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add(1, "Nice");// 인덱스값이 1번인 위치에 들어가고 있던것들은 밀림

		System.out.println("size: " + list.size());

		list.add(list.size(), "last");

		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index:" + i + ", " + list.get(i));
		}
		System.out.println();
		List<Integer> listNum = new ArrayList<>();
		// 구현객체와 인터페이스도 상속관계성립가능
		listNum.add(100);
		listNum.add(200);
		listNum.add(300);

		int sum = 0;
		for (Integer num : listNum) {
			sum += num;
		}
		System.out.println("listNum합계:" + sum);
		
	}// end of main
}// end of class