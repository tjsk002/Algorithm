package Scanner;

import java.util.Scanner;

public class IdentificationNumber {
	public static void main(String[] args) {
		// ������ȣ identification number
		/**
		 * ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�,
		 * �� ���ڸ� ������ ������ �� 0+16+4+25+36 = 
		 * 81 �� 10���� ���� �������� 1�� �������̴�.
		 */
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();
//			sum += temp*temp;
			sum += Math.pow(temp, 2);
		}
		
		int result = sum%10;
		
		System.out.println(result);
	}
}
