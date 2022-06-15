
public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java ¿¬°è
		decorate de = new decorate();
		de.view();

	}

}

class decorate extends awt4_class{
	String gu = "";
	public void btn_push(int c) {
		//System.out.println(c);
		int w=1;
		
		do {
			//System.out.println(c+"*"+w+"="+c*w);
			this.gu += c+"*"+w+"="+c*w+"\n";
			w++;
		}while(w<=9);
		//System.out.println(gu);
		
		
	}
	public String calls() {
		return this.gu;
	}
	
}