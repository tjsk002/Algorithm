package Scanner;
import java.util.Scanner;

public class Factorial2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���丮�� ���� �Է����ּ���.");
		int n = sc.nextInt();
		int fac = 1;
		for (int i = n; i > 0; i--) {
			fac = fac * i;
			System.out.println("***" + fac);
		}
		System.out.println("n : " + n + " fac : " + fac);
	}
}
