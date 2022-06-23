import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//Stream을 이용한 파일 로드
public class file11 {

	public static void main(String[] args) throws IOException {
		
		
		try {
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt");
			InputStream fs = new FileInputStream("C:\\java5\\File_Strame\\src\\list.txt");	//위 아래 방식 같음
			//스트림은 아스키로 읽음
			
			System.out.println(fs.available()); //available : 파일 입력사이즈 (파일 전체크기)
			
			//byte temp[] = new byte[1024*16];	//1024*16 byte = 16메가 ,파일크기, 해당 크기를 설정할 수 있음 (용량) 넉넉하게 잡자- 제약 걸때 사용
			byte temp[] = new byte[fs.available()];	//ㅊㅊ, 무제한 용량 배열 파일 (파일 크기에 때라서 유동성있게 변함)
			
			int ea = fs.read(temp);	//아스키코드로 전체를 읽어서 ea에 받도록
			String data = new String(temp,"UTF8");	//String 문자형태로 배열을 받아서 출력
			System.out.println(data);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
