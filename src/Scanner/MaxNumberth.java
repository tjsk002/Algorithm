package Scanner;

import java.util.Scanner;

public class MaxNumberth {
	public static void main(String[] args) {
		// �ִ밪�� ���ϰ� ���°�� �ִ��� ���Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		// 9�� ���� �Է��� �迭
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
				sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int count = 0; // ���ϱ� ����
		int max = 0; // �ִ밪
		int index = 0; // �迭�� �ִ� index
		
		// �Է��� �迭�� ���Ҹ� i�� �����ϱ�
		for (int i : arr) {
			count++;
			if(i > max) {
				max = i;
				index = count;
			}
		}
		System.out.println(max + " " + index);
	}
}
