package Array;

public class SelfNumber {
	public static void main(String[] args) {
		/*
		 * n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� ��
		 * ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�.
		 * 
		 * 
		 */
		
		int[] arr = new int[10];
		for (int i = 1; i < 10; i++) {
			arr[d(i)]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static int d(int number) {
		int cnt = number;
		// number ������, ���ο� ���� cnt
		while (number != 0) {
			cnt = cnt + (number % 10);
			System.out.println("cnt : " + cnt);
			number = number / 10;
			System.out.println("number : " + number);
			if (cnt > 9) {
				return 0;
			}
		}
		return cnt;
	}
}
