package Scanner;

import java.util.Scanner;

public class NumeralSystem {
	public static void main(String[] args) {
		// numeral system -> ����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String str = "�ȳ��ϼ���";
//		System.out.println(str.valueOf("��"));
		String NewStr = Integer.toString(n, 3);
		
		int nn = 15;
		String test1 = Integer.toString(nn, 3);
		System.out.println(test1);
		
//		while (n > 0) {
//			str = n % 3 + str;
//			n /= 3;
//		}

		StringBuffer sb = new StringBuffer(NewStr);
		sb.reverse();
		
//		int x = 1;
//		int rad = 3;
//		while (n > 0) {
//			str = (x * n%10) + str;
//			x *= rad;
//			n /= 10;
//		}
		
		System.out.println(sb);
		NewStr = sb.toString();
		
		n = Integer.parseInt(NewStr, 3);
		System.out.println(n);
		
	}
}
