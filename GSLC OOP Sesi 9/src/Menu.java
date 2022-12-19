import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	ArrayList<Mobil> data = new ArrayList<>();
	ArrayList<History> hist = new ArrayList<>();
	

	public void addMobil(){
		String costumerName;
		String jenisMobil;
		String merkMobil;
		String warnaMobil;
		int tahunProduksi;
		int kmMobil;
		String platMobil;
		String Surat;
		int hargaJual;
		
		do {
			System.out.println("Nama Penjual : ");
			costumerName = sc.nextLine();
		}while(costumerName.isBlank());
		
		do {
			System.out.println("Jenis Mobil [Sedan | SUV | Semi SUV | EV]: ");
			jenisMobil = sc.nextLine();
		}while(!jenisMobil.equals("Sedan") && !jenisMobil.equals("SUV") && !jenisMobil.equals("Semi SUV") && !jenisMobil.equals("UV"));
		
		do {
			System.out.println("Merk Mobil : ");
			merkMobil = sc.nextLine();
		}while(merkMobil.isBlank());
		
		do {
			System.out.println("Warna Mobil : ");
			warnaMobil = sc.nextLine();
		}while(warnaMobil.isBlank());
		
		do {
			System.out.println("Tahun Produksi [2000-2022]: ");
			tahunProduksi = sc.nextInt(); sc.nextLine();
		}while(tahunProduksi < 2000 || tahunProduksi > 2022);
		
		do {
			System.out.println("Kilometer Mobil: ");
			kmMobil = sc.nextInt(); sc.nextLine();
		}while(kmMobil < 0);
		
		do {
			System.out.println("Plat Mobil: ");
			platMobil = sc.nextLine();
		}while(platMobil.isBlank());
		
		do {
			System.out.println("Surat [Lengkap | Tidak Lengkap]: ");
			Surat = sc.nextLine();
		}while(!Surat.equals("Lengkap") && !Surat.equals("Tidak Lengkap"));
		
		do {
			System.out.println("Harga Jual (dalam Rp): ");
			hargaJual = sc.nextInt(); sc.nextLine();
		}while(hargaJual < 0);
		
		Mobil mbl = new Mobil(costumerName, jenisMobil, merkMobil, warnaMobil, tahunProduksi,
				kmMobil, platMobil, Surat, hargaJual);
//		Mobil mbl = new Mobil("dadad", "Sedan", "Honda", "Kuning", 2000, 29000, "B3339PPQ", "Lengkap", 2000000);
		data.add(mbl);
		
		System.out.println("\n Sukses!");
	}
	
	public void view() {
		if(data.isEmpty()) {
			System.out.println("No Data");
			return;
		}
		
		for(int i=0; i<data.size(); i++) {
			System.out.printf("Jenis Mobil      : %s\n", data.get(i).getJenisMobil());
			System.out.printf("Merek Mobil      : %s\n", data.get(i).getMerkMobil());
			System.out.printf("Warna Mobil      : %s\n", data.get(i).getWarnaMobil());
			System.out.printf("Tahun Produksi   : %d\n", data.get(i).getTahunProduksi());
			System.out.printf("Kilometer Mobil  : %d\n", data.get(i).getKmMobil());
			System.out.printf("Plat Mobil       : %s\n", data.get(i).getPlatMobil());
			System.out.printf("Surat            : %s\n", data.get(i).getSurat());
			System.out.printf("Harga Jual       : %d\n\n", data.get(i).getHargaJual());
		}
	}
	
	public void view1() {
		view();
		System.out.println("Press ENter to Continue");
		sc.nextLine();
	}
	
	public void buyMobil() {
		String costumerName;
		String jenisMobil;
		String merkMobil;
		String warnaMobil;
		int tahunProduksi;
		int kmMobil;
		String platMobil;
		String Surat;
		int hargaJual;
		
		String Transaksi;
		String buyerName;
		String identity;
		String address;
		String date;
		String type;
		
		view();
		if(data.isEmpty()) {
			System.out.println("\nPress Enter to Continue");
			sc.nextLine();
			return;
		}
		
		do {
			System.out.println("Nama Pembeli: ");
			buyerName = sc.nextLine();
		}while(buyerName.isBlank());
		
		do {
			System.out.println("Nomor KTP: ");
			identity = sc.nextLine();
		}while(identity.isBlank());
		
		do {
			System.out.println("Alamat Pembeli: ");
			address = sc.nextLine();
		}while(address.isBlank());
		
		boolean checker = false;
		int idx = 0;
		do {
			System.out.println("Plat Nomor: ");
			platMobil = sc.nextLine();
			for(int i=0; i<data.size(); i++) {
				if(platMobil.equals(data.get(i).getPlatMobil())) {
					idx = i;
					checker = true;
					break;							
				}
			}
		}while(! checker);
		
		costumerName = data.get(idx).getCostumerName();
		jenisMobil = data.get(idx).getJenisMobil();
	    merkMobil = data.get(idx).getMerkMobil();
		warnaMobil = data.get(idx).getWarnaMobil();
		tahunProduksi = data.get(idx).getTahunProduksi();
		kmMobil = data.get(idx).getKmMobil();
		platMobil = data.get(idx).getPlatMobil();
		Surat = data.get(idx).getSurat();
		hargaJual = data.get(idx).getHargaJual();
		
		do {
			System.out.println("Tipe Pembayaran [Cash | Cashless]: ");
			type = sc.nextLine();
		}while(!type.equals("Cash") && !type.equals("Cashless"));
		
		int bayar, kembalian;
		Function func = new Function();
		
		if(type.equals("Cash")) {
			do {
				System.out.printf("Jumlah Uang min. Rp%d : ", hargaJual);
				bayar = sc.nextInt(); sc.nextLine();
			} while(bayar < hargaJual);
			kembalian = func.htg(hargaJual, bayar);
			System.out.printf("Kembalian : Rp%d\n", kembalian);
		}
			
		History hist1 = new History(costumerName, jenisMobil, merkMobil, warnaMobil, tahunProduksi,
				 kmMobil, platMobil, Surat, hargaJual, func.tx(), buyerName,
				identity, address, func.Date(), type);
		
		hist.add(hist1);
		data.remove(idx);
				
		System.out.println("Transaksi Berhasil\n\nPress Enter to Continue");
		sc.nextLine();
	}
	
	public void viewHist() {
		if(hist.isEmpty()) {
			System.out.println("NO Data\n\nPress Enter to Continue");
			sc.nextLine();
			return;
		}

		for(int i=0; i<hist.size(); i++) {
			System.out.printf("ID Transaksi %s\n", hist.get(i).getTransaksi());
			System.out.printf("Nama Pembeli      : %s\n", hist.get(i).getBuyerName());
			System.out.printf("Nomor KTP         : %s\n", hist.get(i).getIdentity());
			System.out.printf("Alamat Pembeli    : %s\n", hist.get(i).getAddress());
			System.out.printf("Nama Penjual      : %s\n", hist.get(i).getCostumerName());
			System.out.printf("Jenis Mobil       : %s\n", hist.get(i).getJenisMobil());
			System.out.printf("Merk Mobil        : %s\n", hist.get(i).getMerkMobil());
			System.out.printf("Warna Mobil       : %s\n", hist.get(i).getWarnaMobil());
			System.out.printf("Tahun Produksi    : %s\n", hist.get(i).getTahunProduksi());
			System.out.printf("Kilometer Mobil   : %d\n", hist.get(i).getKmMobil());
			System.out.printf("Plat Mobil        : %s\n", hist.get(i).getPlatMobil());
			System.out.printf("Surat             : %s\n", hist.get(i).getSurat());
			System.out.printf("Harga Jual        : %d\n", hist.get(i).getHargaJual());
			System.out.printf("Tipe Pembayaran   : %s\n", hist.get(i).getType());
			System.out.printf("Tanggal Penjualan : %s\n\n", hist.get(i).getDate());
		}
	
	

	}
}
