import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		
		//�̸�, �й�
		Student stu1 = new Student("�����", "20131841");
		Student stu2 = new Student("���ϳ�", "20131842");
		Student stu3 = new Student("������", "20131843");
		
		//arraylist ����
		ArrayList<Student> list = new ArrayList<Student>();
		
		//�߰�
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		//for each��
		for(Student stu : list) {
			//ù��° ��������... �ݺ��Ҷ����� 1,2,3
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
			
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----��� �˻��� �ϰ�����ôٸ�y, �����ϰ�����ø� n----");
			String result = sc.next();
			if(result.equals("y")) {
				System.out.println("�л��̸��� �Է����ּ���");
				boolean flag = false;
				//�ʱ�ȭ
				
				//�л��� �̸��� �ִ°��
				String name = sc.next();
				for(Student stu : list) {
					//�̸��� �ִٸ� 
					if(stu.getName().equals(name)) {
						System.out.println(stu.getName()+ "�л��� �й���: "+stu.getNo());
						flag= true;
						//�̸��� �ִٸ� ���
					}
				} 
				//flag�� false
				if(!flag) {
					System.out.println("���� �л��Դϴ�");
				}
				
			}else if(result.equals("n")) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}else {
				System.out.println("�߸��������ϴ�. �ٽ� �Է����ּ���");
				String result2 = sc.next();
			}
			
		}
		
		
		
	}
}
