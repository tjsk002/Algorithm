package Programers;

public class KimHusband {
	public static void main(String[] args) {
		// �輭�� ã��
		String[] seoul = new String[] {"Jane","Kim"};
		String result = "";
		int n = 0;
		StringBuffer sb = new StringBuffer();
		// �輭���� 1�� �ִ� ����ϱ�
		for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				n = i;
			}
		}
		result = sb.append("�輭���� ").append(n).append("�� �ִ�").toString();
		System.out.println(sb);
		System.out.println(result);
	}
}
