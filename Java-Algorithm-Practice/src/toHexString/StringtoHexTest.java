package toHexString;

import java.util.Scanner;

public class StringtoHexTest {
	public static void main(String[] args) {
		// 10���� ���� 16������ ��ȯ
		// 16���� ���� 10������ ��ȯ
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		//10���� -> 16����
//		System.out.println(Integer.toHexString(13));
		//16���� -> 10����
		System.out.println(Integer.parseInt(n, 16));
		
	}
}
