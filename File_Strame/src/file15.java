import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//�̹��� ���� �а�, ����, �뷮����
public class file15 {

	public static void main(String[] args) throws IOException {
		String file = "C:\\java5\\File_Strame\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		//stream�� �ѹ� ������ �� - �ֹ߼����� ����, �ٽ� �ؿ��������� ��� -1��
		
		//fileinputstream�� ���۷� ����ϰ� �Ǹ� ���̻� fileinputstream�� ������� ���� 
		//�� �������� ���ۿ� new fileinputstream�� �����Ͽ� ������ ����� �� �ֵ��� ������
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		
		
		byte filesize[] = new byte[is.available()];
		//System.out.println(is.read(filesize));
		
		//int total = is.read(filesize);
		
		int total = bi.read(filesize);
		
		if(total>92160) {
			System.out.println("�̹��� ���� �뷮�� 90KB ���� �Դϴ�.");
		}else {
			System.out.println("���������� ��� �Ǿ����ϴ�.");
			
		}

	}

}
