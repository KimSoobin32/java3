import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream�� �̿��� ���� �ε�
public class file11 {

	public static void main(String[] args) throws IOException {
		
		
		try {
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt");
			InputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt");	//�� �Ʒ� ��� ����
			//��Ʈ���� �ƽ�Ű�� ����
			
			System.out.println(fs.available()); //available : ���� �Է»����� (���� ��üũ��)
			
			//byte temp[] = new byte[1024*16];	//1024*16 byte = 16�ް� ,����ũ��, �ش� ũ�⸦ ������ �� ���� (�뷮) �˳��ϰ� ����- ���� �ɶ� ���
			byte temp[] = new byte[fs.available()];	//����, ������ �뷮 �迭 ���� (���� ũ�⿡ ���� �������ְ� ����)
			
			int ea = fs.read(temp);	//�ƽ�Ű�ڵ�� ��ü�� �о ea�� �޵���
			String data = new String(temp,"UTF8");	//String �������·� �迭�� �޾Ƽ� ���
			System.out.println(data);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
