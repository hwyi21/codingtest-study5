package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public Solution() {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(solution(record));
	}
	
	/*
	 * 1. uid���ڸ� key / value�� �г������� hashmap ����
	 * 2. ������ �ձ��ڰ� E�� L�� ��� �Ǵ�
	 * 3. ������ ������ �������� split
	 * 4. �迭�� �ι�° uid���ڸ� key�� �̿��Ͽ� hashmap�� ����Ǿ��ִ� �г��� ��������
	 * */
	public List solution(String[] record) {
        List answer = new ArrayList();
        Map<String, String> user = new HashMap<String, String>();
        
        for(int i=0; i<record.length; i++) {
        	String[] temp = record[i].split(" ");
        	if(temp.length==3) {
        		user.put(temp[1], temp[2]);
        	}
        }
        
        for(int i=0; i<record.length;i++) {
        	String first = record[i].substring(0,1);
        	String[] temp = record[i].split(" ");
        	if(first.equals("E")) {
        		String result = user.get(temp[1])+"���� ���Խ��ϴ�.";
        		answer.add(result);
        	}else if(first.equals("L")) {
        		String result = user.get(temp[1])+"���� �������ϴ�.";
        		answer.add(result);
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		new Solution();
	}

}
