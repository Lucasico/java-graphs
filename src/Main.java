
public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		{// BFS
			Vertex v1 = new Vertex("1");
			Vertex v2 = new Vertex("2");
			Vertex v3 = new Vertex("3");
			Vertex v4 = new Vertex("4");
			Vertex v5 = new Vertex("5");
			Vertex v6 = new Vertex("6");
			Vertex v7 = new Vertex("7");
			Vertex v8 = new Vertex("8");
			Vertex v9 = new Vertex("9");
			Vertex v10 = new Vertex("10");
			Vertex v11 = new Vertex("11");
			Vertex v12 = new Vertex("12");
			g.bind(v1, v2);
			g.bind(v1, v3);
			g.bind(v1, v4);
			g.bind(v2, v5);
			g.bind(v2, v6);
			g.bind(v5, v9);
			g.bind(v5, v10);
			g.bind(v4, v7);
			g.bind(v4, v8);
			g.bind(v7, v11);
			g.bind(v7, v12);
			System.out.println("BFS:");
			g.BFS(v1);
		}
		{
			Vertex v1 = new Vertex("1");
			Vertex v2 = new Vertex("2");
			Vertex v3 = new Vertex("7");
			Vertex v4 = new Vertex("8");
			Vertex v5 = new Vertex("3");
			Vertex v6 = new Vertex("6");
			Vertex v7 = new Vertex("9");
			Vertex v8 = new Vertex("12");
			Vertex v9 = new Vertex("4");
			Vertex v10 = new Vertex("5");
			Vertex v11 = new Vertex("10");
			Vertex v12 = new Vertex("11");
			g.bind(v1, v2);
			g.bind(v1, v3);
			g.bind(v1, v4);
			g.bind(v2, v5);
			g.bind(v2, v6);
			g.bind(v5, v9);
			g.bind(v5, v10);
			g.bind(v4, v7);
			g.bind(v4, v8);
			g.bind(v7, v11);
			g.bind(v7, v12);
			System.out.println("DFS:");
			g.DFS(v1);
		}

	}
}
