package Scanner;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {
			System.out.println("������ �Է����ּ���.");
			int R = sc.nextInt();
			System.out.println("���ڿ� �ܾ �Է����ּ���.");
			String S = sc.next();
			for (int j = 0; j < arr.length; j++) {

				System.out.println(arr[j]);
			}
		}

	}
}
