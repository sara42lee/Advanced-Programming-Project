/**
 *
 * @author Sara Chahardoli & Saba Farzin
 */
public class invoiceline {
	String code;
	String name ;
	int price ;
	int totalpriceline;
	int quantity ;

	public invoiceline(String c, String n, int p, int q) {
		code = c;
		name = n;
		price = p;
		quantity = q;
		totalpriceline = quantity * price ;
	}

	public void printinfo() {
		System.out.printf("|%20s|%30s|%10d|%20d|%20d", code, name, price, quantity, totalpriceline);
	}


}