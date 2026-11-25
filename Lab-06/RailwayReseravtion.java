import java.util.Scanner;


class SeatAlreadyBookedException extends Exception{
   public SeatAlreadyBookedException(String message){
      super(message);
   }
}


class Reservation{
   boolean[] seats;
   
   Reservation(int totalSeats){
      seats = new boolean[totalSeats+1];   
   }
   
   void reserveSeat(int seatNumber) throws SeatAlreadyBookedException{
      if(seatNumber<=0 || seatNumber>=seats.length){
         throw new IllegalArgumentException("Invalid seat number");
      }

      if(seats[seatNumber]){
         throw new SeatAlreadyBookedException("Seat "+seatNumber+" is already booked!");
      }

      seats[seatNumber] = true;
      System.out.println("Seat "+seatNumber+" reserved successfully!");
   }
 }


 public class RailwayReseravtion{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Reservation r = new Reservation(10);

      try{
         
         System.out.print("Enter seat number: ");
         int seatNumber = sc.nextInt();
         r.reserveSeat(seatNumber);
      }

      catch(SeatAlreadyBookedException e){
         System.out.println("Booking Error: "+e.getMessage());
      }

      catch(IllegalArgumentException e){
         System.out.println("Invalid Input: "+e.getMessage());
      }

      catch(java.util.InputMismatchException e){
         System.out.println("Error: Please enter a valid integer!");
      }

      finally{
         System.out.println("Transaction complete!");
         sc.close();
      }
   
   }

 }