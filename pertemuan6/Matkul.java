package pertemuan6;

public class Matkul {

	    private String kode;
	    private String nama;
	    private int sks;
	    private Matkul next;

	    public Matkul(String kode, String nama, int sks) {
	        this.kode = kode;
	        this.nama = nama;
	        this.sks = sks;
	        this.next = null;
	    }

	    // Getter and setter methods
	    public String getKode() {
	        return kode;
	    }

	    public void setKode(String kode) {
	        this.kode = kode;
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public int getSks() {
	        return sks;
	    }

	    public void setSks(int sks) {
	        this.sks = sks;
	    }

	    public Matkul getNext() {
	        return next;
	    }

	    public void setNext(Matkul next) {
	        this.next = next;
	    }

}