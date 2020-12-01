package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();// key 타입 앞 val타입 뒤
		map.put("HONG", 15);
		map.put("KING", 25);
		map.put("KANG", 20);

		Integer val = map.get("HONG");
		System.out.println(val);// key 값으로 val 찾기는 가능 반대는 불가 ,key는 중복 불가(덮어씌워버림)

		Set<String> set2 = map.keySet();// keyset은 key값만 뽑아온거
		for (String i : set2) {
			System.out.println("key값: " + i + ", val값: " + map.get(i));
		}
		System.out.println("======================");
		Set<Entry<String, Integer>> aa = map.entrySet();
		for (Entry<String, Integer> i : aa) {
			System.out.println("key값: " + i.getKey() + ", val값: " + i.getValue());
		}
		System.out.println("======================");

		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김김");
		mapInt.put(20, "민민");
		mapInt.put(30, "박박");

		System.out.println(mapInt.get(30));
		String result = mapInt.get(10);
		System.out.println(result);

		Set<Integer> set = mapInt.keySet();// key값에 해당되는 값을 set컬렉션에 담아주겠다는 의미

		for (Integer i : set) {
			System.out.println("key값: " + i + ", val값 :" + mapInt.get(i));
		}

		Set<Entry<Integer, String>> entrySet = mapInt.entrySet();
		for (Entry<Integer, String> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}
		// entry는 키와 벨류값을 다 가져와서 set에 담아주겠다는 의미 map안의 또다른 클래스임

	}// end of main
}// end of class
