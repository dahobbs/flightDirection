package flightgraphE;



public class FlightInfo  {
	
	
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
  	

