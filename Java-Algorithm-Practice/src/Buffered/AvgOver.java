package Buffered;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
public class AvgOver {
	public static void main(String[] args) throws IOException {
		/*
		 * 5 5 50 50 70 80 100 
		 * 7 100 95 90 80 70 60 50 
		 * 3 70 90 80
		 * 3 70 90 81 
		 * 9 100 99 98 97 96 95 94 93 91
		 * 
		 * 40.000% 57.143% 33.333% 66.667% 55.556%
		 */
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int firstN = Integer.parseInt(br.readLine()); // ù��° �Է��ϴ� ����
		int[] arr;
		StringTokenizer st;
		
		for (int i = 0; i < firstN; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken()); // �л��� ��
			arr = new int[n]; // �迭�� �л��� ���� ���� ����
			System.out.println(Arrays.toString(arr));
			
			int grade = Integer.parseInt(br.readLine());
			
			double sum = 0; // ���� ���ϱ�
			double cnt = 0; // ��� �̻� �Ѵ� �ο� �� ����
			
			for (int j = 0; j < n; j++) {
				arr[j] = grade;
				sum += arr[j];
				System.out.println(sum);
			}
			
		}
		
	}
}
