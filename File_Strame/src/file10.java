import java.io.OutputStream;
import java.util.Arrays;

//OutputStream (output) - 최상위
//(하위) FileoutputStream, ObjectOutputStream, AudioOutputStream
public class file10 {

	public static void main(String[] args) {
		
		//String a = "홍길동";	//문자
		String a = "123456789";
		
		//byte[] : 문자열을 ASCII형태의 배열로 변경할 때 사용
		byte[] b = a.getBytes();	//getBytes("언어패킷") 메소드
		System.out.println(Arrays.toString(b));
		
		OutputStream os = System.out;	//출력만 사용 System.out.print 역할
		
		try {
			os.write(b,0,b.length);	//(byte배열 이름, 배열번호, 배열 크기) ASCII를 번역[49, 50, 51, 52, 53, 54, 55, 56, 57]
			os.flush();	//출력 파트123456789
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
