package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGameNum {
	public static void main(String[] args) throws IOException {
		// ���� 5522 ī����ӹ��� -> ������ ���ϴ� ���α׷��� �ۼ��϶�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int sum = 0; // ����
		
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sum += temp;
		}
		System.out.println(sum);
	}
}
