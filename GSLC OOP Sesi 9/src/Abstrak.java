
public abstract class Abstrak implements INter{
	private String costumerName;
	private String jenisMobil;
	private String merkMobil;
	private String warnaMobil;
	private int tahunProduksi;
	private int kmMobil;
	private String platMobil;
	private String Surat;
	private int hargaJual;
	
	public Abstrak(String costumerName, String jenisMobil, String merkMobil, String warnaMobil, int tahunProduksi,
			int kmMobil, String platMobil, String surat, int hargaJual) {
		super();
		this.costumerName = costumerName;
		this.jenisMobil = jenisMobil;
		this.merkMobil = merkMobil;
		this.warnaMobil = warnaMobil;
		this.tahunProduksi = tahunProduksi;
		this.kmMobil = kmMobil;
		this.platMobil = platMobil;
		Surat = surat;
		this.hargaJual = hargaJual;
	}
	
	public String getCostumerName() {
		return costumerName;
	}
	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}
	public String getJenisMobil() {
		return jenisMobil;
	}
	public void setJenisMobil(String jenisMobil) {
		this.jenisMobil = jenisMobil;
	}
	public String getMerkMobil() {
		return merkMobil;
	}
	public void setMerkMobil(String merkMobil) {
		this.merkMobil = merkMobil;
	}
	public String getWarnaMobil() {
		return warnaMobil;
	}
	public void setWarnaMobil(String warnaMobil) {
		this.warnaMobil = warnaMobil;
	}
	public int getTahunProduksi() {
		return tahunProduksi;
	}
	public void setTahunProduksi(int tahunProduksi) {
		this.tahunProduksi = tahunProduksi;
	}
	public int getKmMobil() {
		return kmMobil;
	}
	public void setKmMobil(int kmMobil) {
		this.kmMobil = kmMobil;
	}
	public String getPlatMobil() {
		return platMobil;
	}
	public void setPlatMobil(String platMobil) {
		this.platMobil = platMobil;
	}
	public String getSurat() {
		return Surat;
	}
	public void setSurat(String surat) {
		Surat = surat;
	}
	public int getHargaJual() {
		return hargaJual;
	}
	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}
}
