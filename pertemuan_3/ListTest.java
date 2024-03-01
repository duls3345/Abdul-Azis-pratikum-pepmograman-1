package pertemuan_3;

import java.util.ArrayList;

public class ListTest {
	
	 public static void main(String[] args) {
	        // Membuat objek ArrayList untuk menyimpan elemen-elemen
	        ArrayList<Integer> list = new ArrayList<>();

	        // Menambahkan elemen di akhir list menggunakan metode add
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        
	        // Menampilkan setiap elemen yang terdapat di list
	        System.out.println("Isi list setelah penambahan:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	    }

}
