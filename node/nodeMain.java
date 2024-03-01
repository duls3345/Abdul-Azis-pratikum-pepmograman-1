package node;

public class nodeMain {
	public static void main(String[] args) {
		//membuat 2 buah node n1 & n2 
		node n1 = new node(5);
		node n2 = new node(7);
		
		//membuat relasi Node n1 & n2
		n1.setNext(n2);
		
		//menalpilkan Node n1 & n2  dengan pointer  p 
		node P = n1;
		while(P !=null)
		{
			System.out.printf("%d ", P.getNilai());
			P = P.getNext();
		}
	}

}
