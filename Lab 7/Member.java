package customers;

public class Member{
    //all variables should be public and class also should be public so that we can access
    public int[] ph = { 201, 202, 203, 204, 205 };
    public int[] lpt = { 2000, 4000, 3000, 4000, 3000 };
    public String[] name = { "jonah", "lyre", "kayen", "ren", "dante" };
    public String[] email = { "jh@gm.com", "ly@gm.com", "kay@gm.com", "rn@gm.com", "dn@gm.com" };
    
    public void mdetails(String cemail, String rtype, int stay){
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
             System.out.print("\nLoyalty points(Rs): "+lpt[i]);
             System.out.print("\nTotal cost: "+(stay*cost-lpt[i]));
             flag=true; break;
           }
       }
       if(!flag){ System.out.print("Email not found!!");}

}
}
