package com.yedam.generic;

class Tv {
}
class Audio {
}

public class PairExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>();
		pair.setKind("김밥");
		pair.setModel(3456);

		Pair<Tv, String> tv = new Pair<Tv, String>();
		tv.setKind(new Tv());
		tv.setModel("평면TV");

		Pair<Audio, String> audio = new Pair<Audio, String>();
		audio.setKind(new Audio());
		audio.setModel("AD303");

		System.out.println(pair.getKind() + "," + pair.getModel());

	}// end of main
}// end of class
