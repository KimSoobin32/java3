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
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\movie_db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
			ArrayList<String> al = new ArrayList<>();
			
			

			
			while(sc.hasNext()) {
				al.add(sc.nextLine());
			}
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("�˻��� ��ȭ������ �Է��ϼ���.");
			String title = sc2.nextLine().intern();
			
			

			String bb;
			int d = 0;
//			String aa[];
			boolean ck = false;
			do {
//				aa = al.get(d).split(" - ");
//				
//				if(title==aa[0].intern()) {
//					System.out.println(al.get(d));
//					ck=true;
//					break;
//				}
				bb = al.get(d);
				if(bb.indexOf(title)!=-1) {
					System.out.println(al.get(d));
					ck=true;
					break;
				}
				
								
				d++;
			}while(d<al.size());
			if(ck==false) {
				System.out.println("�˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.");
			}
			sc.close();
			sc2.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
