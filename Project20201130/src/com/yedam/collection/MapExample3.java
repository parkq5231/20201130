package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//책15강 마지막 예제
public class MapExample3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> aa = map.keySet();
		int sum = 0;
		for (String i : aa) {
			name = i;
			System.out.println("이름: " + name);

			Integer bb = map.get(i);

			sum += bb;
		}
		System.out.println("평균점수: " + sum / aa.size());

	}// end of main
}// end of class