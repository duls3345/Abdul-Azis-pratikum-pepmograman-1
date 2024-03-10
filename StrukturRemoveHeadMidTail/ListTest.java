package StrukturRemoveHeadMidTail;

import java.util.ArrayList;

import Add.StrukturList;

public class ListTest {
	public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();

        // 2. Tambah elemen 3 di akhir list
        myList.addMid(3, 1);

        // 3. Tambah elemen 4 di akhir list
        myList.addMid(4, 1);

        // 4. Tambah elemen 7 di index 2
        myList.addMid(7, 2);

        // 5. Tambah elemen 8 di index 2
        myList.addMid(8, 2);

        // 6. Tambah elemen 5 di awal list
        myList.addMid(5, 1);

    }
}
