package com.yedam.generic;

import java.util.ArrayList;
import java.util.List;

class Apple {
}
//generic을 쓰는 이유는 지정한 타입을 사용할 때
//<>가 표현식
public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		String str = box.get();

		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		System.out.println("end");

		List<String> list = new ArrayList<String>();
		// 인터페이스 구현용 Arraylist
		list.add("Hello");

		List<Apple> appList = new ArrayList<Apple>();
		appList.add(new Apple());
		
	}// end of main
}// end of class
