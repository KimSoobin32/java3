import java.io.IOException;
import java.nio.file.Files;	//new io - java�ֽŹ���
import java.nio.file.Paths;
import java.util.List;

//Files�� �ش� ��� ������ �迭�� ���� ��Ű�� ���
public class file8 {

	public static void main(String[] args) throws IOException{
		//List�� �ֻ��� �迭 Ŭ����
		//Files : �ű� IOŬ����, readAllLines() - ��ü ������ �ѹ��� ��� ����
		//Files + Paths.get("���") �԰� ��
		//���� �������� ������
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Strame\\src\\buffer.txt"));
		System.out.println(data);
		
		//���� : �޸� �Ҵ� ������, �ѱ� �����Ŷ�� �����ؾ� ��, �ǰ������� ����..
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Strame\\src\\buffer.txt"));
		System.out.println(new String(data2));
	}

}
