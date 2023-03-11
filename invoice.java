/**
 *
 * @author Sara Chahardoli & Saba Farzin
 */
public class invoice  {
	String buydate;
	String senddate;
	int totalprice;
	boolean buystatus;
	invoiceline [] lines;
	int linecounter;
	String address ;

	public invoice() {
		buydate = "00.00.00";
		senddate = "00.00.00";
		totalprice = 0;
		buystatus = false ;
		lines = new invoiceline [100];
		linecounter = 0;
		address = " ";

	}

	public void printinfo() {
		if (linecounter > 0) {
			System.out.printf("Buy Date:%50s|Send Date:%50s\n", buydate, senddate);
			System.out.printf("Address:%100s\n", address);
			for (int i = 0; i < 100; i++)
				System.out.print("-");
			System.out.printf("\n|%20s|%30s|%10s|%20s|%20s\n", "Code", "Name", "Price", "Quantity", "Total line price ");
			for (int i = 0; i < linecounter ; i++)
				lines[i].printinfo() ;
			for (int i = 0; i < 100; i++)
				System.out.print("-");
			System.out.printf("\n total price:%20d\n", totalprice);
		} else
			System.out.println("Empty Invoice");


	}

	public void calculatetotalprice() {
		totalprice = 0;
		for (int i = 0; i < linecounter; i++)
			totalprice = totalprice + lines[i].totalpriceline ;
	}

	public void additeminvoice(String code, String name, int p, int q) {
		lines[linecounter] = new invoiceline(code, name, p, q);
		linecounter++;
	}
}