package Scanner;


public class StringTest {
	public static void main(String[] args) {
		Student stu = new Student("�����", "����", 26);
		System.out.println(stu);
	}
}

 class Student {
	private String name; // �̸�
	private String gender; // ����
	private Integer age; //����
	
	public Student(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�̸��� " + name + " ������ " + gender + " ���̴� " + age + "�Դϴ�.";
	}
}

