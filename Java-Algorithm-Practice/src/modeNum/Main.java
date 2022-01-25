package modeNum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ���帹�� ������ ���� ����Ͻÿ�
		// 1 2 2 3 1 4 2 2 4 3
		// �迭 for��

		Scanner sc = new Scanner(System.in);

		// num �ȿ� 10���� �� �迭1��
		int[] inputNum = new int[10];
		
		for (int i = 0; i < 10; i++) {

			inputNum[i] = sc.nextInt();
		}

		int[] mode = new int[10];

		// index ������ ��
		// index �� -> index(�����Ѽ�)�� ��� ���Դ��� �����ϴ� �뵵

		// mode[3] = 5, -> 3�� ���ڰ� 5�� �����ߴ�

		// inputNum -> 1 2 2 3 1 4 2 2 4 3
		
		for (int i = 0; i < 10; i++) {
			// 0�� ���� 9������ ���ư�
			mode[inputNum[i]]++;

			// ex) inputNum[5] -> ���� "4"
			// mode�� ���� 4�� +1�� ���� -> �׷��� 2

			// 1�� ���� ex) i=2

			// mode[1] == 2 ���� '1'�� ������ 2��
			// mode[2] == 4 ���� '2'�� ������ 4��
			// mode[3] == 2
			// mode[4] == 2
		}
		int modeNum = 0; // �ֺ��
		int modeCnt = 0; // �ֺ���� ���� Ƚ��

		for (int i = 0; i < 10; i++) {
			if (modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("�ֺ���� : " + modeNum + " // cnt : " + modeCnt);
	}

}
