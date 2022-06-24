package Java_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll py = new payroll();
		py.start();
		int[] result = py.check();
		System.out.println("�� ��ü�� �ݾ��� "+result[0]+"�̸�, �� �ܰ� �ݾ��� "+result[1]+"�Դϴ�.");
	}

}

class payroll extends pay_abstract{
	String filename=null;
	int total = 0;
	int all_money = this.money;	//���� ���忡 �ִ� �ܰ� �ݾ��� ������
	public void input_sc() {	//�Ա� ��Ʈ
		Scanner sc = new Scanner(System.in);
		int c = 0;	//�ݺ���
		int m_in=0;	//�繫�� ����ڰ� �Է��ϴ� �޿�
		
		while(c<this.em_name.size()) {
			System.out.println("��ü�� �����մϴ�. ["+this.em_name.get(c)+"]���� ��ü�Ͻ� �ݾ��� �Է��� �ּ���: ");
			m_in = sc.nextInt();
			this.all_money -= m_in;
			this.total += m_in;	//��ü�� ��ü �ݾ�
			c++;
		}
		sc.close();
		
	}
	
	@Override
	public void start() {		
		try {
			this.filename ="C:\\javatest\\javatest\\src\\Java_Test\\employee.txt";
			this.db();
			//System.out.println(this.em_name);
			this.input_sc();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	void db() throws IOException {
		this.em_name = new ArrayList<>();	//�� �迭
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		//System.out.println(this.fr.getEncoding());	//���� ���� ���ڵ� ����
		BufferedReader br = new BufferedReader(fr);
		//System.out.println(br.readLine());	//���� ����!! buffer - �ѹ� ������ ī���� ��
		String data = br.readLine();

		String user[] = data.split(",");
		int ea=user.length;
		int w=0;
		while(w<ea) {
			this.em_name.add(user[w]);
			w++;
		}
		br.close();
		
	}
	
	@Override
	public int[] check() {
		
		
		return new int[] {this.total,this.all_money};
	}
}