package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class kNum {
	public static void main(String[] args) {
		// k��°
//		int[][] test = new int[2][3];
//		System.out.println(Arrays.deepToString(test));
		// subList�� ����ؼ� ����Ʈ�� �߶���
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		// ��) 5263 -> 2356 -> 3��° �ε��� -> 5
		// return [5, 6, 3]
		int start = 0;// ���۳ѹ� ����
		int end = 0; // �� �ѹ� ����
		int index = 0; // �ε��� �ѹ� ����
		int[] answer = new int[commands.length];
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
		// list.subList(0, 3)
//		System.out.println(list);
		// Ȥ�� Arrays.copyOfRange()
		
		for (int i = 0; i < commands.length; i++) {
			// commands.length first 3
			start = commands[i][0];
			end = commands[i][1];
//			System.out.println(end);
			index = commands[i][2];
//			list = (ArrayList<Integer>) list.subList(start, end);
			int[] temp = Arrays.copyOfRange(array, start-1, end);
			Arrays.sort(temp);
//			System.out.println(Arrays.toString(temp));
			answer[i] = temp[index-1];
			
		}
		System.out.println(Arrays.toString(answer));
//		System.out.println("dd" + Arrays.toString(answer));
//		Arrays.sort(answer);
//		System.out.println("dd" + Arrays.toString(answer));
		// ���� ����
	}
}
