package Pertemuan9;

public class StrukturStack {
	 // Atribut Stack
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    // Konstruktor dengan parameter capacity
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // Method untuk menambahkan data ke stack (push)
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    // Method untuk mengecek apakah stack kosong
    public boolean isEmpty() {
        return (TOP == MIN);
    }

    // Method untuk mengecek apakah stack penuh
    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    // Method untuk mendapatkan ukuran stack (jumlah elemen)
    public int size() {
        return TOP + 1;
    }

    // Method untuk mendapatkan data teratas stack tanpa menghapusnya (peek)
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; 
        } else {
            return array[TOP];
        }
    }
    // Method untuk menampilkan isi stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.print("Isi stack: ");
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    // Method untuk menghapus dan mengembalikan data teratas dari stack (pop)
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; 
        } else {
            int data = array[TOP];
            TOP--;
            return data;
        }
    }

}
