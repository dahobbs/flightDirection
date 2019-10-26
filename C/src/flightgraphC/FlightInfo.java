package flightgraphC;



public class FlightInfo  {
	String depTime;
    String arrTime;
    String flightNo;
    String duration;
    int price;

    public FlightInfo(String depTime, String arrTime, String flightNo, String duration, int price){
        this.depTime = depTime;
        this.arrTime = arrTime;
        this.flightNo = flightNo;
        this.duration = duration;
        this.price = price;
    }

    public double getDuration(){
        double duration = Integer.parseInt(arrTime) - Integer.parseInt(depTime);
        return duration / 100;
    }

    /*public String getLocTime(){
        int value = Integer.parseInt(locTime) + Integer.parseInt(arrTime);
        locTime = ""+value;
        return locTime;
    }*/

    public String getFlightNo(){
        return flightNo;
    }


    public double getPrice(){
        return price;
    }
}
  	

