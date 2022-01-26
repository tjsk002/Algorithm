package Programers;

public class Collatz {
	public static void main(String[] args) {
		/*
		 * 1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�. 2. ����� ���� ���� ����
		 * �۾��� 1�� �� ������ �ݺ��մϴ�.
		 */

		int num = 6;
		int answer = 0;

		while (num != 1) {

			if (num % 2 == 0) {
				num /= 2;

			} else {
				// Ȧ�����
				num = num * 3 + 1;
			}
			answer++;

			if (answer == 500) {
				answer = -1;
				break;
			}
		}
		System.out.println(answer);
	}
}
