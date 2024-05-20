package tugas11;

public class Graph {
	private vertex vertexList[]; // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of vertices

    public Graph(int maxVerts) { // constructor
        vertexList = new vertex[maxVerts]; // initialize vertex array
        adjMat = new int[maxVerts][maxVerts]; // initialize adjacency matrix
        nVerts = 0; // initialize number of vertices to 0

        for (int i = 0; i < maxVerts; i++) { // set adjacency matrix to 0
            for (int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0; // matrix to 0
            }
        }
    } // end constructor

    public void addvertex(char label) { // add vertex
        vertexList[nVerts++] = new vertex(label);
    }

    public void addEdge(int start, int end) { // add edge
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayGraph() {
        System.out.print("  ");
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + " ");
        }
        System.out.println();

        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].label + " ");
            for (int j = 0; j < nVerts; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
