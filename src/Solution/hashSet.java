package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

/*
 * ���ڿ��� s�� ���̴� 1�̻� 100�����̸�, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�
 * ������ ��Ÿ���� ���� �κ� ���ڿ��� �ϳ��� ���� �ȴ�
 * 
 * ���� �κ� ���ڿ��̶� � ���ڿ��� s�κ� ���ڿ��̸鼭 ���� ���ĺ���
 * �ι��̻� ��Ÿ���� �ʴ� ���ڿ��� ���Ѵ�.
 * ���� ��� �־��� ���ڿ��� "abac"�� ��, �κ� ���ڿ� "a", "ab", bac" ����
 * ���� ���ڿ� "abac"�� �κ� ���ڿ��̸鼭 ���ڿ� ���� ���� ���ĺ��� �ι� �̻� ��Ÿ����
 * �����Ƿ� ���� �κ� ���ڿ��� �ƴϴ�. ���ڿ� s�� �־����� ���� �κ� ���ڿ��� ������ 
 * return �ϵ��� ������
 * 
 * ��)
 * s		result
 * "abac"	 7
 * "abcd"	10
 * "zxzxz"	4
 * 
 */

/*
 * 1. ���ڿ� �ɰ��� �Լ�
 * 2. ������ �������� �Ǻ��ϴ� �Լ�
 */


/*
 * result = ����
 * s = �Է¹��ڿ�
 * start, length = ����, ����
 * ---
 * tmp = �ڸ� ���ڿ� ��� string
 * ---
 * IsGood = ���� ���ڿ� �����Լ�
 */

public class hashSet {
	
	static HashSet<String> result = new HashSet<String>();

	public boolean add(String e) {
		return false;
	}

	// public void �Լ���(�Ķ����){
	// }
	// �Լ�����

	public void sclice_string(String str, Integer start, Integer length) {
		// string �Է¹��� ���ڿ�, ���۰�, ���̰�
		// ex) abcd
		
		String tmp = str.substring(start, length);
		
		if(IsGood(tmp)) {
			//���� �߰��ϴ� �迭
			result.add(tmp);
		}
	}

	// public boolean add() = ���� ���ڿ�
	public Boolean IsGood(String tmp) {
		
		//tmp�� ���࿡ ���� ���ڿ��̶�� true
		HashSet<String> goodArr = new HashSet<String>();
		//tmp�� ���� �迭
		String tmp1[] = tmp.split("");
		// tmp1 = [a,b,c]
		// goodArr. ������ �ְ� ������ return false
		
		for (int i = 0; i < tmp1.length(); i++) {
			
		}
		return true;
		
	}

	public static void main(String[] args) {

		String s = "zxzxz";

		
		// slice�� ����Ϸ��� substring(,)���� ���ڿ� ����

		// hashset : �ߺ�����
	
	}

}
