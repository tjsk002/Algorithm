package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws IOException{
		/*
		 * ù° �ٿ� ���� �� ������ ���� N�� �־�����.
		�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
		�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
		�׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� 
		���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double arr[] = new double[Integer.parseInt(br.readLine())]; // �ڸ� 3�� �������
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double sum = 0; // ���� ����
		Arrays.sort(arr);
		
		// (40/80)*100 + (80/80)*100 + (60/80)*100 
		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i]/arr[arr.length-1])*100;
		}
		System.out.println(sum/arr.length);
	}
}
