package StrukturRemoveHeadMidTail;

public class RemuveMid {

	    public static void main(String[] args) {
	        // 1. Create list dengan keyword new
	        List elemenList = new List();

	        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
	        elemenList.addFirst(2);
	        elemenList.addFirst(6);
	        elemenList.addFirst(3);
	        elemenList.addFirst(5);
	        elemenList.addFirst(1);

	        // 3. Tampilkan elemen list
	        System.out.println("Elemen List sebelum penghapusan tengah:");
	        elemenList.display();

	        // 4. Hapus elemen 3 di tengah list
	        elemenList.removeMid(3);

	        // 5. Tampilkan elemen list setelah penghapusan tengah
	        System.out.println("Elemen List setelah penghapusan tengah:");
	        elemenList.display();
	    }
	}
	

