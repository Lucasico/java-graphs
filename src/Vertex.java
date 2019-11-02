import java.util.ArrayList;
import java.util.List;

public class Vertex {
	public String label;
	public boolean visited;
	public List<Edge> edges;

	public Vertex(String label) {
		this.label = label;
		this.visited = false;
		this.edges = new ArrayList<Edge>();
	}

	public Vertex move(Edge e) {
		return e.b;
	}

	public List<Edge> reverse() {
		List<Edge> ret = new ArrayList<Edge>();
		for (int i = this.edges.size() - 1; i >= 0; i--) {
			ret.add(this.edges.get(i));
		}
		return ret;
	}

}
