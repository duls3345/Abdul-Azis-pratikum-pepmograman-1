package tugas11;

public class GraphApp {
	public static void main(String[] args) {
        Graph theGraph = new Graph(5);

        theGraph.addvertex('A'); // 0
        theGraph.addvertex('B'); // 1
        theGraph.addvertex('C'); // 2
        theGraph.addvertex('D'); // 3
        theGraph.addvertex('E'); // 4

        theGraph.addEdge(0, 1); // A - B
        theGraph.addEdge(1, 2); // B - C
        theGraph.addEdge(0, 3); // A - D
        theGraph.addEdge(3, 4); // D - E

        theGraph.displayGraph();
    }
//    public static void main(String[] args) {
//        Graph theGraph = new Graph(6); // Membuat graph dengan kapasitas 6 vertex
//
//        theGraph.addvertex('A'); // 0
//        theGraph.addvertex('B'); // 1
//        theGraph.addvertex('C'); // 2
//        theGraph.addvertex('D'); // 3
//        theGraph.addvertex('E'); // 4
//        theGraph.addvertex('F'); // 5
//
//        theGraph.addEdge(0, 1); // A - B
//        theGraph.addEdge(1, 2); // B - C
//        theGraph.addEdge(0, 3); // A - D
//        theGraph.addEdge(3, 4); // D - E
//        theGraph.addEdge(4, 5); // E - F
//        theGraph.addEdge(1, 3); // B - D
//        theGraph.addEdge(2, 4); // C - E
//
//        theGraph.displayGraph();
//    }
//    public static void main(String[] args) {
//        Graph theGraph = new Graph(4); // Membuat graph dengan kapasitas 4 vertex
//
//        theGraph.addvertex('A'); // 0
//        theGraph.addvertex('B'); // 1
//        theGraph.addvertex('C'); // 2
//        theGraph.addvertex('D'); // 3
//
//        theGraph.addEdge(0, 1); // A - B
//        theGraph.addEdge(0, 2); // A - C
//        theGraph.addEdge(0, 3); // A - D
//        theGraph.addEdge(1, 3); // B - D
//
//        theGraph.displayGraph();
//    }
}
