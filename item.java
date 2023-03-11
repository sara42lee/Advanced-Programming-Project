/**
 *
 * @author Sara Chahardoli & Saba Farzin
 */
public class item  {
	String code;
	String name ;
	int inventory ;
	int price ;

	public item(String c, String n, int i, int p) {
		code = c;
		name = n;
		inventory = i;
		price = p;
	}

	public void printinfo() {
		System.out.printf("%20s|%20s|%10d|%10d|\n", code, name, inventory, price);
	}

	public void printlistinfo(item[]itemlist, int counter) {
		System.out.printf("|%20s|%20s|%10d|%10d|\n", "Code", "Name ", "Inventory", "Price ");
		System.out.printf("|%20s|%20s|%10d|%10d|\n", code, name, inventory, price);

		for (int i = 0 ; i < counter ; i++) {
			System.out.printf("%3d|", i);
			itemlist[i].printinfo();
		}
	}

	public static int[] search(item[]itemlist, int n, int m) {
		int[]A = new int[100];
		int t = 0;
		for (int i = 0 ; i < itemlist.length ; i++) {
			if (itemlist[i].price >= m && itemlist[i].price <= n) {
				System.out.println(itemlist[i].code + "\t" + itemlist[i].name + "\t" + itemlist[i].price + "\t" + itemlist[i].inventory);
				A[t] = i ;
				t++ ;
			}
		}

		if (t == 0) {
			System.out.print("Not found.") ;
			return A ;
		}
	}



}