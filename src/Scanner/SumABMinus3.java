package Scanner;

import java.util.Scanner;

public class SumABMinus3 {
	public static void main(String[] args) {
		/*
		ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		*/

		 Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        int arr[] = new int[T];
	        
	        for(int i=0; i<T; i++){
	            int A = sc.nextInt();
	            int B = sc.nextInt();
	            
	            arr[i] = A+B;
	        }
	        
	        for(int j : arr){
	            System.out.print(j);
	        }

	}
}
