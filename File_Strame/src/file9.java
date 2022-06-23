import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

//Reader(�ֻ���) 
// (����) BufferedReader, FileReader, CharArrayReader - �������� ASCII
// (����) InputStreamReader - �̹���,������,�����


//InputStream(�Է�)
public class file9 {

	public static void main(String[] args) {	//IOException��� o
		//Stream : �̹���, ������, ����� ���� ������ �ε��ϱ� ���ؼ� (���̳ʸ�)
		//InputStream : ��� �Է���ġ�� ���� ���� �޴� Ŭ����. �⺻(int)
		//InputStream (�ֻ��� �Է���ġ)
		// - (���� Ŭ����)FileInputStream, AudioInputStream, ObjectInputStream �� ���� �� ����
		
		
		
		InputStream is = new InputStream() {	//�⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ� �ҷ���,close �ʿ� ����
			
			@Override
			public int read() throws IOException {	//byte 1~2 1024 1000 ����Ʈ ���� �ø� �� ����
				int a = 15;
				return a;
			}
			
			
		};
		
		//InputStreamReader ��� ����- �����Ŷ ���� - FileinputStream
		//InputStreamReader("���ϸ�",EUCKR) or InputStreamReader("���ϸ�",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8"));
		try {
			System.out.println(ir.read());
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		Reader r = new Reader() {
			
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		//Ű���� �� �ε�
		InputStream user = System.in;	//Ű���� �Է� ASCII �ڵ尪�� ��ȯ
		try {
			int code = user.read();
			if(code==13) {
				System.out.println("����Ű�� ����Ͻ� �� �����ϴ�.");
			}
			System.out.println(code);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
