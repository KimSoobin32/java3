package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {
		//add(�߰�), get(�����ͷε�), remove(����), size(index����) : ArrayList��� util �޼ҵ忡�� ����ϴ� �κ�
		//Arrays.asList : �ε��� �迭 ������ ����
		//�߿� : add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���. ��, index��ȣ�� ���� �� ���� �����ϸ� �ش� index�κп� �߰���
		String member[] = {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb = new ArrayList<>(Arrays.asList(member));
		//System.out.println(mb);
		
		int ea = mb.size();
		//System.out.println(ea);4
		
		mb.add("������");
		//System.out.println(mb);[�̼���, ȫ�浿, ������, ������, ������]

		
		mb.remove(1);
		//System.out.println(mb);[�̼���, ������, ������, ������]

		
		mb.add(3,"�������");
		//System.out.println(mb);[�̼���, ������, ������, �������, ������]
		
		String checks = mb.get(2);
		System.out.println(checks);	//������
		
		/* ArrayList���� int�� ������� ����(Integer) ��� ����! */
		
		/* ���빮�� 
		 * �������� 15,22,37,8,11,19,41
		 * �ش� �������� Ŀ�����Ͽ� ���� ��� ó�� ���
		 * [7,15,22,8,11,39,41]
		 * 
		 */
		Integer numbers[] = {15,22,37,8,11,19,41};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(numbers));
		num.remove(2);
		num.remove(4);
		num.add(0,7);
		num.add(5,39);
		
		System.out.println(num);
		
		
		

	}

}
