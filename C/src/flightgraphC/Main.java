package flightgraphC;

import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import java.util.ArrayList;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;



public class Main {

	private static ArrayList<String[]> Edge = new ArrayList<String[]>();
    private static ArrayList<FlightInfo> flights = new ArrayList<FlightInfo>();

	public static void main(String[] args) {
		
		
	        SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>  flight =
	                (SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>) 
	                new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class); 
	        
	        {
	        	flight.addVertex("Edinburgh"); //adding flight vertices	
	            flight.addVertex("Heathrow");
	            flight.addVertex("Frankfurt");
	            flight.addVertex("Sydney");
	            flight.addVertex("Tokyo");
	            flight.addVertex("Dubai");
	            flight.addVertex("Mumbai");
	            
	            auxEdgemaker(flight, "Edinburgh", "Heathrow", 80);
	            makeNewFlight("F28DA", "1800", "2100", "0300", 80);
	        
	        }
	        
        
        for (int i = 0; i < flights.size(); i++) {
            
            FlightInfo details = flights.get(i);
            String flightNo = details.flightNo;
            String depTime = details.depTime;
            String arrTime = details.arrTime;
            //String price = details.price;
            String flightDuration = details.duration;
            //double totalDuration = totalDuration + details.getDuration();
            String[] flightInfo = {depTime, flightNo, arrTime, flightDuration};
            System.out.println("FlightNo Departure Arrival Duration");
            System.out.println(arrayReader(flightInfo));
        }
        
            

            
		
	}//close main method
	
	/*private static SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> graphMaker() {
        SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>  flight =
                (SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>) 
                new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class); 
        
        {
        	flight.addVertex("Edinburgh"); //adding flight vertices	
            flight.addVertex("Heathrow");
            flight.addVertex("Frankfurt");
            flight.addVertex("Sydney");
            flight.addVertex("Tokyo");
            flight.addVertex("Dubai");
            flight.addVertex("Mumbai");
            
            auxEdgemaker(flight, "Edinburgh", "Heathrow", 80);
            makeNewFlight("F28DA", "1800", "2100", "0300", 80);
        
        }
        return flight;
	}*/
	
	private static void auxEdgemaker(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> graph, String vertex1, String vertex2, int weight){
		//an auxiliary method add edges and to set edge weights
		
		graph.addEdge(vertex1, vertex2);
		
		graph.setEdgeWeight(graph.addEdge(vertex1, vertex2), weight);
		
		String[] edgeHolder = {vertex1, vertex2}; // temporary array to add to contain vertex 1 and 2 
		
		Edge.add(edgeHolder);  //array to contain edges for printing later
	}
	
	private static void makeNewFlight(String flightNumber, String departure, String arrival, String duration, int cost) {
		
        FlightInfo airplane = new FlightInfo(flightNumber, departure, arrival, duration, cost);
        
        flights.add(airplane); //add to array flights
    }
	
	private static String arrayReader(String[] arrayObject) {
        String text = " ";
        for (int i = 0; i < arrayObject.length; i++) {
        	 text = text + arrayObject[i];
             for (int j = arrayObject[i].length(); j < 10; j++){
                 text = text + " ";
             }
        }
        return text;
    }
}//close main class body	


		