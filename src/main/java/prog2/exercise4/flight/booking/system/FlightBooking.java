package prog2.exercise4.flight.booking.system;
import java.util.Scanner;

import java.time.LocalDate;

public class FlightBooking {
    Scanner  my = new Scanner(System.in);
    private String flightCompany = "Flights-of-Fancy";
    String flightID = "rdytvf68tr68";
    private String passengerFullName;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private double totalTicketPrice;
    private String ticketNumber;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private BookingClass Bookingclass;
    private TripSource Tripsource;
    private SourceAirport sourair;
    private DestinationAirport desair;
    private TripDestination td;
    private TripType Triptype;
    private TripDestination Tripdestination;
    private DestinationAirport Destinationairport;
    private String aaa;
    private String bbb;
    private String ccc;
    public FlightBooking(String passengerFullName, LocalDate depart, LocalDate returnDate, int childPassengers, int adultPassengers) {
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
        
    }

    public String getFlightCompany() {
        return flightCompany;
    }

    enum TripSource{
        NANJING("Nanjing"), BEIJING("Beijing"), SHANGHAI("Shanghai"), OULU("Oulu"), HELSINKI("Helsinki"), PARIS("Paris");
        private String Tripsource;
        private TripSource(String tripSource){
                 this.Tripsource = tripSource;
        }
        public String getTripSource() {
            return Tripsource;
        }

    }
    public void setTripSource(String num) {
    
        if(num.equals("1")){
            this.Tripsource = FlightBooking.TripSource.NANJING;}
        else if(num.equals("2")){
            this.Tripsource = FlightBooking.TripSource.BEIJING;}
        else if(num.equals("3")){
            this.Tripsource = FlightBooking.TripSource.OULU;}
        else if(num.equals("4")){
            this.Tripsource = FlightBooking.TripSource.HELSINKI;}
        else if(num.equals("5")){
            this.Tripsource = FlightBooking.TripSource.SHANGHAI;}
        else if(num.equals("6")){
            this.Tripsource = FlightBooking.TripSource.PARIS;}     
    }
    public  TripSource getTripSource() {
        return Tripsource;
    }

public void setaaa(TripSource result,TripDestination result2){
    if (result.equals(TripSource.NANJING) && (result2.equals(TripDestination.BEIJING) || result2.equals(TripDestination.SHANGHAI))){
        this.aaa = "domestic";
   }else if (result.equals(TripSource.BEIJING) && (result2.equals(TripDestination.NANJING) || result2.equals(TripDestination.SHANGHAI))){
        this.aaa = "domestic";
   }else if (result.equals(TripSource.SHANGHAI) && (result2.equals(TripDestination.NANJING) || result2.equals(TripDestination.BEIJING))){
        this.aaa = "domestic";
   }else if (result.equals(TripSource.OULU) && (result2.equals(TripDestination.HELSINKI) || result2.equals(TripDestination.PARIS))){
        this.aaa = "domestic";
   }else if (result.equals(TripSource.HELSINKI) && (result2.equals(TripDestination.OULU) || result2.equals(TripDestination.PARIS))){
        this.aaa = "domestic";
   }else if (result.equals(TripSource.PARIS) && (result2.equals(TripDestination.HELSINKI) || result2.equals(TripDestination.OULU))){
        this.aaa = "domestic";
   }else{
        this.aaa = "international";    
   }
}
public String getAaa() {
    return aaa;
}
public void setBbb(BookingClass bookingclass) {
    if (bookingclass.equals(BookingClass.FIRST)){
        this.bbb = "first";
    }else if(bookingclass.equals(BookingClass.BUSINESS)){
        this.bbb = "business";
    }else{
        this.bbb = "economy";
    }
    }
public String getBbb() {
    return bbb;
}
public void setCcc(String num2) {
    if("1".equals(num2)){
        this.ccc = "one";
    }else{
        this.ccc= "re";
    }
}
public String getCcc() {
    return ccc;
}
    enum TripDestination{
        NANJING("Nanjing"), BEIJING("Beijing"), SHANGHAI("Shanghai"), OULU("Oulu"), HELSINKI("Helsinki"), PARIS("Paris");
        private String tripDestination;
        private TripDestination(String tripDestination){
                 this.tripDestination = tripDestination;
        }
       public String getTripDestination() {
           return tripDestination;
       }
    }
    public void setTripDestination(String num,String num3) {
        if(num3.equals("1")){
            this.td = FlightBooking.TripDestination.NANJING;}
        else if(num3.equals("2")){
            this.td = FlightBooking.TripDestination.BEIJING;}
        else if(num3.equals("3")){
            this.td = FlightBooking.TripDestination.OULU;}
        else if(num3.equals("4")){
            this.td = FlightBooking.TripDestination.HELSINKI;}
        else if(num3.equals("5")){
            this.td = FlightBooking.TripDestination.SHANGHAI;}
        else {
            this.td = FlightBooking.TripDestination.PARIS;}

        if(Tripsource.Tripsource.equals(td.tripDestination)){
        System.out.println("The depature and the destination cannot be the same.Please re-enter.");
       }
       else{
            Tripdestination = td;
    }
}
    public TripDestination getTripdestination() {
        return Tripdestination;
    }  


    enum SourceAirport{
        NANJING("Nanjing Lukou International Airport"), BEIJING("Beijing Capital International Airport"), SHANGHAI("Shanghai Pudong International Airport"), OULU("Oulu Airport"), HELSINKI("Helsinki Airport"), PARIS("Paris Charles de Gaulle Airport");
        private String sourceAirport;
        private SourceAirport(String sourceAirport){
                 this.sourceAirport = sourceAirport;
        }
          public String getSourceAirport() {
              return sourceAirport;
          }
       }
    public void setSourceAirport(TripSource result) {
        if(result.equals(TripSource.NANJING)){
            this.sourair = FlightBooking.SourceAirport.NANJING;}
        else if(result.equals(TripSource.BEIJING)){
            this.sourair = FlightBooking.SourceAirport.BEIJING;}
        else if(result.equals(TripSource.OULU)){
            this.sourair = FlightBooking.SourceAirport.OULU;}
        else if(result.equals(TripSource.HELSINKI)){
            this.sourair = FlightBooking.SourceAirport.HELSINKI;}
        else if(result.equals(TripSource.SHANGHAI)){
            this.sourair = FlightBooking.SourceAirport.SHANGHAI;}
        else if(result.equals(TripSource.PARIS)){
            this.sourair = FlightBooking.SourceAirport.PARIS;}
    }
    public SourceAirport getSourceairport() {
        return sourair;
    }


    enum DestinationAirport{
        NANJING("Nanjing Lukou International Airport"), BEIJING("Beijing Capital International Airport"), SHANGHAI("Shanghai Pudong International Airport"), OULU("Oulu Airport"), HELSINKI("Helsinki Airport"), PARIS("Paris Charles de Gaulle Airport");
        private String destinationAirport;
        private DestinationAirport(String destinationAirport){
                 this.destinationAirport = destinationAirport;
        }
       public String getDestinationAirport() {
           return destinationAirport;
       }
    }
    public void setDestinationAirport(TripDestination result2) {
        if(result2.equals(TripDestination.NANJING)){
            this.desair = FlightBooking.DestinationAirport.NANJING;}
        else if(result2.equals(TripDestination.BEIJING)){
            this.desair = FlightBooking.DestinationAirport.BEIJING;}
        else if(result2.equals(TripDestination.OULU)){
            this.desair = FlightBooking.DestinationAirport.OULU;}
        else if(result2.equals(TripDestination.HELSINKI)){
            this.desair = FlightBooking.DestinationAirport.HELSINKI;}
        else if(result2.equals(TripDestination.SHANGHAI)){
            this.desair = FlightBooking.DestinationAirport.SHANGHAI;}
        else if(result2.equals(TripDestination.PARIS)){
            this.desair = FlightBooking.DestinationAirport.PARIS;}


        if(sourair.sourceAirport.equals(desair.destinationAirport)){
            System.out.println("The depature airport and the destination airport cannot be the same.Please re-enter.");
           }
           else{
            Destinationairport = desair;
           }
           
    }
    public DestinationAirport getDestinationairport() {
        return Destinationairport;
    }

    
    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }

    public String getPassengerFullName() {
        return passengerFullName;
    }
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers) {
       if("domestic".equals(aaa) && "first".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.1*300) + (0.05*300))) + (adultPassengers*(300 + (0.1*300) + (0.05*300))) + 250;
       }else if("domestic".equals(aaa) && "business".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.1*300) + (0.05*300))) + (adultPassengers*(300 + (0.1*300) + (0.05*300))) + 150;
       }else if("domestic".equals(aaa) && "economy".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.1*300) + (0.05*300))) + (adultPassengers*(300 + (0.1*300) + (0.05*300))) + 50;
       }else if("international".equals(aaa) && "first".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.15*300) + (0.1*300))) + (adultPassengers*(300 + (0.15*300) + (0.1*300))) + 250;
       }else if("international".equals(aaa) && "business".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.15*300) + (0.1*300))) + (adultPassengers*(300 + (0.15*300) + (0.1*300))) + 150;
       }else if("international".equals(aaa) && "economy".equals(bbb))
       {this.departingTicketPrice =(childPassengers *(300 + (0.15*300) + (0.1*300))) + (adultPassengers*(300 + (0.15*300) + (0.1*300))) + 250;
       }
    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }
    public void setReturnTicketPrice() {
        if("re".equals(ccc)){
    this.returnTicketPrice = departingTicketPrice;
}else{
    this.returnTicketPrice = 0;
}
   }
    public double getReturnTicketPrice() {
        return returnTicketPrice;
    }
    
    public void setTotalTicketPrice() {
       this.totalTicketPrice = departingTicketPrice + returnTicketPrice;
    }
    
    public double getTotalTicketPrice() {
        return totalTicketPrice;
    }
    
    public static String usingMath(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String allCharacters = alphabetsInUpperCase + numbers;
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * allCharacters.length());
            a.append(allCharacters.charAt(randomIndex));
        }
        return a.toString();
    }
    public void setTicketNumber(BookingClass bookingClass,TripType triptype) {
       if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.FIRST) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "11F" + a + "DOM";
       }else if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.BUSINESS) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "11B" + a + "DOM";
       }else if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.ECONOMY) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "11E" + a + "DOM";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.FIRST) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "22F" + a + "DOM";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.BUSINESS) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "22B" + a + "DOM";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.ECONOMY) && aaa.equals("domestic") )  {
           String a = usingMath(4);
           this.ticketNumber = "22E" + a + "DOM";
       }else if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.FIRST) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "11F" + a + "INT";
       }else if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.BUSINESS) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "11B" + a + "INT";
       }else if(triptype.equals(TripType.ONE_WAY) && bookingClass.equals(BookingClass.ECONOMY) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "11E" + a + "INT";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.FIRST) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "22F" + a + "INT";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.BUSINESS) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "22B" + a + "INT";
       }else if(triptype.equals(TripType.RETURN) && bookingClass.equals(BookingClass.ECONOMY) && aaa.equals("international") )  {
           String a = usingMath(4);
           this.ticketNumber = "22E" + a + "INT";
       }
    }
    public String getTicketNumber() {
        
        return ticketNumber;
    }
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
    public LocalDate getDepartingDate() {
        return departureDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        long between = returnDate.toEpochDay()-departureDate.toEpochDay();
        if(between >= 2){
            this.returnDate = returnDate;
        }else{
            this.returnDate = departureDate.plusDays(2);
        }
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }


    public int getChildrenPassengers() {
        return childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setTotalPassengers(int adultPassengers,int childPassengers) {
        this.totalPassengers = adultPassengers + childPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }
   
    enum BookingClass{
        FIRST("First"),BUSINESS("Business"),ECONOMY("Economy");
        private String BookingClass;
        private BookingClass(String BookingClass){
                 this.BookingClass = BookingClass;
        }
        public String getBookingClass() {
          return BookingClass;
      }
    }
    
   public void setBookingClass(String num1) {
    if(num1.equals("1")){
        this.Bookingclass = FlightBooking.BookingClass.FIRST;}
    if(num1.equals("2")){
        this.Bookingclass = FlightBooking.BookingClass.BUSINESS;}
    if(num1 .equals("3")){
        this.Bookingclass = FlightBooking.BookingClass.ECONOMY;}
   }
    public BookingClass getBookingclass() {
        return Bookingclass;
    }

    enum TripType{
        ONE_WAY("One way"),RETURN("Return");
        private String TripType;
        private TripType(String TripType){
            this.TripType = TripType;
        }
        public String getTripType() {
            return TripType;
        }
    }
    public void setTripType(String num2) {
        if(num2.equals("1")){
            this.Triptype = FlightBooking.TripType.ONE_WAY;}
        if(num2.equals("2")){
            this.Triptype = FlightBooking.TripType.RETURN;} 
    }
    public TripType getTripType() {
        return Triptype;
    }

    public String toString() {
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +  
        flightCompany + ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + Tripsource + " to " + Tripdestination + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returnDate + "\n" + 
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice; 
    }
    

    }



