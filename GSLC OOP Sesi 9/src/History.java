
public class History extends Abstrak implements INter{
	private String Transaksi;
	private String buyerName;
	private String identity;
	private String address;
	private String date;
	private String type;
	
	public History(String costumerName, String jenisMobil, String merkMobil, String warnaMobil, int tahunProduksi,
			int kmMobil, String platMobil, String surat, int hargaJual, String transaksi, String buyerName,
			String identity, String address, String date, String type) {
		super(costumerName, jenisMobil, merkMobil, warnaMobil, tahunProduksi, kmMobil, platMobil, surat, hargaJual);
		Transaksi = transaksi;
		this.buyerName = buyerName;
		this.identity = identity;
		this.address = address;
		this.date = date;
		this.type = type;
	}

	public String getTransaksi() {
		return Transaksi;
	}

	public void setTransaksi(String transaksi) {
		Transaksi = transaksi;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
}