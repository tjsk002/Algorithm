package Scanner;

import java.util.Scanner;

public class IdentificationNumber2 {
	public static void main(String[] args) {
		// Math.pow ��� ����ؼ� -> ������ �� ���
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int temp = sc.nextInt();
			sum += Math.pow(temp, 2);
		}
		
		int result = sum%10;
		System.out.println(result);
	}
}
