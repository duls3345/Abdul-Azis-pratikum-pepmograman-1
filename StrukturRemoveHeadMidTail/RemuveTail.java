package StrukturRemoveHeadMidTail;

public class RemuveTail {
	public static void main(String[] args) {
        // 1. Create list dengan keyword new
        List tailList = new List();

        // 2. Tambah elemen sehingga elemenlist berisi (1,5,3,6,2)
        tailList.addFirst( 2);
        
        tailList.addFirst( 6);
        
        tailList.addFirst( 3);
        
        tailList.addFirst( 5);
        
        tailList.addFirst( 1);
        // 3. Tampilkan elemen list
        System.out.println("Elemen list sebelum penghapusan di akhir:");
        tailList.displayList();
        
        // 4. Hapus elemen di akhir list
        tailList.removeTail();
        
        // 5. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        tailList.displayList();
        

}
}