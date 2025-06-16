import java.util.*;

class Bank extends Thread{  
  public void run(){  
    int dep,amt;    

    Scanner sc= new Scanner(System.in);

    System.out.print("Enter amount to deposit: ");    
    dep=sc.nextInt();

    System.out.print("Enter amount to withdraw: ");   
    amt=sc.nextInt();

    if(dep>=amt){
        System.out.print("Widthdrawn successfully. Balance: "+(dep-amt));  
    }
    else{
        System.out.print("Widthdraw Failed. Amount greater than balance");  
    }

  }  

     public static void main(String args[]){  
     Bank th=new Bank();  
     th.start();  
     }  
}  