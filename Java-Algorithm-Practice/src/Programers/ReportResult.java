package Programers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReportResult {
	public static void main(String[] args) {
		// �Ű� ��� īī�� ����
		// ���̵� ���
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		// �Ű� ���� ���
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		// ������ ��� (2���̻� �Ű� ���ϸ� ����)
		String[] result = {};
		int k = 0;
		Map<String, HashSet<String>> reportMap = new HashMap<>();
		
		Map<String, Integer> getMailCount = new HashMap<>();
		
		for(String id: id_list) {
			getMailCount.put(id,0);
			System.out.println(id);
			System.out.println(getMailCount);
		}
		if(k >= 2) {
			// �Ű� 2�� �̻� ������ ��� �����ϰ� �����
		}
	}
}
