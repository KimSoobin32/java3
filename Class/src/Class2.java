
public class Class2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���� Ŭ������ �̿��Ͽ� �ڽ�Ŭ������ ������� ����ϴ� ���μ��� ����
		 * Ŭ������ 2���� �ִ�.
		 * �θ� Ŭ���� �� : mother
		 * �ڽ� Ŭ���� �� : child
		 * ���� Ŭ�������� motherŬ������ ���� ���� ����
		 * 30, 50 ���ڰ��� ����
		 * child���� �θ� Ŭ������ �ִ� ���� �޾� �ΰ��� ���ڸ� ���� ���� ���
		 * 
		 */
		mother m = new mother();
		m.m_me(30, 50);
		mother.child mc = m.new child();
		mc.c_me();

	}

}

class mother{
	int n1,n2;
	public void m_me(int a, int b) {
		//System.out.println(a+" "+b);
		this.n1 = a;
		this.n2 = b;
	}
	
	class child{
		int aa = mother.this.n1;
		int bb = mother.this.n2;
		public void c_me() {			
			//System.out.println(mother.this.n1 * mother.this.n2);
			int cc = this.aa * this.bb;
			System.out.println(cc);
		}
	}
}
