import java.io.FileWriter;
import java.io.IOException;

//���� ���� (write)
public class file4 {

	public static void main(String[] args) throws IOException,Exception{
		try{
			//FileWriter : ���� �����͸� ���Ͽ� ���� Class
			
			
			String user[] = {"ȫ�浿40","������60","������100","������300"};
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt");	//���� �ʱ�ȭ �� ��
			//FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt",true);
			//FileWriter true�� ����ϸ� ���� �Էµ� ������ �ʱ�ȭ���� ���� (�̾ ����
			
			//fw.write("TEST");
			
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]);	//write : ����, �迭 �����Ͱ��� ���Ͽ� ����
			}
			
			fw.close();	//���� ���»����� �����Ͽ� ����
		}catch(Exception x) {
			System.out.println("test");
		}

	}

}
