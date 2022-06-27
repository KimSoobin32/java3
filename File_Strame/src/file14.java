import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

//이미지 파일 설정(binary), 영상 파일 설정 byte단위 (Filereader (x))
//FileInputStream Stream을 이용해야 함 read()만 사용
public class file14 {

	public static void main(String[] args) throws IOException{	//throws IOException or trycatch IOException catch Exception
		
		
		try {
			//String files = "";
			
			InputStream is = new FileInputStream("C:\\java5\\File_Strame\\src\\img.jpg");
			//FileInputStream fs = new FileInputStream("");
			//System.out.println(is.read());	//255 color rgb px단위, 한번 읽으면 로드되서 에러남 주석처리 필
			//Stream은 버퍼와 비숫하여 read를 사용하는 순간 해당 메모리에서 비워지는 상황이 발생 주의
			//스트림 쓰면 버퍼 쓸 필요 없음
			
			//byte b[] = new byte[is.available()];	//한 번에 다운
			//System.out.println(is.read(b)); //691961 크기 (몇 바이트), 전체 크기 용량 확인
			
			
			byte b[] = new byte[is.available()/100];	//읽어들이는 배열의 크기를 강제로 조절함, 이미지 쪼개서 불러올 수 있음, 1024 = 1KB
			FileOutputStream os = new FileOutputStream("img_test.jpg");	//C:\java5\File_Strame에 저장됨
//			int img = is.read(b);
//			System.out.println(img);	////691962 크기 (몇 바이트), 전체 크기 용량 확인
//			os.write(b);	//반복문 사용하지 않음
			int img=0;	//읽는 바이트 수
			int check =0;	//읽는 횟수
			//while((img=is.read(b))!=-1) {
			/* 다운로드 시 로드를 출력이나, 프로그래스를 이용하여 보여줄 때 사용 */
			while(true) {	//loop
//				check += img;
//				System.out.println(check+"%");
				//os.write(b);
				
				img=is.read(b);	//해당 파일을 읽어서 바이트 변수로 넘김
				if(img==-1) {
					break;
				}else {
					
					os.write(b,0,img);	//counting 가능 (프로그레스바), 다운로드 %를 표시할 때 사용하기 위함
				}
				check++;
				if(check%2==0) {
					System.out.println(check+"%");					
				}
				
			}

			
		}catch (IOException i) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
