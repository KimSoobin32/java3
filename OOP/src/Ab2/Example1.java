package Ab2;

public class Example1 {

	public static void main(String[] args) {
		home h[] = {new computer(), new monitor(), new phone()};	//�������̽� ����
		
//		h[0].broken(40);
//		h[1].broken(0);
		//h[2].broken(39);
		
		//����
//		phone ph = new phone();
//		//ph.broken(10);
//		ph.broken(0);
		
		home2 h2[] = { new phone() };	//extends�� home�� �ε��Ͽ���
		h2[0].broken(45);
		
		

	}

}

class computer implements home{
	@Override
	public void poweron() {
		System.out.println("��ǻ�� ���� ���� ��!!");
	}
	@Override
	public void poweroff() {
		System.out.println("��ǻ�� ���� �ߴ�!!");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("��ǻ�� ����!!");
		} else if(this.bk > n && n > 0) {
			this.poweron();
		}else {
			this.poweroff();
		}
		
	}
}

class monitor implements home{
	@Override
	public void poweron() {
		System.out.println("����� ���� ���� ��!!");
	}
	@Override
	public void poweroff() {
		System.out.println("����� ���� �ߴ�!!");
		
	}
	@Override
	public void broken(int n) {
		if(this.bk <= n) {
			System.out.println("����� ����!!");
		} else if(this.bk > n && n > 0) {
			this.poweron();
		}else {
			this.poweroff();
		}
		
	}
	
}
/*
 * �޴����� �߰� ����� �ʿ�
 * �޴��� ���� �� �ּ�����(20) -> ���� �۵��� 40~79, 80�̻� �Ǹ� ���� 
 * 1. ������ ���޵����� ȭ���� ���峯 ��� (���� �� �۵� �ȵǴ� ���) - 20���� 39����
 * 2. ������ ���޽�Ű���� ���͸� ������ �ȵ� ��� (������ �ƿ� �ȵǴ� ���) - 20�̸� ������ ���
 * 
 */
class phone implements home, home2{
	@Override
	public void powercheck1() {
		//System.out.println(p);
//		if(p>=40) {
//			System.out.println("����");
//		}else if(p>=20) {
//			System.out.println("������ ���޵����� ȭ���� ����");
//		}
		System.out.println("������ ���޵����� ȭ���� ���峯 ���");
		
		
	}
	@Override
	public void powercheck2() {
		System.out.println("������ ���޽�Ű���� ���͸� ������ �ȵ� ���");
		
	}
	@Override
	public void poweron() {
		System.out.println("�޴��� ���� ���� ��!!");
	}
	@Override
	public void poweroff() {
		System.out.println("�޴��� ���� �ߴ�!!");
		
	}
	@Override
	public void broken(int n) {
//		this.powercheck1(n);
		//System.out.println(n);
//		if(this.bk <= n) {			
//			System.out.println("�޴��� ����!!");
//		} else if(this.bk > n && n >= 20) {
//			this.powercheck1(n);
//			//this.poweron();
//		}else if(n<20){
//			System.out.println("������ ���޽�Ű���� ���͸� ������ �ȵ� ���");
//			//this.poweroff();
//			
//		}
		if(this.bk <= n) {			
			System.out.println("�޴��� ����!!");
		} else if(this.bk > n && n > 0) {
			if(n<20) {
				this.powercheck2();
			}else if(n>=20 && n<=39) {
				this.powercheck1();
			}else{		
				this.poweron();
				
			}
			
		}
	}
	
}