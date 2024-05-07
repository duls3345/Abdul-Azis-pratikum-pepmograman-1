package Pertemuan9;

public class TestStrukturStack {
    public static void main(String[] args) {
        // Membuat objek stack dengan kapasitas 3 elemen
        StrukturStack stack = new StrukturStack(3);
        
        // Sebelum push
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen dari TOP: ");
        stack.display();
        System.out.println();
        
        // Melakukan push 3x
        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen dari TOP: ");
        stack.display();
        
        // Melakukan operasi pop
        System.out.println("--Operasi pop--");
        int poppedElement = stack.pop();
        System.out.println("Elemen yang di-pop: " + poppedElement);
        
        // Menampilkan informasi setelah pop
        System.out.println("#Setelah pop");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen dari TOP: ");
        stack.display();
    }
}
