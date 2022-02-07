package Programers;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	public static void main(String[] args) {
		//Comparator ex
		
		//17�� 2�� & 18�� 1��
		Student a = new Student(17, 2);
		Student b = new Student(18, 1);
		Student c = new Student(19, 2);
		
		/*
		 * Comparable�� "�ڱ� �ڽŰ� �Ű����� ��ü�� ��"�ϴ� ���̰�, 
		 * Comparator�� "�� �Ű����� ��ü�� ��"�Ѵٴ� ��
		 */

		// b�� c�� ���Ѵ�
		int isBig = a.compare(b, c);
		
		if(isBig > 0) {
			// 0���� Ŭ ��
			System.out.println("b�� �� ũ��");
		}else if(isBig == 0) {
			System.out.println("����");
		}else {
			System.out.println("c�� �� ũ��");
		}
	}

}
class Student implements Comparator<Student>{
	int age; //����
	int classNum; //�� 
		
	Student(int age, int classNum){
		this.age = age;
		this.classNum = classNum;
	}
	
	
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.age > o2.age) {
//			return 1;
//		}else if(o1.age == o2.age) {
//			return 0;
//		}else {
//			return -1;
//		}
//	}
	
	public int compare(Student o1, Student o2) {
		return o1.classNum - o2.classNum;
	}
	
}
