package PrimeNumber;

public class Main {
	public static void main(String[] args) {
		/*
		 * �Էµ� ���� �Ҽ����� �Ǻ��Ͻÿ� 13 ����: 13 �ݺ��� for while if
		 */

		int num = 20;
		// �Ҽ� 1, �ڱ��ڽ��� �����ϰ� ������ �������� ����� ������ �Ҽ����ƴ�
		// �Ҽ� = 1�� �ڽ��ڽŸ� ������ �������� ���
		boolean isPrimeNumber = true;
		
		
		//for(int i=2; i <= num/2; i++) = ����
		for(int i=2; i<=num-1; i++) {
			if(num % i ==0) {
				//����������� primeNumber�� �ƴ�
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + "�� �Ҽ� �Դϴ�.");
		}else {
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
