package flightgraphE;


import java.util.List;
import java.util.StringTokenizer;

import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class LeastCost extends graph {
	

	private String arrayReader(String[] arrayObject) {
	    String text = " ";
	    for (int i = 0; i < arrayObject.length; i++) {
	    	 text = text + arrayObject[i];
	         for (int j = arrayObject[i].length(); j < 10; j++){
	             text = text + " ";
	         }
	    }
	    return text;
	    
	}
	
	LeastCost(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> travel, String departure, String destination){
		
		String Leaving = departure;
		String Arrival = destination;
		
		
		//System.out.println("Shortest path from "+Leaving+"  to "+ Arrival +":");
	    DijkstraShortestPath<String, DefaultWeightedEdge> path = new DijkstraShortestPath<String, DefaultWeightedEdge>(travel, Leaving, Arrival);
	    path.getPath();
	    
	    List<DefaultWeightedEdge> edges = path.getPathEdgeList();
	    
	    String airport;
        int leg = 1;
        

        if (edges != null) {
            
        	
        	System.out.println("Itinerary for: "+Leaving+" to "+ Arrival );
            System.out.println("Leg\tLeave\t\tAt\tNumber\tArrive\t\tAt");

            for (Object edge : edges) {
            	
                airport = edge.toString();
              
                StringTokenizer edgePart = new StringTokenizer(airport, ":");//using string tokenizer to split up edges to get
                													//individual airports from the edges used to create the path

                String airportOne = edgePart.nextToken().trim().substring(1);
                String airportTwo = edgePart.nextToken().trim();
                airportTwo = airportTwo.substring(0, airportTwo.length() - 1);
  
                
                
		for (int i = 0; i < Departures.size(); i++) {
			if (airportOne.equals(Edges.get(i)[0]) && airportTwo.equals(Edges.get(i)[1])) {
			FlightInfo info = Departures.get(i);
		
	            String flightNo = info.flightNo;
	            String firstAir = airportOne;
	            String depTime = info.depTime;
	            String secondAir = airportTwo;
	            String arrTime = info.arrTime;
	            String price = Integer.toString(info.price);
	            String flightDuration = info.duration;
	            
	            String test = (leg +"\t"+firstAir+"\t"+flightNo +"\t"+depTime+"\t"+secondAir+"\t"+arrTime);
				
				
				System.out.println(test);
            
            
            
    		
            
					}
            	}
		leg++;
            }
            
        }
            System.out.println("Cost of route = £" + path.getPathLength());
            
        
  }
	
	
	
	
	
}
