import java.io.OutputStream;
import java.util.Arrays;

//OutputStream (output) - �ֻ���
//(����) FileoutputStream, ObjectOutputStream, AudioOutputStream
public class file10 {

	public static void main(String[] args) {
		
		//String a = "ȫ�浿";	//����
		String a = "123456789";
		
		//byte[] : ���ڿ��� ASCII������ �迭�� ������ �� ���
		byte[] b = a.getBytes();	//getBytes("�����Ŷ") �޼ҵ�
		System.out.println(Arrays.toString(b));
		
		OutputStream os = System.out;	//��¸� ��� System.out.print ����
		
		try {
			os.write(b,0,b.length);	//(byte�迭 �̸�, �迭��ȣ, �迭 ũ��) ASCII�� ����[49, 50, 51, 52, 53, 54, 55, 56, 57]
			os.flush();	//��� ��Ʈ123456789
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
