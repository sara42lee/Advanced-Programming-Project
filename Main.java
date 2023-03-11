/**
 *
 * @author Sara Chahardoli & Saba Farzin
 */
import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		costumer [] costumerarray = new costumer[5];
		costumerarray[0] = new costumer("Saba", "sft0712", "Farzin", true);
		costumerarray[1] = new costumer("Sara", "ljy0809", "Chahardoli", true);
		costumerarray[2] = new costumer("Mona", "1378", "Karimi", true);
		costumerarray[3] = new costumer("Sogand", "34sg43", "Fateh", true);
		costumerarray[4] = new costumer("Hasti", "2017 ", "Alidoosti", true);

		System.out.println("Please enter your username:");
		String u = input.nextLine();
		System.out.println("Please enter your password :");
		String p = input.nextLine();

		int costumernumber = -1;

		for (int i = 0; i < costumerarray[i].length; i++) {
			if (costumerarray[i].login(u, p) == true)
				costumernumber = i;
		}
		if (costumernumber == -1)
			System.out.println("Your username and password are invalid");
		else
			System.out.printf("Hello:%-10s^^ %50s\n", costumerarray[costumernumber].name, "Welcome To Sportmyket");



		item [] itemlist = new item[15];
		itemlist[0] = new item("BQ4771", "Backpack", 500, 990000);
		itemlist[1] = new item("Real", "Shoesback", 700, 35000);
		itemlist[2] = new item("Tanzib", "Pull-up bar", 100, 150000);
		itemlist[3] = new item("Ultimate", "Frisbee", 1000, 30000);
		itemlist[4] = new item("90", "Trampoline", 80, 1119000);
		itemlist[5] = new item("Soft touch", "Volleyball ", 550, 245000);
		itemlist[6] = new item("01", "Tennis ball", 1500, 135000);
		itemlist[7] = new item("BLX2021", "Tennis racket ", 700, 795000);
		itemlist[8] = new item("gold", "Sport rope", 120, 195000);
		itemlist[9] = new item("four", "Badminton racket", 100, 225000);
		itemlist[10] = new item("35432", "Dart", 400, 32000);
		itemlist[11] = new item("NikeU800", "Headband ", 1000, 25000);
		itemlist[12] = new item("Q90", "Pilates Ring", 250, 115000);
		itemlist[13] = new item("Thera band ", "Mini loop band", 600, 84000);
		itemlist[14] = new item("Q50", "Elastic band ", 500, 115000);

		itemlist[0].printlistinfo(itemlist, 15);


		int itemcounter = 15;

		if (costumernumber >= 0) {
			int operation = 0;
			do {

				System.out.println("What do you want to do now?");
				System.out.println("1: I want to see my profile. ");
				System.out.println("2: I want to add the address. ");
				System.out.println("3: I want to see my previous invoices. ");
				System.out.println("4: I want to see the current invoice items. ");
				System.out.println("5: I want to buy a new item and add a new item to the current invoice. ");
				System.out.println("6: Exit ");
				operation = input.nextInt();
				switch (operation) {
				case 1:
					costumerarray[costumernumber].printprofile();
					break;
				case 2:
					System.out.println("Please enter your new address.");
					String s = input.nextLine();
					if (s == null || s.length() == 0)
						s = input.nextLine();
					costumerarray[costumernumber].addaddress(s);
					break ;
				case 3:
					costumerarray[costumernumber]. printinvoicelist();
					break ;
				case 4:
					costumerarray[costumernumber]. currentinvoice.printinfo();
					break ;
				case 5:
					itemlist[0].printlistinfo(itemlist, itemcounter);
					System.out.println("Which item do you want? ");
					int itemnumber = input.nextInt();
					System.out.println("How many do you want?(quantity)");
					int quantity = input.nextInt();
					String tmpc = itemlist[itemnumber]. code;
					String tmpn = itemlist[itemnumber].name;
					int tmpp = itemlist[itemnumber]. price;
					if (quantity < itemlist[itemnumber].inventory) {
						costumerarray[costumernumber]. currentinvoice.additeminvoice(tmpc, tmpn, tmpp, quantity);

						itemlist[itemnumber].inventory = itemlist[itemnumber].inventory - quantity;
					}

					else
						System.out.println("not enough number");
					break;
				case 6:
					break;

				default:
					System.out.println("invalid operation ");
				}
			} while (operation != 6);
		}


	}
}