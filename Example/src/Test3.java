
public class Test3 {

	public static void main(String[] args) {
		int w = 1;
		int tot = 0;
		int hap = 0;
		while(w<=5) {
			int ww = 1;
			while(ww<=9) {
				hap = w+ww;
				//System.out.println(w+"+"+ww+"="+hap);
				tot += hap;
				ww++;
			}
			
			w++;
		}
		System.out.println(tot);

	}

}
