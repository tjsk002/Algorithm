package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Remainder {
	public static void main(String[] args) throws IOException{
		// remainder : ������
		/*
		�� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
		���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. 
		�� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		System.out.println(set.size());
	}
}
