package reservations;
import reservations.Booking;

public class Cancellation{
public void cdetails(String rid){
    boolean flag=false;

    Booking b = new Booking();
    String[] crid = b.rid;

    for(int i=0;i<crid.length;i++){
       if(rid.equals(crid[i])){ 
          System.out.print("Reservation cancelled");
          flag=true; break;
       }
    }
    if(!flag){ System.out.print("Enter correct reservation ID!!");}
}
}