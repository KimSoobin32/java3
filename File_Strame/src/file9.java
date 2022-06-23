import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

//Reader(최상위) 
// (하위) BufferedReader, FileReader, CharArrayReader - 문서파일 ASCII
// (하위) InputStreamReader - 이미지,동영상,오디오


//InputStream(입력)
public class file9 {

	public static void main(String[] args) {	//IOException없어도 o
		//Stream : 이미지, 동영상, 오디오 같은 파일을 로드하기 위해서 (바이너리)
		//InputStream : 모든 입력장치에 대한 값을 받는 클래스. 기본(int)
		//InputStream (최상위 입력장치)
		// - (하위 클래스)FileInputStream, AudioInputStream, ObjectInputStream 다 받을 수 있음
		
		
		
		InputStream is = new InputStream() {	//기본 클래스를 로드하여 오버라이드 메소드 불러옴,close 필요 없음
			
			@Override
			public int read() throws IOException {	//byte 1~2 1024 1000 바이트 단위 늘릴 수 있음
				int a = 15;
				return a;
			}
			
			
		};
		
		//InputStreamReader 사용 이유- 언어패킷 변경 - FileinputStream
		//InputStreamReader("파일명",EUCKR) or InputStreamReader("파일명",UTF8)
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
		
		
		
		//키보드 값 로드
		InputStream user = System.in;	//키보드 입력 ASCII 코드값을 반환
		try {
			int code = user.read();
			if(code==13) {
				System.out.println("엔터키는 사용하실 수 없습니다.");
			}
			System.out.println(code);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

}
