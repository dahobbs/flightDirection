package flightgraphD;
//David Hobbs H00251314 Data collections course work 2
//Part D displays an itinerary of flights from departure to arrival.

import java.util.ArrayList;

import org.jgrapht.graph.*;


public class graph {
	
	//making the arrays static so they can be accessed throughout the package but not from outside the package
	protected static ArrayList<String[]> Edges = new ArrayList<String[]>(); 
	
	protected static ArrayList<FlightInfo> Departures = new ArrayList<FlightInfo>();
	
	
	private final SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> flights = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
	
	
	
	public void addVertex(String name) {
        flights.addVertex(name); // adds vertices to the graph
        
    }
	
	//main builder of edges, adds the results to Edges array list for easy access later

    public void setEdges(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> flights, String v1, String v2, double weight) {
        
        flights.addEdge(v1, v2);
        
        flights.addEdge(v2, v1);//swap round vertices to create a flight that goes both ways.
        
        flights.setEdgeWeight(flights.getEdge(v1, v2), weight); // swap round vertices so flights can go both ways
        
        flights.setEdgeWeight(flights.getEdge(v2, v1), weight);
        
        String[] edgeHolder1 = {v1, v2}; //small array to hold results passe from Main for addition to the array list
        
        		Edges.add(edgeHolder1);
        		
        String[] edgeHolder2 = {v2, v1};
        
        		Edges.add(edgeHolder2);
    }
    
    //takes makeNewFlight info from Main and builds a new object and adds the results to Departures Array list
   public void makeNewFlight(String flightNo, String depTime, String arrTime, String Duration, int cost){
	   FlightInfo depart = new FlightInfo(flightNo, depTime, arrTime, Duration, cost);
       Departures.add(depart);

   }
     
    public SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> getGraph() {
    	
    	return flights; //return flights graph to Main so that the graph can be inserted into other methods
    }
    


}
