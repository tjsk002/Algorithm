package Scanner;

import java.util.HashMap;
import java.util.Map;

class NumberSum {

	public static boolean solution(int[] arr, int n) {
		Map<Integer, Integer> set = new HashMap<>();
		for (int i = 0; i < arr.length; ++i) {
			int x = n - arr[i];
			if (set.containsKey(x)) {
				set.put(x, set.get(x) + 1);
			} else {
				set.put(x, 1);
			}
		}

		for (int i = 0; i < arr.length; ++i) {
			int x = arr[i];
			set.put(n - x, set.getOrDefault(n - x, 0) - 1); // �ڱ� �ڽ��� ã�� �� ����
			int xCount = set.getOrDefault(x, 0); // �ڱ� �ڽ��� ã�� �ְ� �ִ��� Ȯ��
			if (xCount > 0) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 5, 3, 9, 13 }, 8));
	}
}