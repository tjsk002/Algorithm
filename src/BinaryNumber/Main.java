package BinaryNumber;

public class Main {
	public static void main(String[] args) {
		/*
		 * 10������ 2������ ��ȯ
		 * 19 -> 10011
		 * 
		 * �迭 �ݺ��� while for
		 * */
		
		int inputNum = 19;
		int bin[] = new int[100];
		
		/* 
		 * 19/2  9...1
		 *  9/2  4...1
		 *  4/2  2...0
		 *  2/2  1...0
		 *  1/2  0...1
		 *  
		 *  010011 -> 19
		 */
		
		int i = 0;
		//������ ���� ����, i -> index ��� �����ϸ� ��
		int mok = inputNum;
		
		//�ݺ��ϴ°Ŵϱ� �ݺ���
		while(mok > 0) {
			//index�� 1�� ���� �ȴ�(ó����)
			//�������� ����Ǵ� �� = 2����
			bin[i] = mok%2;
			mok /= 2;
			
			i++;
			
		}
		System.out.print("--" + bin[i]);
		i--;
		System.out.print(" 2���� ��ȯ �� : ");
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
	}
}
	