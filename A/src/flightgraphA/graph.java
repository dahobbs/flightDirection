package flightgraphA;

// David Hobbs
// Part A
import org.jgrapht.graph.*;
public class graph {
	//new instance of Simple directed weighted graph
	private final SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> flights = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
	
	//declaring instance variable to be accessible to many methods
	private DefaultWeightedEdge edge;
	
	//adds vertices to graph
	public void addVertex(String name) {
        flights.addVertex(name);
        
    }
	//add edges to graph
    public void addEdge(String v1, String v2) {
        
    	 edge = flights.addEdge(v1, v2);
    }
    //sets edge weight
    public void setEdgeWeight(String edgeWeight) {
        flights.setEdgeWeight(edge, Double.valueOf(edgeWeight));
          
    }
     //returns graph to Main
    public SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> getGraph() {
    	
    	return flights;
    }
    


}
