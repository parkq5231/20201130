package com.yedam.collection;

public class Person {// 모든 클래스는 오브젝트 클래스를 상속받는다 extends object
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return result;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}// end of class