
public class Example5 {

	public static void main(String[] args) {
		/*
		 * extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ�
		 * ���� �ΰ��� �Է�
		 * �ΰ��� ���ڸ� Ȯ���Ͽ� ������ ���� üũ
		 * ù��° ���ڰ� �ι�° ���ں��� ���� ���
		 * ù��° ���ڰ� �ι�° ���ں��� Ŭ ���
		 * ù��° ���ڰ� �ι�° ���ڿ� ���� ���
		 * 
		 * ù��° ���ڰ� Ŭ ��� : �ش� �ΰ��� ���� ��ģ ����� ���
		 * �ι�° ���ڰ� Ŭ ��� : �ش� ������ŭ ���ڸ� ��� ���� ��� �� ���
		 * ù��°�� �ι�° ���ڰ� ���� ��� : "�ش� ���� �����ϴ�."��� �޼��� ���
		 * 
		 */
		int a = 1;
		int b = 10;
		ex2 e = new ex2();
		e.check(a, b);
		int res = e.out();
		System.out.println(res);
		e = null;
		System.exit(0);
		System.gc();

	}

}

class ex1{
	protected int result = 0;
	//protected boolean same = false;
	public void check(int n1, int n2) {
		if(n1>n2) {
			this.result = n1+n2;
		} else if(n1<n2) {
			int d = n1;
			do {
				this.result += d;
				d++;
			}while(d<=n2);
			
		} else {
			//this.same = true;
			System.out.println("�ش� ���� �����ϴ�.");
			System.exit(0);
		}
	}
	
}

class ex2 extends ex1{
	public int out() {
//		if(this.same == true) {
//			System.out.println("�ش� ���� �����ϴ�.");
//		} else {
			//System.out.println(this.result);
//		}
		return this.result;
		
	}
}
