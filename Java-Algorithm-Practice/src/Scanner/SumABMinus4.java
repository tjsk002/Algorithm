package Scanner;

import java.util.Scanner;

public class SumABMinus4 {
	public static void main(String[] args) {
		//A+B - 4
		//�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}
