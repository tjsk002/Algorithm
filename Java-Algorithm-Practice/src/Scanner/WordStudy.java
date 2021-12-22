package Scanner;
import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args) {
		// ���� �ܾ� ���� 1157�� ����
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26]; // ���ĺ� ����
		int max = 0; // ���ĺ� ����
		char result = ' '; // �ٸ� ���ĺ��� ������ ���ٸ� '?' ���

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0; // �ʱ⼳�� 0
		}
		
		String str = sc.next().toUpperCase(); // �ܾ��Է�, �빮�ڷ� ����

		for (int i = 0; i < str.length(); i++) {
			// �Է��� �ܾ��� ������ŭ �ݺ�
			char ch = str.charAt(i);
			arr[ch - 65]++;
			
			if (max < arr[ch - 'A']) {
				// arr[7]
				max = arr[ch - 'A'];
				// max = arr[7] == H
				result = str.charAt(i);
			} else if (max == arr[str.charAt(i) - 'A']) {
				result = '?';
			}
		}
		System.out.println(result);
	}
}
