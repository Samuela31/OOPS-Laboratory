package reservations;
import java.time.LocalDate;

public class Booking{
public String[] idate = { "2022-05-19", "2022-04-21",null};
public String[] odate = { "2022-05-29", "2022-04-24",null};
public String[] rtype= {"double","suite",null};
public String[] rid= {"r01","r02",null}; //if i put empty string it'll say empty string cant be converted to date
public String[] cemail= {"jh@gm.com","ly@gm.com",null};

public void bdetails(LocalDate s,LocalDate e, String rt, boolean book){
   boolean flag=false;
   for(int i=0; i<idate.length; i++){
        if(flag || idate[i] == null || odate[i] == null || rtype[i] == null) break;

        LocalDate startDate = LocalDate.parse(idate[i]); 
        LocalDate endDate = LocalDate.parse(odate[i]);        
        
        if (s.isBefore(endDate) && startDate.isBefore(e)) {
             if(rtype[i].equals(rt)){
               System.out.println("Room not available");
               flag=true; 
             }
             else{
               System.out.println("Room available");
               flag=true; 
             }
        }
   }
   if(!flag && !book)  System.out.println("Room available");
   
   else if(!flag && book){
      idate[2]=s.toString(); odate[2]=e.toString(); rtype[2]=rt; rid[2]="r03";  System.out.println("Room booked successfully");
   }
}
}



