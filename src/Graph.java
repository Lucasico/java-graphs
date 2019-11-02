public class Graph {

	public void bind(Vertex a, Vertex b) {
		Edge e1 = new Edge();
		Edge e2 = new Edge();
		e1.a = a;
		e1.b = b;
		a.edges.add(e1);

		e2.a = b;
		e2.b = a;
		b.edges.add(e2);

	}

	public void BFS(Vertex start) {
            Queue<Vertex> fila = new Queue();
            fila.enqueue(new  Node (start));
                    
            while(!fila.isEmpty()){
                Vertex v = fila.dequeue().info;
                v.visited = true;
                System.out.println(v.label);
                for(int i = 0; i < v.edges.size();i++){
                    if(!v.edges.get(i).b.visited){
                        fila.enqueue(new Node(v.edges.get(i).b));
                    }
                }
            }
	}

	public void DFS(Vertex start) {
           Stack<Vertex> pilha = new Stack();
           pilha.push(new Node(start));
            
            while(!pilha.isEmpty()){
                Vertex v = pilha.pop().info;
                if(!v.visited){
                   v.visited = true;
                   System.out.println(v.label);
                   for(int i = 0; i < v.reverse().size(); i++){
                       pilha.push(new Node(v.reverse().get(i).b));
                   }
                }
            }
        }
}
