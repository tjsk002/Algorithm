package Programers;

public class DivisorNumSum {
	public static void main(String[] args) {
		// ���α׷��ӽ� ����� ������ ����
		int left = 13;
		int right = 17;
//		System.out.println(Arrays.toString(arr));

		int result = 0;
//		int cnt = 0; // ��� �Ǵ� ���� ī����
		for (int i = left; i <= right; i++) {
			// i�� 13���� 17���� = 13,14,15,16,17
			int cnt = 0; // ��� �Ǵ� ���� ī����
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					// ��� �����
					cnt++;
//					System.out.println(cnt);
				}
			}
			if (cnt % 2 == 0) {
				// ¦������ �ƴ���
				result += i;
			} else {
				result -= i;
			}
		}
		System.out.println(result);
	}
}
