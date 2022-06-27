import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * InputStream > InputStreamReader > BufferedReader (o)
 * InputStream > BufferedReader (x)
 * InputStream > BufferedInputStream (o)
 * InputStreamReader > BufferedReader (o)
 * 
 * ※ BufferedReader - close() 메모리 종료, BufferedWriter - flush() 메모리를 초기화 + close()
 */

public class filelast {

	public static void main(String[] args) throws IOException {
		
		
		try {
			String url = "src\\movie_db.txt";
			FileInputStream fs = new FileInputStream(url);
			//System.out.println(fs.read());
			//byte a[] = new byte[400];
			
//			BufferedInputStream bs = new BufferedInputStream(fs);
//			System.out.println(bs.read());
			
			InputStreamReader ir = new InputStreamReader(fs,"UTF8");
			BufferedReader br = new BufferedReader(ir);
			System.out.println(br.readLine());
			
			//System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
