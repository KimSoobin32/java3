import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/*
 * ���� ��ɾ� ���� : read()�ѱ���, readLine()����ü�аڴ�, next(), nextLine()
 */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());	//FileReader�� readLine�� ��
			
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� ����
			BufferedReader bf = new BufferedReader(fr);	//readLine()���� �ش� ���� ���
			//bf.close();	//bf�Ӿƴ϶� fr�� ����
			//System.out.println(bf.readLine());	//ù�ٸ� ���, �ش� �ӽ�����ҿ��� ����� ���� �� ��ü �Ѱ��� �������� �ε��ϰ� ��
			/* 
			 * Buffer�� ���ʰ��� ����Ͽ��� ��� ������ ���� ������ ���� ����ϰ� �� 
			 * ���ǹ� ���ÿ��� �ѹ� �۵��� �̷������ �� - ����Լ� Ȱ���ؾ� ��
			 */
//			if(bf.readLine()!=null) {	//���� �߻�
//				System.out.println(bf.readLine());
//			}
			//String data = bf.readLine();
			
			//�ݺ������� ���
//			int w=0;
//			while(w<=1) {
//				String data = bf.readLine();
//				System.out.println(data);
//				
//				
//				w++;
//			}
			/*
			 * Buffer�� �ӵ��� ���� ��� ��� �κп� ������ ���� �Ǵ� �迭��
			 * ���� �� ����ϴ� ���� ����
			 */
			String line="";
			while((line=bf.readLine())!=null) {
				
				System.out.println(line);
			}
			
			/*
			 * ���� �����͹����� ���ΰ����� Ȯ��
			 * LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ����
			 */
			FileReader fr2 = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());	//FileReader�� readLine�� ��
			LineNumberReader li = new LineNumberReader(fr2);
			//System.out.println(li);
			int ea =0;
			while((li.readLine())!=null) {
				ea = li.getLineNumber();	//2
				
			}
			System.out.println(ea);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
