import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exception7 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ���������� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} (Object b[]
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� �� �迭
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� ����
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� ���� (arraylist add
		 * getter���� �ش� �迭�� return���� �������� ��
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó���ǵ��� ��
		 */
		try {
			Object o[] = {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
			bb b = new bb();
			b.setter(o);
			
			LinkedList<String> res = b.getter();	//return�޴� ���� �迭 class�̹Ƿ� �ش� class������ ���� �� �޾ƾ� ��
			System.out.println(res);

		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	

}

class bb{	
	LinkedList<String> al = new LinkedList<>();

	public void setter(Object[] d) throws Exception{
		//System.out.println(Arrays.toString(d));
		int w=0;
		int ea = d.length;
		//int check = Integer.valueOf((int)d[1]);
//		int ck = (int)d[0];
//		System.out.println(ck);
		//String str = new String((String)d[0]);
//		String str = (String)d[0];
//		System.out.println(str);
		do {	//�ݺ��� �� trycatch
			try {
				String check = String.valueOf((String)d[w]);	//�ش� �迭�� �ε� �� (�ڷ���)��ȯ�� �ϴ� ������ Object�迭�̹Ƿ� �����Ͽ���
				//System.out.println(check);
				this.al.add(check);
				
			}catch (Exception ex) {	//�ڽ� Ŭ�������� ���� �߻� �� ��µǴ� catch��, ��, throw ����ϸ� �ٽ� main���� ���޵�, �߿������ throw�� ���� �� �ش� �ݺ����� �����ϰ� ��
				//throw ex;	//->main���� ó�� (�ݺ��� ����)
				//System.out.println(ex);	//���⼭ ó�� (�ݺ��� ��� ����)
			}

			
			w++;
		}while(w<ea);
		
	}
	public LinkedList<String> getter() {	//�迭 class
		
		return this.al;
	}
	
}