import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		try {
			//FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\list.txt");	//java 8version
			
			//Charset.forName : JAVA12 -> EUCKR(ANSI), UTF8, UTF16 (파일이 utf8이면 UTF8써야 함)
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\list.txt",Charset.forName("EUCKR"));	//java최신 version, EUCKR한글
			//System.out.println(fr.getEncoding());	//인코더 형식을 확인 (ex UTF8) FileReader
			//System.out.println(fr.read());	//데이터 크기
			
			while(true) {	//loop를 활용하여 해당 파일에 문자를 모두 가져옴
				int m = fr.read();	//-1 : 내용이 없음(더이상 문자가 없을 경우)
				System.out.print((char)m);	//한글자 읽음, 2byte 기본 char로 사용
				if(m==-1) {	//더 이상 가져올 문자가 없을 경우 루프 빠녀나감
					break;
				}
				
			}
			
			fr.close();	//FileReader를 종료함, 넣어야 변경된 파일 읽어옴 아니면 옛날 팡릴읽어옴
		}catch(IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		

	}

}
