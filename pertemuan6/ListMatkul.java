package pertemuan6;

public class ListMatkul {
	private Matkul HEAD;

    public ListMatkul() {
        HEAD = null; // Initialize HEAD to null indicating an empty list
    }

    public boolean isEmpty() {
        return HEAD == null; // Check if HEAD is null, indicating an empty list
    }

    public void addHead(Matkul data) {
        Matkul newNode = new Matkul(data.getKode(), data.getNama(), data.getSks());

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
        Matkul curNode = HEAD;
        while (curNode != null) {
            System.out.println("Matkul: " + curNode.getKode() + ", Nama: " + curNode.getNama() + ", SKS: " + curNode.getSks());
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    
    public boolean find(String x) {
        Matkul curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getKode().equals(x)) {
                ketemu = true;
            }
            curNode = curNode.getNext();
        }

        return ketemu;
    }
    
    public int size() {
        Matkul curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }

        return jumlah;
    }
}
