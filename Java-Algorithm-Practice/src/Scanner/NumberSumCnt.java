package Scanner;
import java.util.Scanner;
public class NumberSumCnt {
	public static void main(String[] args) {
		// ������ ��
		// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ex. 5 54321
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ó���Է¹޴� ����
		String a = sc.next(); // �Է¹��� ���ڸ� String���� ��ȯ
		
		int sum=0;
		for(int i=0; i<n; i++) {
			// n�� ���� ��ŭ, charAt - '0'
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
