package flightgraphE;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// this graph will hold all airports(vertices) and flights (edges)
		graph skytravel = new graph(); 
		
		//add some airports to the graph (vertices)
		skytravel.addVertex("Edinburgh"); 
		skytravel.addVertex("Heathrow");
		skytravel.addVertex("Frankfurt");
		skytravel.addVertex("Austria");

		
		//creating the flights (edges of graph)
		skytravel.setEdges(skytravel.getGraph(), "Edinburgh","Heathrow", 80);
			skytravel.makeNewFlight("F28DA", "1400", "1530", "90", 80);
			skytravel.makeNewFlight("F29DA", "1600", "1730", "90", 80);
			
			
		skytravel.setEdges(skytravel.getGraph(), "Heathrow","Frankfurt", 120);
			skytravel.makeNewFlight("G74DS","1600", "1830","150", 120);
			skytravel.makeNewFlight("G75DS","1900", "2030","150", 120);
			
		skytravel.setEdges(skytravel.getGraph(), "Frankfurt","Austria", 100);
			skytravel.makeNewFlight("S45VB", "1900", "2100", "120", 100);
			skytravel.makeNewFlight("S46VB", "2130", "0030", "120", 100);
		
		
		
		Scanner sc = new Scanner(System.in); //interactive portion with validation to protect against invalid airports
		
		System.out.println("Please enter your departure airport");
		String Departure = sc.nextLine();
			while(!skytravel.getGraph().containsVertex(Departure)){
				System.out.println("Please select from Edinburgh, Heathrow, Frankfurt,Austria "); //display list of airports the user can choose from
				Departure = sc.nextLine();
			}
			
		System.out.println("Please enter your destination airport");
		String Destination = sc.nextLine();
			while(!skytravel.getGraph().containsVertex(Destination)){
				System.out.println("Please select from Edinburgh, Heathrow, Frankfurt,Austria ");
				Destination = sc.nextLine();
			}
		
		sc.close(); //close scanner to prevent resource leak
		
		new LeastCost(skytravel.getGraph(), Departure, Destination); // send graph, start and finish airports to Dijkstra algorithm
		
		
		
	
	}
	
	
}
