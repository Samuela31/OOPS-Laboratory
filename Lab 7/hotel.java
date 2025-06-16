import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import customers.Guest;
import customers.Member;

import rooms.DoubleRoom;
import rooms.FamilyRoom;
import rooms.SingleRoom;
import rooms.Suite;

import reservations.Booking;
import reservations.Cancellation;

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//checking room availability
        System.out.print("Enter starting date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate sdate = LocalDate.parse(input);

        System.out.print("Enter ending date (yyyy-mm-dd): ");
        input = sc.nextLine();
        LocalDate edate = LocalDate.parse(input);

        System.out.print("Enter room type: ");
        String rtype = sc.nextLine();

        Booking b = new Booking();
        b.bdetails(sdate,edate,rtype,false);

//booking room
        System.out.print("\nEnter your name: ");
        String cname = sc.nextLine();

        System.out.print("Enter email: ");
        String cemail = sc.nextLine();

        System.out.print("Enter starting date (yyyy-mm-dd): ");
        input = sc.nextLine();
        sdate = LocalDate.parse(input);

        System.out.print("Enter ending date (yyyy-mm-dd): ");
        input = sc.nextLine();
        edate = LocalDate.parse(input);

        System.out.print("Enter room type: ");
        rtype = sc.nextLine();

        b.bdetails(sdate,edate,rtype,true);

//reservation cancellation
        System.out.print("\nEnter reservation ID to cancel: ");
        String rid = sc.nextLine();

        Cancellation c = new Cancellation();
        c.cdetails(rid);

//calculating bill
        System.out.print("\nEnter status (guest/member): ");
        String st = sc.nextLine();

        long days = ChronoUnit.DAYS.between(sdate, edate);
        int ndays = (int) days;

        if(st.equals("guest")){
        Guest g = new Guest();
        g.gdetails(cemail,rtype,ndays);
        }

        else if(st.equals("member")){
        Member m = new Member();
        m.mdetails(cemail,rtype,ndays);
        }

        else{System.out.print("Invalid value!!");}

    }
}

