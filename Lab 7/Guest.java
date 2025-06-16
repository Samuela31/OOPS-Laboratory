package customers;

//class name should always be capital
public class Guest{
public int[] ph= new int[]{201, 202, 203, 204, 205};
public int[] dis= new int[]{0, 4, 30, 40, 25};
public String[] name= {"john","lily","kay","reena","dan"};
public String[] email = { "jh@gm.com", "ly@gm.com", "kay@gm.com", "rn@gm.com" , "dn@gm.com"};

public void gdetails(String cemail, String rtype, int stay){
boolean flag=false;
int cost=900;

switch (rtype) {
    case "single":
        cost=1000;
        break;
    case "double":
        cost=2000;
        break;
    case "family":
        cost=3000;
        break;
    case "suite":
        cost=4000;
        break;
}

       for(int i=0;i<email.length;i++){
           if(email[i].equals(cemail)){
             System.out.print("Name: "+name[i]);
             System.out.print("\nEmail: "+email[i]);
             System.out.print("\nRoom type: "+rtype);
             System.out.print("\nDuration of stay(in days): "+stay);
             System.out.print("\nPer day cost(Rs): "+cost);
             System.out.print("\nDiscount(Rs): "+dis[i]);
             System.out.print("\nTotal cost: "+(stay*cost-dis[i]));
             flag=true; break;
           }
       }
       if(!flag){ System.out.print("Email not found!!");}
}
}


