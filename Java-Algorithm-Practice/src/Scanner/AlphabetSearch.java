package Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSearch {
	public static void main(String[] args) {
		// ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, 
		// �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
		// ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// baekjoon
		// 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		Scanner sc = new Scanner(System.in);
		// next()�� �ܾ� nextLine() �� ����
		
		int[] arr = new int[26];
		// �⺻���� -1�� �ʱ�ȭ �����ش� a-z���� 26�� �迭 ����
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String str = sc.nextLine(); // baekjoon
		
//		System.out.println(str.length());
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("###" + ch);
//			System.out.println(ch);
			if(arr[ch - 'a'] == -1) {
				// ù��° ���ĺ��� ������
				arr[ch - 'a'] = i;
			}
		}
		
		
		for(int result : arr) {
			System.out.print(result + " ");
		}
//		
		
//		System.out.println(Arrays.toString(arr));
	}
}
