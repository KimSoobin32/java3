import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭 ������ : "ȫ�浿", "�̼���", "������" ������ �����Ͱ� �ֽ��ϴ�.
		 * ���� Ŭ�������� ���ڸ� �ϳ� ����
		 * ��, ���ڰ� null ���� �� ������, �迭 �����Ϳ� ���� ���� "������"�̶�� ���� ���� ����
		 * �ܺ� Ŭ������ : data_list �̸�
		 * �߻� Ŭ������ : v_construct �̴�.
		 * �ܺ� Ŭ���� �ȿ� ���� Ŭ���� ���� : check �̴�.
		 * 
		 * [�������]
		 * ���� class���� �������� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�."���
		 * ���� class���� �̼����� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�."���
		 * ��, ArrayList�� �迭�� �ε�
		 * 
		 * ���ο��� ����Ʈ
		 */
		String name ="�̼���";
		data_list d = new data_list();
		d.set(name);
		
//		data_list.check c = d.new check();
//		c.call();

	}

}

abstract class v_construct{
	String user_name;
//	String arr[] = {"ȫ�浿", "�̼���", "������"};
//	ArrayList<String> ulist = new ArrayList<>(Arrays.asList(arr));
	public abstract void set(String n);
	
}

class data_list extends v_construct{
	String name;
	@Override
	public void set(String n) {
		if(n==null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		}else {
			this.name = n;
			check c = new check();	//�޼ҵ� �� Ŭ���� ���𰡴�!
			c.db();
		}		
	}
	
	class check{
		String n = data_list.this.name;	//�θ�Ŭ�������� ���� ���� �ڽ� Ŭ������ �̰�
		String arr[];	//�ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> users = null;	//ArrayList util�� �ʵ忡 ��ü ����
		//ArrayList<String> users = new ArrayList<>(Arrays.asList(arr)); �д� ���� ������ ����(field->method)
//		ArrayList<String> users = data_list.this.ulist;
		public void db() {
			//�ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ������
			this.arr = new String[] {"ȫ�浿", "�̼���", "������"};
			this.users = new ArrayList<>(Arrays.asList(this.arr));	//this�� ó��
			this.call();	//���� DB�� ����� ������ ���ϴ� �޼ҵ�
		}
		
		public void call() {
			
			int w = 0;
			int wl = this.users.size();
			String msg = "";
			while(w<wl) {
				try {
					if(this.n.equals(this.users.get(w))) {
						msg = "�ش� ����ڰ� �ֽ��ϴ�.";
						break;
					} else {
						msg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�.";
					}
					
				}catch(Exception e) {
					msg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�.n";
				}
				w++;
			}
			System.out.println(msg);
			
			
		}
		
	}
}
