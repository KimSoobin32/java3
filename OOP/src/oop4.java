
public class oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		
		//ab_1 a1 = new ab_1(); �� ��
		
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
		ab.ab_b();

	}

}

abstract class ab_1{	//�߻� Ŭ����(�ܺο��� �ε尡 ���� �ȵ�) - ��ü ���� �ȵ�

	public void ab_a() {	//ȯ�� ���� ��, �ڽĿ��� �̰� �ߺ����� �ʰ�..
		System.out.println("�θ� Ŭ�����Դϴ�.");
	}
	public void ab_b() {	//free ����(�μ��� ���� �޼ҵ�), �ڽ�Ŭ�������� ����ص� �ǰ� ���ص� ��
		
	}//free�� ��� abstract ��õ, �����̳� ȯ�� ������ �ʿ��ϸ� abstract �� ��
//	public abstract int b() {
//		
//	} ��� �� �� abstract��(�������̽�ó��..
	public abstract int b();	//�߻� �޼ҵ�(free����) - ��ü ���� �ȵ�, ������ �ڽ� Ŭ�������� ���, ���ϸ޼ҵ忡�� �ַ� ���
}
//abstract�� ������ �� ������ �����
class ab_2 extends ab_1{
	
	@Override
	public void ab_b(){
		System.out.println(this.c());
	}
	@Override
	public int b() {	//���� �޼ҵ� + �߻�޼ҵ�(�������̵�)
		return 55;
	}
	public int c() {
		return 99;
	}
//	public int c() {
//		return 99;
//	} ������ abstract �÷����� ���
}
