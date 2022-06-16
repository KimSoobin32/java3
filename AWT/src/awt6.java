//인증번호발송 시스템 - awt6_abstract 연계작업
public class awt6 {

	public static void main(String[] args) {
		handle2 h = new handle2();
		h.design();

	}

}

class handle2 extends awt6_abstract{
	String pcnum;
	String yn;
	@Override
	public void pc() {	//인증번호생성
		this.pcnum="";
		//System.out.println(a);
		int w = 1;
		while(w<=4) {
			int a = (int)(Math.random()*9);
			this.pcnum += a; 
			w++;
		}
		System.out.println(this.pcnum);
		
		
	}
	@Override
	public void check(String num) {	//비교
		//System.out.println(num);
		if(num.equals(this.pcnum)) {
			this.yn = "yes";
		}else {
			this.yn = "no";
		}
		
	}
	@Override
	public String ans() {	//결과 리턴
		return this.yn;
	}
	
}