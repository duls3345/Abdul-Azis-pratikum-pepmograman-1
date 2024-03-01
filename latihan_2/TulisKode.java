package latihan_2;

public class TulisKode {
	
	
	public static int tambah(int a, int b) {
		return a + b ;
	}
	
	public static int kali(int a, int b) {
		return a * b ;
	}
	
	public static void main(String[] args) {
		int hasilPenjumlahan = tambah(5, 3);
		System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
		
		int hasilPerkalian = kali(4, 6);
		System.out.println("Hasil Perkalian: " + hasilPerkalian);
	}

}
