import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;
/*
 * 공통 명령어 사항 : read()한글자, readLine()줄전체읽겠다, next(), nextLine()
 */
//BufferReader (output)
public class file7 {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());	//FileReader는 readLine못 씀
			
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있음
			BufferedReader bf = new BufferedReader(fr);	//readLine()으로 해당 값을 출력
			//bf.close();	//bf뿐아니라 fr도 닫힘
			//System.out.println(bf.readLine());	//첫줄만 출력, 해당 임시저장소에서 저장된 내용 중 전체 한개의 라인으로 로드하게 됨
			/* 
			 * Buffer는 최초값을 출력하였을 경우 무조건 다음 라인의 값을 출력하게 됨 
			 * 조건문 사용시에도 한번 작동이 이루어지게 됨 - 재귀함수 활용해야 함
			 */
//			if(bf.readLine()!=null) {	//문제 발생
//				System.out.println(bf.readLine());
//			}
			//String data = bf.readLine();
			
			//반복문으로 출력
//			int w=0;
//			while(w<=1) {
//				String data = bf.readLine();
//				System.out.println(data);
//				
//				
//				w++;
//			}
			/*
			 * Buffer는 속도가 빠른 대신 사용 부분에 무조건 변수 또는 배열로
			 * 받은 후 사용하는 것을 권장
			 */
			String line="";
			while((line=bf.readLine())!=null) {
				
				System.out.println(line);
			}
			
			/*
			 * 현재 데이터문서의 라인갯수를 확인
			 * LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스
			 */
			FileReader fr2 = new FileReader("C:\\java5\\File_Strame\\src\\buffer.txt",Charset.forName("UTF8"));
			//System.out.println((char)fr.read());	//FileReader는 readLine못 씀
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
