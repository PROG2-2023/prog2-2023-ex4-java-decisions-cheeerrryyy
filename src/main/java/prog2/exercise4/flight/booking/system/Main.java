package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    private static final LocalDate depart = null;
    private static final LocalDate returnDate = null;

    public static void main( String[] args)
    {
        Scanner myscanner = new Scanner(System.in);
        FlightBooking fb = new FlightBooking("null", depart, returnDate, 2, 3); 
       
       
        FlightBooking.BookingClass choice1 = FlightBooking.BookingClass.FIRST;
        FlightBooking.BookingClass choice2 = FlightBooking.BookingClass.BUSINESS;
        FlightBooking.BookingClass choice3 = FlightBooking.BookingClass.ECONOMY;
        System.out.println("Please pick the number of class you would like to travel in " );
        System.out.println("1." + choice1);
        System.out.println("2." + choice2);
        System.out.println("3." + choice3);
        String num1 = myscanner.nextLine();
        fb.setBookingClass(num1);
        FlightBooking.BookingClass BookingClass = fb.getBookingclass();
        
       
        System.out.println("Please pick the choice(number) of 1.One way /n 2.Return ");
        String num2 = myscanner.nextLine();
        fb.setTripType(num2);
        FlightBooking.TripType triptype = fb.getTripType();


         FlightBooking.TripSource c1 = FlightBooking.TripSource.NANJING;
         FlightBooking.TripSource c2 = FlightBooking.TripSource.BEIJING;
         FlightBooking.TripSource c3 = FlightBooking.TripSource.OULU;
         FlightBooking.TripSource c4 = FlightBooking.TripSource.HELSINKI;
         FlightBooking.TripSource c5 = FlightBooking.TripSource.SHANGHAI;
         FlightBooking.TripSource c6 = FlightBooking.TripSource.PARIS;
         System.out.println("Please pick the number of tripsouce you would like to travel" );
         System.out.println("1." + c1);
         System.out.println("2." + c2);
         System.out.println("3." + c3);
         System.out.println("4." + c4);
         System.out.println("5." + c5);
         System.out.println("6." + c6);
         String num = myscanner.nextLine();
         fb.setTripSource(num);
        FlightBooking.TripSource result = fb.getTripSource();

        fb.setSourceAirport(result);
        //FlightBooking.SourceAirport go = fb.getSourceairport();

        
 
         FlightBooking.TripDestination d1 = FlightBooking.TripDestination.NANJING;
         FlightBooking.TripDestination d2 = FlightBooking.TripDestination.BEIJING;
         FlightBooking.TripDestination d3 = FlightBooking.TripDestination.OULU;
         FlightBooking.TripDestination d4 = FlightBooking.TripDestination.HELSINKI;
         FlightBooking.TripDestination d5 = FlightBooking.TripDestination.SHANGHAI;
         FlightBooking.TripDestination d6 = FlightBooking.TripDestination.PARIS;
         System.out.println("Please pick the number of tripdestination you would like to go" );
         System.out.println("1." + d1);
         System.out.println("2." + d2);
         System.out.println("3." + d3);
         System.out.println("4." + d4);
         System.out.println("5." + d5);
         System.out.println("6." + d6);
         String num3 = myscanner.nextLine();
         fb.setTripDestination(num,num3);
        FlightBooking.TripDestination result2 = fb.getTripdestination();

        fb.setDestinationAirport(result2);
        //FlightBooking.SourceAirport back = fb.getSourceairport();
        
        System.out.println("Please input your date of departure:");
        String sta = myscanner.nextLine();
        LocalDate departure = LocalDate.parse(sta);
        fb.setDepartureDate(departure);
        LocalDate departureDate = fb.getDepartingDate();
        System.out.println("Please input your date of returning:");
        String sta2 = myscanner.nextLine();
        LocalDate returningDate = LocalDate.parse(sta2);
        fb.setReturnDate(returningDate);
        LocalDate returningDate2 = fb.getReturnDate();

        fb.setaaa(result,result2);
        String doi = fb.getAaa();
        fb.setBbb(BookingClass);
        String doi2 = fb.getBbb();
        fb.setCcc(num2);
        String doi3 = fb.getCcc();
        fb.setTicketNumber(BookingClass, triptype);
        String ticketNumber = fb.getTicketNumber();
        
        System.out.println("Dear passenger please input Your FullName:");
        String passengerFullName = myscanner.nextLine();
        System.out.println("Dear passenger please input the number of childpassengers:");
        int childpassengers = myscanner.nextInt();
        System.out.println("Dear passenger please input the number of adultpassengers:");
        int adultpassengers = myscanner.nextInt();
        myscanner.close();
        String company = fb.getFlightCompany();
        
        fb.setTotalPassengers(adultpassengers, childpassengers);
        int totalPassengers = fb.getTotalPassengers();
        fb.setDepartingTicketPrice(childpassengers,adultpassengers);
        double departprice = fb.getDepartingTicketPrice();
        fb.setReturnTicketPrice();
        double returnprice = fb.getReturnTicketPrice();
        fb.setTotalTicketPrice();
        double totalTicketPrice = fb.getTotalTicketPrice();
      
       if(returningDate != returningDate2){
        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " +  
        company + ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + result + " to " + result2 + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returningDate + "\n" + "Changed from old returningDate to new returningDate" +
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice + "\n" +
        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
       }else {
        System.out.println("Dear " + passengerFullName + ". Thank you for booking your flight with " +  
        company + ". Following are the details of your booking and the trip:" + "\n" +  
        "Ticket Number: " + ticketNumber + "\n" +  
        "From " + result + " to " + result2 + "\n" + 
        "Date of departure: " + departureDate + "\n" + 
        "Date of return: " + returningDate + "\n" +
        "Total passengers: " + totalPassengers + "\n" + 
        "Total ticket price in Euros: " + totalTicketPrice);
       }
        }
    }
