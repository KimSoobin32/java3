import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일 로드 사용법(output)
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input
		//system.out : output
		try {
			//File fr = new File("C:\\java5\\File_Strame\\src\\db.txt"); 쓰면 ㄴㄴ, FileReader쓰자, 뭐쓰느냐에 따라 문법 다 바뀜..
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\db.txt",Charset.forName("UTF8"));
			//Scanner sc = new Scanner(new FileReader("C:\\java5\\File_Strame\\src\\db.txt"));
			Scanner sc = new Scanner(fr);	//system.in(사용자가 직접 입력), FileReader:파일을 로드
			/*
			for(;;) {	//loop시 예외처리로 빠질 수 있음 - 한바퀴 더 돌기 때문에			
				String result = sc.nextLine();	//파일로드 된 입력값을 result한테 전달, nextLine:안쓰면 띄어쓰기도 줄바꿈됨
				if(result!=null) {
					System.out.println(result);	//출력
					
				}else {
					sc.close();
					break;
				}
			}
			*/
			int count =0;
			
			while(sc.hasNext()) {	//hashNext() : true, false
				//sc.nextLine();
				System.out.println(sc.nextLine());
				count++;
			}
			System.out.println(count);
			//close 주의!!
			sc.close();
			fr.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
