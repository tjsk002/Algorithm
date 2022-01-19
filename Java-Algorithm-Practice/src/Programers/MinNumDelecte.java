package Programers;

import java.util.Arrays;

public class MinNumDelecte {
	public static void main(String[] args) {
		// ���� ���� �� ����
		int[] arr = { 5, 4, 3, 2, 1 };
		int[] answer = new int[arr.length - 1];

		int minN = arr[0];
		// �������� ��´�
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(minN);
			minN = Math.min(minN, arr[i]);
		}

		if (arr.length <= 1) {
			// 1�̸��̸�
			answer = new int[] { -1 };
		}

		
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == minN) {
				// ���� ���� ���� ��������
				continue;
			} 
			answer[idx++] = arr[i];
			
		}
		System.out.println(Arrays.toString(answer));
	}
}
