import java.security.PublicKey;

public class Exception6 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ����ڰ� 45*3+16+5+22*8 �ش� ���� ���� ���� ����
		 * �ܺ�Ŭ������ ����
		 * �ش� �ܺ�Ŭ���������� �ش� ���� ¦���� ��� ���� ������ �߻��ϸ�
		 * Ȧ���� ��� "Ȧ�����Դϴ�."���� �ٽ� ȸ���ϵ��� ��
		 */
		/*
		 * ���빮��. ���������� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} (Object b[]
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� �� �迭
		 * ��, ���ο����� �ش� �迭�� �ܺ� Ŭ���� (setter)�� ����
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� ���� (arraylist add
		 * getter���� �ش� �迭�� return���� �������� ��
		 * ��, �ܺ� Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó���ǵ��� ��	(paseint ����
		 */		
		
		
		aa a = new aa();
		try {
			int res =  45*3+16+5+22*8;
			
			String str = a.pr(res);
			System.out.println(str);
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}

	}

}

class aa{
	public String pr(int r) throws Exception{
		String msg="";
		if(r%2==0) {
			throw new Exception("¦��");
		}else {
			msg = "Ȧ�����Դϴ�.";
		}
		return msg;
	}
	
}