
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �ΰ��� ���� �ܺ� Ŭ������ ����
		 * �ش� Ŭ�������� �ΰ��� ���� ���
		 * ��� ������ ������ ����.
		 * 3, 10�� ������ �Ǹ� �ΰ��� ���� ���� ����
		 * ������ �ܺ� Ŭ�������� �ش� ������� ����ϴµ�,
		 * �ΰ��� �� ���� ¦��, Ȧ�� ������ ����ϴ� extends�� ����
		 */
		int a = 3;
		int b = 11;
		pr p = new pr();
		p.hap(a, b);
		p.print();
		
	}

}
class ma{

	protected int tot;
	public void hap(int n1, int n2) {
		this.tot = n1+n2;
	}
	
}

class pr extends ma{
	public void print() {
		System.out.println(this.tot);
		if(this.tot%2==0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}

	}
}