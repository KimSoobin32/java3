import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���빮��. �ش� ����ڰ� ��ȭ������ �˻�
 * �ش� ��ȭ���� �´� �����Ͱ��� ���� ��� ��ȭ ��ü�� ���� ������ ����ϰ� ��
 * ��Ʈ : Scanner ���
 * "�˻��� ��ȭ������ �Է��ϼ���." ���˵���2
 * [���˵���2] - ��õ5 2022�� 4�� ����
 * 
 * "�˻��� ��ȭ������ �Է��ϼ���." �Ƿη�
 * "�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�."
 * 
 */
public class Example1 {

	public static void main(String[] args) throws IOException{
		try {
			//���� �ε� �� �޼ҵ� ����
			movie m = new movie("movie_db.txt");
			
			/*
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\movie_db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
			ArrayList<String> al = new ArrayList<>();
						
			
			while(sc.hasNext()) {
				al.add(sc.nextLine());
			}
			sc.close();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("�˻��� ��ȭ������ �Է��ϼ���.");
			String title = sc2.nextLine().intern();
			sc2.close();
			fr.close();
						
			String bb;
			int d = 0;
//			String aa[];
			boolean ck = false;
			do {
//				aa = al.get(d).split(" - ");	//split��� ���
//				
//				if(title==aa[0].intern()) {
//					System.out.println(al.get(d));
//					ck=true;
//					break;
//				}
				bb = al.get(d);
				if(bb.indexOf(title)!=-1) {	//indexof��� ���
					System.out.println(al.get(d));
					ck=true;
					break;
				}
				
								
				d++;
			}while(d<al.size());
			if(ck==false) {
				System.out.println("�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.");
			}
			*/
			
			
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("���� ���񽺰� ���������� �ʽ��ϴ�.");
			}
			
		}
		
		

	}

}

class movie{
	private String path = "C:\\java5\\File_Strame\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	public movie(String filename) throws IOException{	//�����б�
		try {
			
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.bf.close();
			this.search();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	public void custom() throws IOException {	//����Ʈ���
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		//System.out.println(this.bf.readLine());
		//String datas = ""; [, ����� �� - ��õ 3 202 ����..do while�� �� ����!!(ó�� ������� �ʰ�
		String datas = this.bf.readLine();
		do {
			this.list.add(datas);
			
		}while((datas=this.bf.readLine())!=null);
		//System.out.println(this.list);
	}
	
	public void search() {	//�˻�
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է����ּ���.");
		//indexOf, contains
		String subject = this.sc.next().intern();
		boolean call = false;
		if(subject=="����") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) {
//			if(moviesb.indexOf(subject)!=-1) {
//				System.out.println(moviesb);
//			}
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call=true;
			}
		}
		if(call==false) {
			System.out.println("�����͸� Ȯ�� �� �� �����ϴ�.");
		}
		//this.sc.close();	error
		this.search();	//����Լ� - ��� �˻� ����
	}
}
