package Programers;

public class HandPhoneNumber {
	public static void main(String[] args) {
		// charAt ����ؼ� Ǯ���
		String phone_number = "01033334444";
		String answer = "";
		// �ٸ� ��� ���Խ�
		String phoneNum = "0212341223";
		String result = "";
		
		long longTest = 1;
//		int intTest = 1L;
		result = phoneNum.replaceAll(".(?=.{4})", "*");
		
		System.out.println("���Խ����� Ǯ�� = " + result);
		// return -> *******4444
		for (int i = 0; i < phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				answer += "*";
			}else {
				answer += phone_number.charAt(i);
			}
		}
		System.out.println("charAt()���� Ǯ�� = " + answer);
	}
}
