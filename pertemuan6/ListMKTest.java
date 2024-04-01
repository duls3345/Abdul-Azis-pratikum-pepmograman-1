package pertemuan6;

public class ListMKTest {
	 public static void main(String[] args) {
	        ListMatkul list = new ListMatkul();
	        
	        list.addHead(new Matkul("IF01", "Internet Web Aplikasi", 4));
	        list.addHead(new Matkul("IF02", "Pemrograman Web", 3));
	        list.addHead(new Matkul("IF03", "Struktur Program", 3));
	        list.addHead(new Matkul("IF04", "Pemograman Berorientasi Objek", 3));
	        list.displayElement();
	        
	     // Contoh pemanggilan fungsi find
	        System.out.println("Matkul dengan kode IF003 ditemukan: " + list.find("IF03"));
	        
	        // Contoh pemanggilan fungsi size
	        System.out.println("Jumlah Matkul dalam list: " + list.size());
	    }
}
