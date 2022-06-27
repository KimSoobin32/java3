import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//이미지 파일 읽고, 쓰기, 용량제한
public class file15 {

	public static void main(String[] args) throws IOException {
		String file = "C:\\java5\\File_Strame\\src\\img.jpg";
		InputStream is = new FileInputStream(file);
		//stream은 한번 찍으면 끝 - 휘발성으로 날라감, 다시 밑에서찍으면 없어서 -1뜸
		
		//fileinputstream을 버퍼롤 사용하게 되면 더이상 fileinputstream을 사용하지 못함 
		//그 수단으로 버퍼에 new fileinputstream을 생성하여 별도로 사용할 수 있도록 세팅함
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		
		
		byte filesize[] = new byte[is.available()];
		//System.out.println(is.read(filesize));
		
		//int total = is.read(filesize);
		
		int total = bi.read(filesize);
		
		if(total>92160) {
			System.out.println("이미지 제한 용량은 90KB 까지 입니다.");
		}else {
			System.out.println("정상적으로 등록 되었습니다.");
			
		}

	}

}
