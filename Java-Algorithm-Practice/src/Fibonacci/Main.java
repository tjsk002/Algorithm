package Fibonacci;

public class Main {
	public static void main(String[] args) {
		// �Ǻ���ġ ���� ����, �迭
		int[] arr = new int[100];
		// 100�� arr
		// An = An-1 + An-2; n>=3
		// a1 = 1, a2 = 1

		// �ʱ�ȭ
		arr[1] = 1;
		arr[2] = 1;

		// for each ��� x
		for (int i = 3; i < 100; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 3; i <= 10; i++) {
			System.out.print(arr[i] + " ");
		}

		
		
		// 2��° ��� An
		int prePrevNum = 1; //An-2
		int preNum = 1; //An-1
		System.out.println();
		for(int i=3; i<=10; i++) {
			int nNum = prePrevNum+preNum;
			
			System.out.print(nNum+" ");
			
			
			prePrevNum = preNum;
			preNum = nNum;
		}

	}
}
