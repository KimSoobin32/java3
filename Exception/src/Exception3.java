import java.util.ArrayList;
import java.util.Arrays;

public class Exception3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * data = {"hong45","lee90","kang100","park70","kim72"};
		 * 해당 배열 데이터 값을 main2라는 메소드로 값을 던짐
		 * 해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하면
		 * 최초 값을 던질 때는 가공 없이 던지게 됨
		 * main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산한 결과가 나와야 됨
		 * 단, 숫자 변환 시 문제가 발생할 경우 finally로 체크 후 
		 * main2메소드로 다시 호출하여 정상적으로 데이터가 나오도록 함
		 */
		
		String data[] = {"hong45","lee90","kang100","park70","kim72"};
		try {
			
			main2(data);
			
		}catch(Exception e) {
			System.out.println(e);	//e뒤에 안 붇이면 자동 toString(), 11버전 이상
		}finally {
			ArrayList<String> rdata = new ArrayList<>();
			int j = 0;
			String modify;
			while(j<data.length) {
				modify = data[j].replaceAll("[a-zA-Z]", "");
				rdata.add(modify);
				j++;
			}
			String cdata[] = new String[rdata.size()];
			//System.out.println(Arrays.toString(cdata));
			int q=0;
			do {
				cdata[q] = rdata.get(q);
				q++;
			}while(q<rdata.size());
			
			
			try {
				main2(cdata);
			}catch(Exception h) {
				//printStackTrace() 절대 사용 금지
				//System.out.println(h.toString());
				//System.out.println(h.getMessage());	//ㅊㅊ 오류 없으면 null
				if(h.getMessage()==null) {
					System.exit(0);
				}else {
					System.out.println(h);
				}
				
			
			}
			
		}

	}
	
	static void main2(String[] d) throws Exception{
		int w=0;
		int n;
		int tot=0;
		while(w<d.length) {
			n = Integer.valueOf(d[w]);
			tot += n;
			w++;
		}
		System.out.println(tot);
		Exception c = new Exception();
		throw c;
	}


}
