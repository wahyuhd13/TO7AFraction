//File : T07AFraction
public class T07AFraction{
	//bagian ide / algoritma
	
	/* method untuk menjumlahkan pecahan 1 dan pecahan 2 */
	static void sumFraction(int e1, int d1, int e2, int d2){
		int es, ds, pmbagi;
		es = e1 * d2 + e2 * d1;
		ds = d1 * d2;
		pmbagi = fpb(es, ds);
		es = es / pmbagi;
		ds = ds / pmbagi;
		printFraction(es, ds);
	}
	
	/* Method untuk mengalikan pecahan 1 dengan pecahan 2*/
	static void productFraction(int e1, int d1, int e2, int d2){
		int ep, dp, pmbagi;
		ep = e1 * e2;
		dp = d1 * d2;
		pmbagi = fpb(ep, dp);
		ep = ep / pmbagi;
		dp = dp / pmbagi;
		printFraction(ep, dp);
	}
	
	/* Method untuk mencetak pecahan ke terminal */
	static void printFraction(int e, int d){
		System.out.println(e + "/" + d);
	}
	
	/*Method untuk mencari fpb pembilang dan penyebut */
	static int fpb(int e, int d){
		int Temp;
		while(d != 0){
			Temp = d;
			d = e % d;
			e = Temp;
		}
		return e;
	}
	
	public static void main(String[] args) {
		// Method utama untuk melakukan testcase
		sumFraction(1, 2, 2, 3);
		sumFraction(1, 3, 3, 4);
		productFraction(1, 2, 2, 3);
		productFraction(1, 4, 2, 3);
		
		// sumFraction(1, 2, 1, 2);
	}
}