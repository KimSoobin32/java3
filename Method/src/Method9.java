import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 * ���빮�� �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�.
		 * �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ�(Y,N)���� ����
		 * �ش� Ȱ��ȭ ���� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´�
		 * �޴����� 1���迭�� �籸�� �� ���ο��� ���
		 * ��� : [���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]
		 * ��, private �� return�� Ȱ���Ͽ� ���α׷� �ۼ�
		 */
		menus m = new menus();
		System.out.println(Arrays.toString(m.get()));

	}

}

class menus{
	private String arr[][];
	private String na[];

	public menus() {
		String ms[][] = {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}				
		};
		this.arr = ms;
		aa();
		//this.na = new String[this.arr[0].length];
	}
	public void aa() {
	int w = 0;
	int adl = arr[0].length;
	int ct = 0;
	//this.na = new String[adl];
	String ww[] = new String[adl];
	while(w<adl) {
		if(this.arr[1][w].equals("Y")) {
			//this.na[ct] = this.arr[0][w];
			ww[ct] = this.arr[0][w];
			ct++;
		}
		w++;
	}

	this.na = ww;
	
	}
	public String[] get() {
		return this.na;
	}
}

/*
class aaa{
	//field
	int a;
	String b;
	
	//constructor
	public aaa(){
		
	}
	
	//method(�ʼ�)
	public void
	public static void
	public String abc
}
*/