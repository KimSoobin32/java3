import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//이미지 일기, 쓰기
public class file16 {

	public static void main(String[] args) throws IOException{
		//r,w,x => r(read):읽기, w(write):쓰기, x(execute):실행
		
		//RandomAccessFile : 사용자가 해당 파일송성 권한을 설정할 수 있음
		//최신버전
		
		try {
			String files ="C:\\java5\\File_Strame\\src\\img.jpg";
			String cp ="img222.jpg";
			RandomAccessFile file = new RandomAccessFile(files, "r");
			RandomAccessFile file2 = new RandomAccessFile(cp, "rw");
			
			
			//FileChannel : IO(FileInputStream, FileOutpusStream) 같은 형태, 두 성능 다 가짐
			//getChannel() : RandomAccessFile 해당 메소드를 가져오는 역할
			
			FileChannel fc = file.getChannel();
			FileChannel target = file2.getChannel();
			
			//transgerTo, transferFrom (복사형태) 방법 2가지
			//fc.transferTo(0, fc.size(), target);	//어디부터 어디까지 타겟에 (배열0, 배열끝번호, 복사위치)
			target.transferFrom(fc, 0, fc.size());	//(복사할 파일, 배열0, 배열끝번호)
			
			System.out.println(fc);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
