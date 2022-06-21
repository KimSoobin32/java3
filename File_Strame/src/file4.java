import java.io.FileWriter;
import java.io.IOException;

//파일 쓰기 (write)
public class file4 {

	public static void main(String[] args) throws IOException,Exception{
		try{
			//FileWriter : 문자 데이터를 파일에 쓰는 Class
			
			
			String user[] = {"홍길동40","김유신60","강감찬100","유관순300"};
			FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt");	//기존 초기화 후 씀
			//FileWriter fw = new FileWriter("C:\\java5\\File_Strame\\src\\array.txt",true);
			//FileWriter true를 사용하면 기존 입력된 사항을 초기화하지 않음 (이어씀 쌓임
			
			//fw.write("TEST");
			
			for(int f=0;f<user.length;f++) {
				System.out.println(user[f]);
				fw.write(user[f]);	//write : 문자, 배열 데이터값을 파일에 적용
			}
			
			fw.close();	//파일 오픈사항을 종료하여 적용
		}catch(Exception x) {
			System.out.println("test");
		}

	}

}
