package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IdentificationNumber {
	public static void main(String[] args) throws IOException {
		// ������ȣ identification number
		/**
		 * ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, �� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ���� ��������
		 * 1�� �������̴�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sum += temp*temp;
		}
		sum = sum%10;
		System.out.println(sum);
//		System.out.println(Math.pow(3, 2));
		// ������ ����Ҷ��� Math.pow()
	}
}
