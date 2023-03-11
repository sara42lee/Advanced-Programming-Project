/**
 *
 * @author Sara Chahardoli & Saba Farzin
 */

public class costumer  {
	String username ;
	String password ;
	String name ;
	int addresscounter;
	String [] listofaddresses;
	boolean sex;
	invoice [] invoicelist;
	int invoicelistcounter;
	invoice currentinvoice ;

	public costumer(String tmpu, String tmpp, String tmpn, boolean s) {
		username = tmpu ;
		password = tmpp ;
		name = tmpn ;
		addresscounter = 0;
		listofaddresses = new String [20];
		sex = s;
		invoicelist = new invoice [50];
		invoicelistcounter = 0;
		currentinvoice = new invoice();
	}

	public boolean login(String u, String p) {
		boolean isvalid = false ;
		if (username == u && password == p)
			isvalid = true ;
		return isvalid;
	}

	public void printprofile() {
		System.out.printf("%10s :%20s\n", "Name", name);
		if (sex == false)
			System.out.printf("%10s : %10s\n", "sex", "male");
		else
			System.out.printf("%10s : %10s\n", "sex", "female");

		System.out.printf("%10s :%20s\n", "Sex", sex);
		for (int i = 0 ; i < listofaddresses.length; i++) {
			if (listofaddresses[i] != null)
				System.out.printf("%10s #%2d : %30s\n", "Address", i, listofaddresses[i]);
		}


	}

	public void addaddress(String newaddress) {
		listofaddresses[addresscounter] = newaddress;
		addresscounter ++;
	}

	public void printinvoicelist() {
		for (int i = 0; i < invoicelistcounter; i++)
			invoicelist[i].printinfo();

		if (invoicelistcounter == 0)
			System.out.println("You had no invoice till now ");
	}




}