import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file13 {

	public static void main(String[] args) throws Exception{
		try {
			//createDirectories : �ű� ���丮 ����
			//Files.createDirectories(Paths.get("C:\\java5\\File_Strame\\src\\test"));
			
			/*
			//���� ����
			Path data1 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db.txt");
			Path data2 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db2.txt");
			Files.copy(data1, data2);
			*/
			
			/*
			//���� ��ġ ���� (�ش� ������ �ٸ� ���丮�� �̵�)
			Path data3 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db2.txt");
			Path directory = Paths.get("C:\\java5\\movie_db2.txt");
			Files.move(data3,directory);
			*/
			
			/*
			//�ش� ���� �����
			Path data4 = Paths.get("C:\\java5\\Swing\\src\\swing1\\mandu2.jpg");
			Files.delete(data4);
			*/
			
			//�ش� ���� ���� (������)
			Path data5 = Paths.get("C:\\java5\\File_Strame\\src\\movie_db3.txt");
			Files.createFile(data5);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
