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
			for (int i = 0; i < num; i++) {
				if (num % 2 == 0) {
					answer /= 2;
					System.out.println(answer);
				} else {
					// Ȧ�����
					answer = num * 3 + 1;
				}

				answer++;
				if (answer == 500) {
					answer = -1;
					break;
				}
			}
		}
	}
}
