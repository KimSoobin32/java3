import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 해당 정보는 각 지점별 댐 수위현황을 적용한 데이터이다.
		 * 해당 데이터 중 100 미만의 수위를 가진 댐만
		 * 20220623.txt 파일로 내용이 저장되도록 함
		 */
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\info.txt",Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);
			//System.out.println((char)fr.read());
			ArrayList<String> al = new ArrayList<>();
			String datas = "";
			while((datas = bf.readLine())!=null) {
				al.add(datas);
			}
			System.out.println(al);
//			String str2 = al.get(0).split(",")[1];
//			System.out.println(str2);
//			double d = Integer.parseInt(str2);
//			if(d<100) {
//				System.out.println("dd");
//				System.out.println(str2);
//			}
			int w=0;
			double d2;
			String str="";
			while(w<al.size()) {
				System.out.println();
				d2 = Double.parseDouble(al.get(w).split(",")[1]);
				if(d2<100) {
					//System.out.println(d2);
					//System.out.println(al.get(w).split(",")[0]);
					str += al.get(w).split(",")[0] + " ";
				}
				
				w++;
			}
			System.out.println(str);
//			Path data5 = Paths.get("C:\\java5\\File_Strame\\src\\20220623.txt");
//			Files.createFile(data5);
			
			OutputStream os = new FileOutputStream("C:\\java5\\File_Strame\\src\\20220623.txt",true);
			byte[] data = str.getBytes();	//문자를 ASCII로 변환
			os.write(data);
			os.flush(); 	//Stream에 저장된 모든 값이 메
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}

