package Scanner;

import java.util.HashSet;
import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		// remainder : ������
		/*
		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			// 10�ڸ� ��
			set.add(sc.nextInt() % 42);
		}
		System.out.println(set.size());
	}
}
