package Uppercase;

public class Main {
	public static void main(String[] args) {
		/*
		 * �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͻÿ�
		 * helloWorLD
		 * -> HELLOWORld
		 * 
		 * �迭, for, if
		 * */
		
		String input = "helloWorLD";
		char []arr;
		//�ƽ�Ű �ڵ�? 
		arr = input.toCharArray();
		System.out.println("�Է��� ���� : " + input);
		for(int i=0; i<arr.length; i++) {
			//�빮�ڳ� �ҹ��ڳ� ���и���?
			//�ҹ��� a���� z���� / A - Z
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + 'A' - 'a');
				
			}else if(arr[i] >= 'A' && arr[i] <= 'Z'){
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		System.out.println(arr);
		
	}
}
