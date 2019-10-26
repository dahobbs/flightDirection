package flightgraphD;

//David Hobbs
//Part D displays an itinerary of flights from departure to arrival.
import java.util.List;
import java.util.StringTokenizer;

import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class LeastCost extends graph {
	
	
	LeastCost(SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> travel, String departure, String destination){
		
		String Leaving = departure;
		String Arrival = destination;
		
		
		//System.out.println("Shortest path from "+Leaving+"  to "+ Arrival +":");
	    DijkstraShortestPath<String, DefaultWeightedEdge> path = new DijkstraShortestPath<String, DefaultWeightedEdge>(travel, Leaving, Arrival);
	    path.getPath(); //find path from arrival to destination so it can be broken down in a list
	    
	    List<DefaultWeightedEdge> edges = path.getPathEdgeList(); //this breaks down the path into a list of edges that can be iterated over.
	    int leg = 1;//Initialising the leg counter to be incremented with each cycle of the loop

        if (edges != null) {
               	
        	System.out.println("Itinerary for: "+Leaving+" to "+ Arrival );
            

            for (Object edge : edges) { // loop to iterate over the edges
            	
                String airport = edge.toString();
              
                StringTokenizer edgePart = new StringTokenizer(airport, ":");//using string tokenizer with ':' as delimiter to split up edges to get
                															//individual airports from the edges used to create the path

                String airportOne = edgePart.nextToken().trim().substring(1); //using trim to remove whitespace and substring to return
                															// the string from index 1 onwards as there would be a bracket at the start
                String airportTwo = edgePart.nextToken().trim();
                
                airportTwo = airportTwo.substring(0, airportTwo.length() - 1); // substring -1 removes the final bracket from the end of the path
  
               
                	//iterating over the Departures
					for (int i = 0; i < Departures.size(); i++) {
						//This conditional stops the loop from outputting all flights in the Departures array
						if (airportOne.equals(Edges.get(i)[0]) && airportTwo.equals(Edges.get(i)[1])) {
							
								FlightInfo info = Departures.get(i);
								
								String firstAir = airportOne;
								
								String secondAir = airportTwo;
								
								String flightNo = info.flightNo;
								
								String depTime = info.depTime;
								
								String arrTime = info.arrTime;
				            
					            //formatting the string to display flights in organised blocks
					            String output = ("Flight: "+leg +"\nAirPort: "+firstAir+"\nDeparture: "+depTime+"\nFlightNo:" +flightNo +"\nArrival: "+secondAir +"\nAt: "+arrTime+"\n\n");
								
								System.out.println(output);
			
						}
			          }
					leg++; //increment leg when another flight is required
            }  
        }
        System.out.println("Total Journey Cost = £" + path.getPathLength()); //use Dijkstra getPathLength to quickly add up all edge weights and display total edge weight (cost of flights)
    
  }
	
}
