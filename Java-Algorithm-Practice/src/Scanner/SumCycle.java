package Scanner;

import java.util.Scanner;

public class SumCycle {
	public static void main(String[] args) {
		// ���ϱ� ����Ŭ beck joon Q
		Scanner sc = new Scanner(System.in);
		int originNum= sc.nextInt(); //�־��� ��
//		int NewNum = sc.nextInt(); //���ο� ��
		
		int NewNum = ((originNum%10)*10)+((originNum/10)+(originNum%10)%10);
		System.out.println(NewNum);
		
		System.out.println("test");
		System.out.println("test");
	}
}
