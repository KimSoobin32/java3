import java.io.BufferedReader;
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
			//파일 로드 및 메소드 전달
			movie m = new movie("movie_db.txt");
			
			/*
			FileReader fr = new FileReader("C:\\java5\\File_Strame\\src\\movie_db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
			ArrayList<String> al = new ArrayList<>();
						
			
			while(sc.hasNext()) {
				al.add(sc.nextLine());
			}
			sc.close();
			Scanner sc2 = new Scanner(System.in);
			System.out.println("검색할 영화제목을 입력하세요.");
			String title = sc2.nextLine().intern();
			sc2.close();
			fr.close();
						
			String bb;
			int d = 0;
//			String aa[];
			boolean ck = false;
			do {
//				aa = al.get(d).split(" - ");	//split사용 경우
//				
//				if(title==aa[0].intern()) {
//					System.out.println(al.get(d));
//					ck=true;
//					break;
//				}
				bb = al.get(d);
				if(bb.indexOf(title)!=-1) {	//indexof사용 경우
					System.out.println(al.get(d));
					ck=true;
					break;
				}
				
								
				d++;
			}while(d<al.size());
			if(ck==false) {
				System.out.println("검색한 영화는 확인되지 않습니다.");
			}
			*/
			
			
		}catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println("현재 서비스가 정상적이지 않습니다.");
			}
			
		}
		
		

	}

}

class movie{
	private String path = "C:\\java5\\File_Strame\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> list = null;
	private Scanner sc = null;
	public movie(String filename) throws IOException{	//파일읽기
		try {
			
			this.fr = new FileReader(this.path+filename,Charset.forName("UTF8"));
			this.custom();
			this.bf.close();
			this.search();
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	public void custom() throws IOException {	//리스트담기
		this.bf = new BufferedReader(this.fr);
		this.list = new ArrayList<>();
		//System.out.println(this.bf.readLine());
		//String datas = ""; [, 경관의 피 - 추천 3 202 버그..do while일 때 주의!!(처음 비워지지 않게
		String datas = this.bf.readLine();
		do {
			this.list.add(datas);
			
		}while((datas=this.bf.readLine())!=null);
		//System.out.println(this.list);
	}
	
	public void search() {	//검색
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해주세요.");
		//indexOf, contains
		String subject = this.sc.next().intern();
		boolean call = false;
		if(subject=="종료") {
			sc.close();
			System.exit(0);
		}
		for(String moviesb : this.list) {
//			if(moviesb.indexOf(subject)!=-1) {
//				System.out.println(moviesb);
//			}
			if(moviesb.contains(subject)) {
				System.out.println(moviesb);
				call=true;
			}
		}
		if(call==false) {
			System.out.println("데이터를 확인 할 수 없습니다.");
		}
		//this.sc.close();	error
		this.search();	//재귀함수 - 계속 검색 가능
	}
}
