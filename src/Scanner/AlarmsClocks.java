package Scanner;

import java.util.Scanner;
public class AlarmsClocks {
	public static void main(String[] args) {
		/*
		ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) 
		�׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.

		�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, 
		���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
		"45�� ���� �˶� �����ϱ�"
		*/
		
Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt(); //��
        int M = sc.nextInt(); //��
        
            /*
            10 10 | 9 25
             0 30 | 23 45
            23 40 | 22 55
            */
        
        if(M < 45){
            M = 60-(45-M);
            if(H > 0){
                H = H-1; 
            }else {
                H = 23;
            }
            System.out.println(H + " " + M);
        }else{
            M = M-45;
            System.out.println(H + " " + M);
        }
	}
}
