package flightgraphD;
//David Hobbs H00251314 Data collections course work 2
//Part D displays an itinerary of flights from departure to arrival.

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
		skytravel.addVertex("Alaska");
		skytravel.addVertex("Tokyo");
		skytravel.addVertex("Atlanta");
		
		

		
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
			
			skytravel.setEdges(skytravel.getGraph(), "Austria","Tokyo", 400);
			skytravel.makeNewFlight("F56JK", "2130", "0600", "510", 400);
			skytravel.makeNewFlight("F57JK", "0630", "1500", "510", 400);
			
			skytravel.setEdges(skytravel.getGraph(), "Tokyo","Alaska", 1000);
			skytravel.makeNewFlight("H47KK", "0800", "1700", "540", 1000);
			skytravel.makeNewFlight("H48KK", "1800", "0300", "540", 1000);
			
			skytravel.setEdges(skytravel.getGraph(), "Heathrow","Atlanta", 500);
			skytravel.makeNewFlight("D23FT", "1900", "0000", "300", 500);
			skytravel.makeNewFlight("D24FT", "0100", "0600", "300", 500);
			
			skytravel.setEdges(skytravel.getGraph(), "Atlanta","Alaska", 300);
			skytravel.makeNewFlight("A47KL", "1900", "2100", "120", 300);
			skytravel.makeNewFlight("A48KL", "2200", "0000", "120", 300);
		
		
		
		Scanner sc = new Scanner(System.in); //interactive portion with validation to protect against invalid airports
		
		System.out.println("Please enter your departure airport");
		String Departure = sc.nextLine();
			while(!skytravel.getGraph().containsVertex(Departure)){
				System.out.println("Please select from Edinburgh, Heathrow, Frankfurt, Austria, Alaska, Tokyo, Atlanta "); //display list of airports the user can choose from
				Departure = sc.nextLine();
			}
			
		System.out.println("Please enter your destination airport");
		String Destination = sc.nextLine();
			while(!skytravel.getGraph().containsVertex(Destination)){
				System.out.println("Please select from Edinburgh, Heathrow, Frankfurt, Austria, Alaska, Tokyo, Atlnata ");
				Destination = sc.nextLine();
			}
		
		sc.close(); //close scanner to prevent resource leak
		
		new LeastCost(skytravel.getGraph(), Departure, Destination); // send graph, start and finish airports to Dijkstra algorithm
		
		
		
	
	}
	
	
}
