package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class lowNumber {
	public static void main(String[] args) {
//		���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		10 5
//		1 10 4 9 2 3 8 5 7 6
//		1 4 2 3 [output]
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		
		// ó�� �Է��� ������ ������ ���� �迭�� ������
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(arr[i] < x) {
				System.out.printf(arr[i] + " ");
			}
		}
		sc.close();
	}
}
