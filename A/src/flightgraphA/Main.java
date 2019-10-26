package flightgraphA;

//David Hobbs
// Part A displaying a simple graph connecting vertices and edges.
public class Main {

	public static void main(String[] args) {
		graph skytravel = new graph();// instantiate graph object called skytravel
		
		//add airports
		skytravel.addVertex("Edinburgh");
		skytravel.addVertex("Heathrow");
		skytravel.addVertex("Dubai");
		skytravel.addVertex("Sydney");
		skytravel.addVertex("Kuala Lumpur");
		skytravel.addVertex("Frankfurt");
		skytravel.addVertex("Auckland");
		skytravel.addVertex("Rio de Janerio");
		skytravel.addVertex("New York");
		skytravel.addVertex("Santiago");
	
		//add travel between airports in both directions
		//setting weights these equal prices of tickets to fly to a destination
		skytravel.addEdge("Edinburgh", "Heathrow");
		skytravel.setEdgeWeight("90");
		
		skytravel.addEdge("Heathrow", "Edinburgh");
		skytravel.setEdgeWeight("90");
		
		skytravel.addEdge("Heathrow", "Dubai");
		skytravel.setEdgeWeight("130");
		
		skytravel.addEdge("Dubai", "Heathrow");
		skytravel.setEdgeWeight("130");
		
		skytravel.addEdge("Heathrow","Sydney");
		skytravel.setEdgeWeight("570");
		
		skytravel.addEdge("Sydney","Heathrow");
		skytravel.setEdgeWeight("570");
		
		skytravel.addEdge("Dubai", "Kuala Lumpur");
		skytravel.setEdgeWeight("170");
		
		skytravel.addEdge("Kuala Lumpur", "Dubai");
		skytravel.setEdgeWeight("170");
		
		skytravel.addEdge("Dubai", "Edinburgh");
		skytravel.setEdgeWeight("190");

		skytravel.addEdge("Edinburgh", "Dubai");
		skytravel.setEdgeWeight("190");
		
		skytravel.addEdge("Kuala Lumpur", "Sydney");
		skytravel.setEdgeWeight("150");
		
		skytravel.addEdge("Sydney", "Kuala Lumpur");
		skytravel.setEdgeWeight("150");
		
		skytravel.addEdge("Edinburgh", "Frankfurt");
		skytravel.setEdgeWeight("90");
		
		skytravel.addEdge("Frankfurt", "Edinburgh");
		skytravel.setEdgeWeight("90");
		
		skytravel.addEdge("Sydney", "Auckland");
		skytravel.setEdgeWeight("170");
		
		skytravel.addEdge("Auckland", "Sydney");
		skytravel.setEdgeWeight("170");
		
		skytravel.addEdge("Rio de Janerio", "New York");
		skytravel.setEdgeWeight("430");
		
		skytravel.addEdge("New York", "Rio de Janerio");
		skytravel.setEdgeWeight("430");
		
		skytravel.addEdge("New York", "Santiago");
		skytravel.setEdgeWeight("320");
		
		skytravel.addEdge("Santiago", "New York");
		skytravel.setEdgeWeight("320");
		
		// this gets the graph from the skytravel object and displays it onscreen
		System.out.println("Flights\n" + skytravel.getGraph());
		
		
		
		
		
	}

}
