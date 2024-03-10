package StrukturRemoveHeadMidTail;

public class RemuveHead {
	
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        List HeadList = new List();

        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
        HeadList.addFirst(2);
        HeadList.addFirst(6);
        HeadList.addFirst(3);
        HeadList.addFirst(5);
        HeadList.addFirst(1);

        // 3. Tampilkan elemen list
        System.out.println("Elemen List sebelum penghapusan tengah:");
        HeadList.display();
	
	    // 4. Hapus elemen di awal list
	    HeadList.removeHead();
	    
        // 5. Tampilkan elemen list setelah penghapusan tengah
        System.out.println("Elemen List setelah penghapusan tengah:");
        HeadList.display();


}
}
