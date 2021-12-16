package Scanner;

import java.util.Scanner;

public class AvgOver {
	public static void main(String[] args) {
		// ���� ����� �Ѱ��� 4344�� Q
		/*
		 * 5 5 50 50 70 80 100 
		 * 7 100 95 90 80 70 60 50 
		 * 3 70 90 80
		 * 3 70 90 81 
		 * 9 100 99 98 97 96 95 94 93 91
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
//			System.out.println(sum); // 350.0
			
			double avg = sum/n; // 70.0
			double count = 0; // ��� �Ѵ� �ο� ����
			
			for (int j = 0; j < n; j++) {
				if(arr[j] > avg) {
					count++; // count -> 2.0
				}
			}
			System.out.printf("%.3f%%", (count/n)*100);
		}
	}
}
