package Scanner;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		/*
		 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 
		 * 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		*/
		Scanner sc = new Scanner(System.in);
		int mul = sc.nextInt()*sc.nextInt()*sc.nextInt();
		System.out.println(mul); //17037300
		
		// String���� Ÿ�� ��ȯ �� charAt()�� ���
		String str = String.valueOf(mul);
		for(int i = 0; i < 10; i++) {
			// ���� 1���� 9����
				int count= 0;
				str.charAt(i);
//				System.out.println(str.charAt(i));
				// 1 7 0 3 7 3 0 0
				for (int j = 0; j < str.length(); j++) {
					if((str.charAt(j) - '0') == i) {
						count++;
					}
				}
				System.out.println(count);
		}
	}
}
