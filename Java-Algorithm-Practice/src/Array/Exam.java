package Array;

public class Exam {

	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0, n = 10;

		while (i <= 7) {
			a[i++] = n % 2;
			// ����ϰ� �� ���� a[0]�� �־��ش�
			// �׸��� i�� ������ �ȴ�
			//System.out.println("a= " + a[i] + ", i= " + i + ", n= " + n);
			// System.out.println("a= " + a[i++]);
			n /= 2;
			//System.out.println("---"+"a= " + a[i] + ", i= " + i + ", n= " + n);
			//System.out.print(a[i-1]);
			System.out.print(i+"�𸣰ڳ�");
			
		}
		System.out.println();
		
		for (i = 7; i >= 0; i--) {
			System.out.printf("%d", a[i]);
			//System.out.println(a[i]);
		}

	}

}
