package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {

	public static void main(String[] args) {
		//ArrayList, LinkedList (배열값) - add,remove,get,size
		//Map (배열키, 배열값) - put,remove,get,size
		//Map은 배열키를 기반이기 때분에 키를 통해서 데이터를 확인 함(속도 최상급)
		//같은 키를 사용 시 마지막에 적용된 값으로 갱신 됨
		//※ 키값을 절대 중복시키지 않음
		Map<String,String> m = new HashMap<>();
		//hong -> Hash function(HashMap) -> 0x21949CB (중복값이 발생하지 않음)
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");	//키 중복되면 마지막꺼로 반영됨(if hong
		System.out.println(m.get("hong"));
		m.put("park", "");		//키는 있으나 값이 비어있는 경우는 사용 됨
		m.put("", "박혁거세");		//비어있는 키를 사용은 할 수 있으나, Map의 원리에는 올바르지 않음
		if(m.get("park").equals("")) {	//값 비어있으면 넣어라
			m.put("park", "박");
		}
		System.out.println(m.get("park"));	//박
		m.remove("hong");
		System.out.println(m);	//{=박혁거세, kang=강감찬, park=박}
		
		//Map : 여러개의 자료형을 사용할 수 있음
		Map<String,Integer> m2 = new HashMap<>();
		m2.put("age", 32);
		m2.put("level", 5);
		//System.out.println(m2.get("level"));
		System.out.println(m2);	//{level=5, age=32}
		System.out.println(m2.keySet());	//키만 출력[level, age]
		System.out.println(m2.values());	//값만 출력[5, 32]
		System.out.println(m2.containsKey("age"));	//해당 키가 있는지 확인 (false:없음, true:있음)
		

	}

}
