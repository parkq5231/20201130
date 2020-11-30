package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {// 중복값은 걸러내지만 인스턴스(메모리값)은 다르다 hascode 와 equals로 비교함
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("HONG"));
		persons.add(new Person("HONG"));
		persons.add(new Person("HWANG"));
		persons.add(new Person("PARK"));

		Iterator<Person> iter = persons.iterator();
		while (iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person);
		}

	}// end of main
}// end of class