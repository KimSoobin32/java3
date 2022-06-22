import java.io.IOException;
import java.nio.file.Files;	//new io - java최신버전
import java.nio.file.Paths;
import java.util.List;

//Files로 해당 모든 내용을 배열로 전송 시키는 방법
public class file8 {

	public static void main(String[] args) throws IOException{
		//List는 최상위 배열 클래스
		//Files : 신규 IO클래스, readAllLines() - 전체 내용을 한번에 모두 읽음
		//Files + Paths.get("경로") 함계 씀
		//엔터 기준으로 나눠짐
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Strame\\src\\buffer.txt"));
		System.out.println(data);
		
		//단점 : 메모리 할당 많아짐, 한글 언어패킷을 조정해야 함, 권고하지는 않음..
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Strame\\src\\buffer.txt"));
		System.out.println(new String(data2));
	}

}
