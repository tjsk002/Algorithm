package Scanner;

public class SelfNumber {
	public static void main(String[] args) {
		/**
		 * n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� ��
		 * ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�.
		 */
		for (int i = 0; i < 1; i++) {
			int n = d(i); // d(n)�� ������ -> n
			System.out.println("n: " + n);
		}
	}

	public static int d(int number) {
		number = 75;
		System.out.println("*number: " + number);
		int cnt = number; // cnt�� n�� �� �ڸ����� ���Ѱ� ��)75

		System.out.println("*cnt: " + cnt);
		while (number != 0) {
			cnt = cnt + (number % 10); // cnt = 80
			System.out.println("cnt: " + cnt);
			number = number / 10; // 7
			System.out.println("number: " + number);
		}
		return cnt;
	}
}
