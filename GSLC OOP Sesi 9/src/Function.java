import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Function {
	Random rand = new Random();
	public int htg(int harga, int uang) {
		int kembalian = uang - harga;
		
		return kembalian;
	}
	
	 public String Date() {
	    GregorianCalendar date = new GregorianCalendar();
	    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
	    String tgl = date.get(Calendar.DAY_OF_MONTH) + " " + namabulan[date.get(Calendar.MONTH)] + " " + date.get(Calendar.YEAR) ;
	        
	    return tgl;
	 }
	 
	 public String tx() {
	    String hasilrand = "TX" + rand.nextInt(9) + rand.nextInt(9) + rand.nextInt(9) + 
	                rand.nextInt(9) + rand.nextInt(8)+1;
	        
	    return hasilrand;    
	 }
}
