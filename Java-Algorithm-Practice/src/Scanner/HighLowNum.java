package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class HighLowNum {
	public static void main(String[] args) {
		/*
		 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 5
		 * 20 10 35 30 7
		 * ----
		 * 7 35
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
	}
}
