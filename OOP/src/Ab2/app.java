package Ab2;

public class app {

	public static void main(String[] args) {
		//(�ڽ�) = (�ڽ�)
//		members mb = new members();
//		mb.opp();
//		mb.oop();
		
		//app_data2 ap = new members();
		//ap.opp2();
		//ap.oop(); error
		
		//(�θ�) = (�ڽ�) => �������̽� �������� ����� �������̵常 ȣ���� (����ȯ)
		members mb = new members();	//�ڽ� class ����
		//app_data2 ap = new members();	//�������̽� ����
		app_data2 ap = mb;	//�������̽� ����(Ŭ����->�������̽� ����)
		
		//����ȯ�� �ѹ�����
		//app_data2 ap = new members();	//�������̽� ����
		members mb2 = (members)ap;	//�ڽ� class�� �������̽��� �纯ȯ, (�������̽�->Ŭ���� ��ȯ)
		mb2.opp();
		mb2.opp2();
		mb2.oop();
		
		

		
		
	}

}
/*
class members implements app_data1{
	app_data1�� ������ �ڷ��� �����ϴ� ���
}
*/

class members implements app_data2{
	@Override
	public void opp() {
		System.out.println("Test");

	}
	@Override
	public void opp2() {
		System.out.println("Test2");
		//this.oop();

	}
	public void oop() {
		System.out.println("Test3");
	}
	
}
