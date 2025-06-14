import java.util.*;
class fibo{
  public static void main(String args[])
  {
      
    int n1=0, n2=1, i, cnt, temp;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    cnt=sc.nextInt();

    if(cnt==1) System.out.print(0);
    else if(cnt==2) System.out.print(0 + " "+1);
    else{
      System.out.print(0 + " "+1+" ");
      for(i=2;i<cnt;i++)
      {
        temp=n1+n2;
        n1=n2;
        n2=temp;
        System.out.print(temp+" ");
      }

      //in case of while loop
      /*
      i=2;
      while(i<cnt)
      {
        temp=n1+n2;
        n1=n2;
        n2=temp;
        System.out.print(temp+" ");
        i++;
      }
      */
    }
  } 
}
