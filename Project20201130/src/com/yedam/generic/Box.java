package com.yedam.generic;

public class Box<T> {//T는 타입 파라미터
	T obj;

	void set(T obj) {// 어떤 유형이든 가능
		this.obj = obj;
	}

	T get() {
		return obj;

	}
}// end of class