package Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class Apt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [][] test = new int[2][3];
//		System.out.println(Arrays.deepToString(test));
		int [][] arrApt = new int[15][15];
		
		for (int i = 0; i < arrApt.length; i++) {
			arrApt[i][1] = 1; // i���� 1ȣ 
			arrApt[0][i] = i; // 0���� iȣ
		}
		
		for (int i = 1; i < 15; i++) {
			// 1������ 14������
			for (int j = 2; j < 15; j++) {
				// 2ȣ���� 14ȣ����
				arrApt[i][j] = arrApt[i][j-1]+arrApt[i-1][j];
			}
		}
		
//		for (int i = 14; i >= 0; i--) {
//			// 1������ 14������
//			for (int j = 1; j < 15; j++) {
//				System.out.printf("%d ", arrApt[i][j]);
//			}
//			System.out.println();
//		}
		
		int num = sc.nextInt(); // ��Է�����
		
		for (int i = 0; i < num; i++) {
			int k = sc.nextInt(); // ����
			int n = sc.nextInt(); // ��ȣ
			System.out.println(arrApt[k][n]);
		}
	}
}
