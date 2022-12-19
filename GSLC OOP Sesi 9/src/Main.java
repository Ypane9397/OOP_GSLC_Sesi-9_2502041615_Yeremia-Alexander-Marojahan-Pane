import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Menu menufunc = new Menu();
	
	public void menu() {
		System.out.println("=================");
		System.out.println("       Menu      ");
		System.out.println("=================");
		System.out.println(" 1. Daftar Mobil ");
		System.out.println(" 2. Jual Mobil");
		System.out.println(" 3. Beli Mobil");
		System.out.println(" 4. Riwayat Pembelian");
		System.out.println(" 5. EXIT");
		System.out.print(" >> ");
	}
	
	public Main() {
		int input;
		do {
			menu();
			input = sc.nextInt();sc.nextLine();
			
			switch(input){
				case 1:
					menufunc.view1(); //untuk menunjukkan daftar mobil
					break;
				case 2:
					menufunc.addMobil(); //fungsi untuk menjual mobil
					break;
				case 3:
					menufunc.buyMobil(); //fungsi untuk membeli mobil
					break;
				case 4:
					menufunc.viewHist(); //fungsi untuk melihat riwayat pembelian
					break;
			}
		} while(input != 5);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
