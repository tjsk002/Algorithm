package Scanner;

import java.util.Scanner;

public class SumABMinus7 {
	public static void main(String[] args) {
		/*
		 * A+B - 7
		 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
			5
			1 1
			2 3
			3 4
			9 8
			5 2
			
			Case #1: 2
			Case #2: 5
			Case #3: 7
			Case #4: 17
			Case #5: 7
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
		
		sc.close();
	}
}
