
public class Test5 {

	public static void main(String[] args) {
		int d = 1;
		int tot = 0;
		do {
			
			if(tot<4000 && d<89) {
				tot = tot + d;
			}else {
				break;
			}
			d++;
		}while(d<=100);
		System.out.println(tot);
	}

}
