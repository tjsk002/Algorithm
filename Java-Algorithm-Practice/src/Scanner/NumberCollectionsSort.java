package Scanner;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NumberCollectionsSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ó�� ���� �Է�
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt()); // ���� �Է�
		}
		Collections.sort(list);
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}
