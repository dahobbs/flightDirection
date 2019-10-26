package flightgraphD;

//David Hobbs H00251314 Data collections course work 2
//Part D displays an itinerary of flights from departure to arrival.

public class FlightInfo  {
	
	// this class formats flight information for addition to the Destination Array list
	String depTime;
    String arrTime;
    String flightNo;
    String duration;
    int price;

    public FlightInfo(String flightNo, String arrTime, String depTime, String duration, int price){
        

    	this.depTime = depTime;
        this.arrTime = arrTime;
        this.flightNo = flightNo;
        this.duration = duration;
        this.price = price;
    }
}
  	

