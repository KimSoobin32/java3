import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file13 {

	public static void main(String[] args) throws Exception{
		try {
			//createDirectories : 신규 디렉토리 생성
			//Files.createDirectories(Paths.get("C:\\java5\\File_Strame\\src\\test"));
			
			/*
			//파일 복사
			Path data1 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db2.txt");
			Files.copy(data1, data2);
			*/
			
			/*
			//파일 위치 변경 (해당 파일을 다른 디렉토리로 이동)
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db2.txt");
			Path directory = Paths.get("C:\\java5\\movie_db2.txt");
			Files.move(data3,directory);
			*/
			
			/*
			//해당 파일 지우기
			Path data4 = Paths.get("C:\\java5\\Swing\\src\\swing1\\mandu2.jpg");
			Files.delete(data4);
			*/
			
			//해당 파일 생성 (빈파일)
			Path data5 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db3.txt");
			Files.createFile(data5);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
