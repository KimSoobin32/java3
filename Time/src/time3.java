
public class time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}catch(InterruptedException a) {
			System.out.println(a);
		}
		*/
		/*
		 * ���빮��. �ܺ� class�� �ִ�. ��, ���� Ŭ�������� �ش�
		 * �ܺ� class�� �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʵ��� �ε��� �߻�
		 * 8�ʵ��� "ó�����Դϴ�. ��ø� ��ٷ��ּ���."
		 * 8�� ���Ŀ� return���� "�Ա��� ��� ó���Ǿ����ϴ�."��� ���ڸ� �޵��� ��
		 */
		bank a = new bank();
		a.money();

	}

}
class bank{
	
	public void money() {
		
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ��ּ���.");
			
			Thread.sleep(3000);	
			String kkk = this.msg();
			System.out.println(kkk);


		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
	}
	public String msg() {
		return "�Ա� ��";
	}

	
	
}
