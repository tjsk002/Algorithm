package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class kNum {
	public static void main(String[] args) {
		// k��°
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		// ex) 5263 -> 2356 -> 3��° �ε��� -> 5
		// return [5, 6, 3]
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		// �迭 ���� ����ִ� ����
		answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 3�� copyOfRange ����ؼ� ������
			for (int j = commands[i][0]; j < commands[i][1]; j++) {
				list.add(array[j]);
				System.out.println(list.toString());
			}
		}
		
	}
}
