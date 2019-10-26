package flightgraphB;
//David Hobbs
//Part B displaying a simple graph connecting vertices and edges,
//and displaying the shortest path between those airports

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		graph skytravel = new graph();
		
		
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
		
		
		System.out.println("Flights\n" + skytravel.getGraph());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your departure airport");
		String Departure = sc.nextLine();
		
		//some error handling to ensure user picks only from select airports
		while(!skytravel.getGraph().containsVertex(Departure)){
			System.out.println("Please select from Edinburgh, Heathrow, Dubai,Sydney,Kuala Lumpur,Frankfurt,Auckland,Rio de Janerio,New York,Santiago ");
			Departure = sc.nextLine();
		}
			
		System.out.println("Please enter your destination airport");
		String Destination = sc.nextLine();
		while(!skytravel.getGraph().containsVertex(Destination)){
			System.out.println("Please select from Edinburgh, Heathrow, Dubai,Sydney,Kuala Lumpur,Frankfurt,Auckland,Rio de Janerio,New York,Santiago ");
			Destination = sc.nextLine();
		}
		
		sc.close();//close scanner to prevent resource leaks.
		
		//send variables to leastcost object.
		new LeastCost(skytravel.getGraph(), Departure, Destination);
		
		
		
		
	}

}
