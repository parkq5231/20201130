package com.yedam.generic;

public class Util {
	public static <T, M> boolean compare(Pair<T, M> p1, Pair<T, M> p2) {
		boolean k = p1.getKind().equals(p2.getKind());
		boolean m = p1.getModel().equals(p2.getModel());

		return k && m;
	}

	public static <T> Box<T> boxing(T t) {
		// <T>는 파라미터를 알려주는 의미
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}// end of class