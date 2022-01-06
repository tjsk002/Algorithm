package Programers;

public class NewId {
	/**
	 * 
1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
	 * @param c
	 * @return
	 */
	static boolean isValid(char c) {
		if(Character.isLetterOrDigit(c)) {
			return true;
			// �����ΰ�� �ľ��ϱ�
			
		}
		if(c == '-' || c == '_' || c == '.') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// �ű� ���̵� ��õ
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		StringBuilder result = new StringBuilder();
		System.out.println(new_id);
		boolean lastDot = false;
		// ������ . ��Ʈ Ȯ��
		// String���� �������� ��ȯ���ָ� �ȴ�
		// result = bat.y.abcdefghi
		new_id = new_id.toLowerCase();
		
		for(char ch : new_id.toCharArray()) {
			if(isValid(ch) == false) {
				continue;
			}
			// char ���ڰ� �ƴ϶��
			if(ch == '.') {
				// ��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
				if(result.length() == 0 || lastDot) {
					// ù ���ڿ��� . �̶��, Ȥ�� ������ .�̶�� �ϸ�
					continue;
				}
				lastDot = true;	
			}else {
				lastDot = false;
			}
			result.append(ch);
		}
		
		System.out.println(result.toString());
	}
}
