
public class oop3 {
//Multi Thread(��Ƽ ������) : start, run, sleep, setStop
//��Ƽ ������ : CPU�� �ھ�� ���谡 �ִ�.
	public static void main(String[] args) {
		//������(Thread) : ���μ��� ���ο��� ���������� ����Ǵ� �۾��� ����
		//Multi Thread(��Ƽ ������) : ���μ��� ���ο��� �ΰ��� �̻��� �۾��� ���û��
		
		//������ -> ���� -���ѹ����Ѱ���
		//��Ƽ������ -> ����, ��Ʃ��, ���� (��Ƽ �½�ŷ) �����۾� �ѹ���
		
 		Thread my = new mythread();	//�θ� �޼ҵ� = �ڽĸ޼ҵ�
		//����������� : �ڽĸ޼ҵ� = �ڽ� �޼ҵ�
 		my.start();	//Thread �޼ҵ忡 �⺻ run�� �۵��ϱ� ���� start ��ɾ�(�޼ҵ�)
 		
 		Thread my2 = new test2();
 		my2.start();
 		
		int ct = 1;
		while(ct<=10) {
			System.out.println("����Ŭ����: "+ct);
			ct++;
		}
	}

}

class test2 extends Thread{
	@Override
	public void run() {	//multi thread �⺻�� public
		int w=1;
		do {
			System.out.println("�ܺ�Ŭ����2: "+w);
			w++;
		}while(w<=10);
	}
}

class mythread extends Thread{	//Thread : JVM �⺻���� ž��Ǿ��ִ� �޼ҵ�, Thread�� �ܵ����� ������� ����(Ŭ���������� ���� ����, extends��..)
	@Override
	public void run() {	//run�̶� : ��Ƽ�޼ҵ� �⺻ ���� �޼ҵ�
		int w=1;
		do {
			System.out.println("�ܺ�Ŭ����: "+w);
			w++;
		}while(w<=10);
		
	}
}
//���� ���������� ��� �ٸ��� ����