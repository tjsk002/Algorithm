package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SameNumberHate {
	public static void main(String[] args) {
		// ���� ���ڴ� �Ⱦ�
		/**
		 * �ߺ� ���Ÿ� �̿��� HashSet�� ����غ����Ѵ�
		 */
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] result = {};
		// [1,3,0,1]
		// ���� ���ӵ� �����϶��� ���Ÿ� ������Ѵ�
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		String[] goodsList = { "notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard" };
		ArrayList<String> arrayList = new ArrayList<>();

		for (String item : goodsList) {
			if (!arrayList.contains(item))
				arrayList.add(item);
		}

		System.out.println("arrayList = " + arrayList);

//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//			System.out.println(set.toString());
//		}
		int num = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				num = arr[i];
				// arr[i]�� -1�� �ƴ϶�� num�� arr[i]����
				list.add(arr[i]);
			}
		}

		
		for (int i : arr) {
			if (!list.contains(i)) {
				// list�ȿ� i�� ���� �Ǿ��ִ��� Ȯ���ϱ�
				list.add(i);
			}
		}
		System.out.println("list = " + list.toString());
		Integer[] temp = list.toArray(new Integer[list.size()]);
		
		result = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
		System.out.println("***"+Arrays.toString(result));
	}
}
