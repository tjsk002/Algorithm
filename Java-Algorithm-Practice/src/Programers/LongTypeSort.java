package Programers;

import java.util.Arrays;
import java.util.Collections;

public class LongTypeSort {
	public static void main(String[] args) {
		// ���� �������� ��ġ
		long n = 118372;
		// answer = 873211 ���
		long answer;
		String str = String.valueOf(n);
		// long -> String���� ����ȯ
		String[] arr = new String[str.length()];
		arr = str.split("");
		System.out.println(Arrays.deepToString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(arr));
		String temp = String.join("", arr);
		answer = Long.parseLong(temp);
		System.out.println(answer);
	}
}
