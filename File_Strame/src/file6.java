import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Scanner를 이용한 파일 쓰기 사용법(input)
public class file6 {

	public static void main(String[] args) throws IOException{
		try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\db.txt",true);
			Scanner sc = new Scanner(System.in);
			System.out.println("내용을 입력해주세요.");
			for(int a=0;a<3;a++) {	//3번 반복
				String notice = sc.nextLine() + "\n";
				fw.write(notice);	//해당 입력사항을 db.txt에 저장시킴
				
			}
			
			sc.close();
			fw.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
