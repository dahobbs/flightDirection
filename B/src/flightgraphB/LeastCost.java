package flightgraphB;

//David Hobbs
//Part B displaying a simple graph connecting vertices and edges,
//and displaying the shortest path between those airports

//using Dijkstras algorithm to determine shortest path
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class LeastCost extends graph {
	
	LeastCost(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> travel, String departure, String destination){
		
		String Leaving = departure;
		String Arrival = destination;
		
		
		System.out.println("Shortest path from "+Leaving+"  to "+ Arrival +":");
	    DijkstraShortestPath<String, DefaultWeightedEdge> path = new DijkstraShortestPath<String, DefaultWeightedEdge>(travel, Leaving, Arrival);
	    
	  //using methods get path and get path length to show path taken and combined weights of all edges
	    System.out.println(path.getPath() + ": £" + path.getPathLength());
	    
	}
	
	
}