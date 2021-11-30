package Buffered;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
public class MaxNumberth {
	public static void main(String[] args) throws IOException{
		// �ִ밪�� ���ϰ� ���°�� �ִ��� ���Ͻÿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9]; // �迭���� ���� �ڸ� 9���� ������ش�
		
		int count = 0; // ��
		int max = 0; // �ִ밪
		int index = 0; //�迭�� ���� index
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max + " " + index);
	}
}
