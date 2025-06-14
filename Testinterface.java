import java.util.*;

interface inf{

int add(int a, int b);
int sub(int a, int b);
int mul(int a, int b);
int div(int a, int b);

}


class Testinterface implements inf{

public int add(int a, int b){
return a+b;
}

public int sub(int a, int b){
return a-b;
}

public int mul(int a, int b){
return a*b;
}

public int div(int a, int b){
return a/b;
}

public static void main(String[] args)
{
           
int a,b,c;
Scanner sc= new Scanner(System.in);

System.out.print("Enter first number: ");
a=sc.nextInt();

System.out.print("Enter second number: ");
b=sc.nextInt();

Testinterface t = new Testinterface();
System.out.println("Addition of "+a + " and " +b+" = "+ t.add(a,b));
System.out.println("Subtraction of "+a + " and " +b+" = "+ t.sub(a,b));
System.out.println("Multiplication of "+a + " and " +b+" = "+ t.mul(a,b));
System.out.println("Division of "+a + " and " +b+" = "+ t.div(a,b));
}
}
