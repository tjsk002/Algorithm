package Programers;

import java.util.Arrays;
import java.util.Comparator;

public class BigNumberLevel2 {
	public static void main(String[] args) {
		// ���� ū ���� ���ϱ�
		int[] num = {6, 10, 2};
		String answer = "";
		
		// ���� �迭�� ��ȯ
		String[] str = new String[num.length];
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(num[i]);
			// [6, 10, 2]
			
		}
		
		//comparator �������̽��� ���� ������ ����
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return ((o2+o1).compareTo(o1+o2));
			}
		});
		
		for(String s : str) {
			answer += s;
			System.out.println(answer);
		}
		if(str[0].equals(0)) {
			// �����Ͱ� 0�� ���
			answer = "0";
		}
	}
}
