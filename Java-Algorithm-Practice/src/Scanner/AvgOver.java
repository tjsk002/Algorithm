package Scanner;

import java.util.Scanner;
import java.util.Arrays;

public class AvgOver {
	public static void main(String[] args) {
		// ���� ����� �Ѱ��� 4344�� Q
		/*
		 * 5 5 50 50 70 80 100 7 100 95 90 80 70 60 50 3 70 90 80 3 70 90 81 9 100 99 98
		 * 97 96 95 94 93 91
		 * 
		 * 40.000% 57.143% 33.333% 66.667% 55.556%
		 */

		Scanner sc = new Scanner(System.in);
		int fristN = sc.nextInt(); // ó���Է°�
		int arr[];

		for (int i = 0; i < fristN; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			double sum = 0; // ��� ���� ����
			// arr = [0, 0, 0, 0, 0]
			for (int j = 0; j < arr.length; j++) {
				// �л� ���� �Է�
				int grade = sc.nextInt(); // �����Է�
				arr[j] = grade;
				// for�� ������ [50, 50, 70, 80, 100]
				sum += arr[j];
			}
			System.out.println(sum); // 350.0
			
			double firstAvg = sum/n; // 70.0
			System.out.println(firstAvg);
			
			for (int j = 0; j < n; j++) {
				double result = (j/n) * 100;
				System.out.println(result);
			}
		}

	}
}
