package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (�迭��) - add,remove,get,size
		//Map (�迭Ű, �迭��) - put,remove,get,size
		//Map�� �迭Ű�� ����̱� ���п� Ű�� ���ؼ� �����͸� Ȯ�� ��(�ӵ� �ֻ��)
		//���� Ű�� ��� �� �������� ����� ������ ���� ��
		//�� Ű���� ���� �ߺ���Ű�� ����
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 0x21949CB (�ߺ����� �߻����� ����)
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");	//Ű �ߺ��Ǹ� ���������� �ݿ���(if hong
		System.out.println(m.get("hong"));
		m.put("park", "");		//Ű�� ������ ���� ����ִ� ���� ��� ��
		m.put("", "�����ż�");		//����ִ� Ű�� ����� �� �� ������, Map�� �������� �ùٸ��� ����
		if(m.get("park").equals("")) {	//�� ��������� �־��
			m.put("park", "��");
		}
		System.out.println(m.get("park"));	//��
		m.remove("hong");
		System.out.println(m);	//{=�����ż�, kang=������, park=��}
		
		//Map : �������� �ڷ����� ����� �� ����
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
		//System.out.println(m2.get("level"));
		System.out.println(m2);	//{level=5, age=32}
		System.out.println(m2.keySet());	//Ű�� ���[level, age]
		System.out.println(m2.values());	//���� ���[5, 32]
		System.out.println(m2.containsKey("age"));	//�ش� Ű�� �ִ��� Ȯ�� (false:����, true:����)
		

	}

}
