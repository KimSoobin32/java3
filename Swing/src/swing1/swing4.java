package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing4 {

	public static void main(String[] args) {
		String[][] data = {
				{"d1","123456"},
				{"d2","456789"},
				{"d3","홍길동"},
				{"d4","이순신"},
				{"d5","hong@naver.com"},
		};
		
		//HashMap m = new HashMap<>();	//데이터 자료형과 관계없이
		Map<String, String> m = new HashMap<>();	//문자,문자
		//Map m2 = new HashMap<>();	//데이터 자료형이 관계 없음
		System.out.println(data[0][0]);	//키
		System.out.println(data[0][1]);	//data
		
		for(int a=0;a<data.length;a++) {
			if(!m.containsKey(data[a][0])) {
				m.put(data[a][0], data[a][1]);				
			}
			else {
				m.put(data[a][0]+" "+a, data[a][1]);
			}
		}
		System.out.println(m);

	}

}
