import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 응용문제. 해당 사용자가 영화제목을 검색
 * 해당 영화제목에 맞는 데이터값이 있을 경우 영화 전체에 대한 정보를 출력하게 됨
 * 힌트 : Scanner 사용
 * "검색할 영화제목을 입력하세요." 범죄도시2
 * [범죄도시2] - 추천5 2022년 4월 개봉
 * 
 * "검색할 영화제목을 입력하세요." 뽀로로
 * "검색한 영화는 확인되지 않습니다."
 * 
 */
public class Example1 {

	public static void main(String[] args) throws IOException{
		try {			
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\movie_db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
			ArrayList<String> al = new ArrayList<>();
			
			

			
			while(sc.hasNext()) {
				al.add(sc.nextLine());
			}
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("검색할 영화제목을 입력하세요.");
			String title = sc2.nextLine().intern();
			
			

			String bb;
			int d = 0;
//			String aa[];
			boolean ck = false;
			do {
//				aa = al.get(d).split(" - ");
//				
//				if(title==aa[0].intern()) {
//					System.out.println(al.get(d));
//					ck=true;
//					break;
//				}
				bb = al.get(d);
				if(bb.indexOf(title)!=-1) {
					System.out.println(al.get(d));
					ck=true;
					break;
				}
				
								
				d++;
			}while(d<al.size());
			if(ck==false) {
				System.out.println("검색한 영화는 확인되지 않습니다.");
			}
			sc.close();
			sc2.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
