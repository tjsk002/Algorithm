package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumABMinus7 {
	public static void main(String[] args) throws IOException{
		/*
		 * A+B - 7
		 * �� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
			5
			1 1
			2 3
			3 4
			9 8
			5 2
			
			Case #1: 2
			Case #2: 5
			Case #3: 7
			Case #4: 17
			Case #5: 7
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Է�
		
		int N = Integer.parseInt(br.readLine()); // ó�� � �Է����� �����ִ� ����
		StringTokenizer str;
		
		for(int i=1; i <= N; i++) {
			str = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			System.out.println("Case #"+ i + ": " + (a+b));
			
		}
		
		br.close();
		
	}
}
