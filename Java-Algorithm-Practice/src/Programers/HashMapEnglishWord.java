package Programers;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEnglishWord {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("apple", "���");
		map.put("banana", "�ٳ���");
		map.put("orange", "������");
		map.put("melon", "���");
		System.out.println(map);
		for(String key : map.keySet()) {
			System.out.printf("key : %s , value : %s \n", key, map.get(key));
		}
		map.remove("melon");
		System.out.println(map); // {banana=�ٳ���, orange=������, apple=���}
		System.out.println(map.keySet()); // [banana, orange, apple]
	
		Iterator<String> key = map.keySet().iterator();
		System.out.println("key = " + map.get(key));
	}
}
