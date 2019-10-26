package flightgraphE;


import java.util.ArrayList;

import org.jgrapht.graph.*;


public class graph {
	
	
	protected static ArrayList<String[]> Edges = new ArrayList<String[]>(); //made these arrays static so their instances can be accessed from anywhere in the program
	
	protected static ArrayList<FlightInfo> Departures = new ArrayList<FlightInfo>();
	
	
	private final SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> flights = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);
	
	
	
	public void addVertex(String name) {
        flights.addVertex(name);
        
    }

    public void setEdges(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> flights, String v1, String v2, double weight) {
        
        flights.addEdge(v1, v2);
        
        flights.addEdge(v2, v1);//swap round vertices to create a flight that goes both ways.
        
        flights.setEdgeWeight(flights.getEdge(v1, v2), weight);
        
        flights.setEdgeWeight(flights.getEdge(v2, v1), weight);
        
        String[] edgeHolder1 = {v1, v2};
        
        		Edges.add(edgeHolder1);
        		
        String[] edgeHolder2 = {v2, v1};
        
        		Edges.add(edgeHolder2);
    }
    

   public void makeNewFlight(String flightNo, String depTime, String arrTime, String Duration, int cost){
	   FlightInfo depart = new FlightInfo(flightNo, depTime, arrTime, Duration, cost);
       Departures.add(depart);
       
       
       
	   
   }
     
    public SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> getGraph() {
    	
    	return flights;
    }
    


}
