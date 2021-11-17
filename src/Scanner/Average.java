package Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		/*
		 * ù° �ٿ� ���� �� ������ ���� N�� �־�����.
		�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
		�ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
		�׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� 
		���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(arr);
		// sort�� �����ϸ� �Ǹ����� ���� �ִ밪
		System.out.println(Arrays.toString(arr));
		// [40.0, 70.0, 80.0]
		
		for (int i = 0; i < arr.length; i++) {
			// ex) 3��
			sum += (arr[i]/arr[arr.length-1] * 100);
		}
		
		System.out.println(sum/arr.length);
	}
}
