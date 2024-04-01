package pertemuan6;

public class Node {
    private Matkul data;
    public Node next;

    // Konstruktor dengan parameter data
    public Node(Matkul data) {
        this.data = data;
        this.next = null; // Atur next ke null secara default
    }

    // Setter & Getter untuk data
    public void setData(Matkul data) {
        this.data = data;
    }

    public Matkul getData() {
        return data;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}
