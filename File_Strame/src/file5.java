import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���� �ε� ����(output)
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input
		//system.out : output
		try {
			//File fr = new File("C:\\java5\\File_Strame\\src\\db.txt"); ���� ����, FileReader����, �������Ŀ� ���� ���� �� �ٲ�..
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8"));
			//Scanner sc = new Scanner(new FileReader("C:\\java5\\File_Strame\\src\\db.txt"));
			Scanner sc = new Scanner(fr);	//system.in(����ڰ� ���� �Է�), FileReader:������ �ε�
			/*
			for(;;) {	//loop�� ����ó���� ���� �� ���� - �ѹ��� �� ���� ������			
				String result = sc.nextLine();	//���Ϸε� �� �Է°��� result���� ����, nextLine:�Ⱦ��� ���⵵ �ٹٲ޵�
				if(result!=null) {
					System.out.println(result);	//���
					
				}else {
					sc.close();
					break;
				}
			}
			*/
			int count =0;
			
			while(sc.hasNext()) {	//hashNext() : true, false
				//sc.nextLine();
				System.out.println(sc.nextLine());
				count++;
			}
			System.out.println(count);
			//close ����!!
			sc.close();
			fr.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
