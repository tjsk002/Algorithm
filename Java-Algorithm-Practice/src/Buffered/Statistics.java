package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
	public static void main(String[] args) throws IOException{
		//Statistics �����
		/**
		5
		1 3 8 -2 2 -> 2 2 1 10
		������ : N���� ������ ���� N���� ���� �� 1+3+8+0 = 12/5 -> 2.4 -> 2
		�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
		�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
		���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double sum = 0;
		int min = Integer.MIN_VALUE; // �ּҰ�
		int max = Integer.MAX_VALUE; // �ִ밪
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			sum += arr[i];
		}
		
		// 1�� ���� avg
		int avg = (int)sum/n;
		
		// 2�� ���� centerN
		Arrays.sort(arr);
		int centerN = (int)arr[n/2];
		System.out.println(centerN);
		
		// 4�� ���� range ���� ���ϱ�
		// -2 1 2 3 8 - > 10
		// �ּ� �ִ� -2 8
		int range = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				range = (int)arr[i];
			}
			if(arr[i] > max) {
				range = (int)arr[i];
			}
			
			System.out.println(min + " " + max);
		}
	}
}
