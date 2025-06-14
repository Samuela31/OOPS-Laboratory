import java.util.*;
class stringmethods{
public static void main(String args[])
{
   
int len, i=0, idx, cnt=0;
String s;
char r, rb, rm;
Scanner sc= new Scanner(System.in);

System.out.print("Enter string: ");
s=sc.nextLine();

//strings in java don't terminate with special character
try{
 for(i=0;;i++)
   {
    s.charAt(i);
   }
}
catch(Exception e){} //to catch out of index error
len=i;
System.out.print("String length: "+len);

System.out.print("\nEnter string index: ");
idx=sc.nextInt();
sc.nextLine();

try{
   System.out.print("Character at index "+idx+" : "+s.charAt(idx));
}
catch(Exception e)
{
   System.out.print("Invalid index");
}


StringBuffer sb=new StringBuffer();  
for(i=0;i<len;i++)
  {
    sb=sb.append(s.charAt(len-i-1));
  }
System.out.print("\nString after reversing: "+sb);

System.out.print("\nEnter character to replace: ");
r=sc.next().charAt(0);

System.out.print("Enter substitute character: ");
rb=sc.next().charAt(0);

StringBuffer rp=new StringBuffer();  
for(i=0;i<len;i++)
  {
    if(Character.compare(s.charAt(i),r)==0)
       rp=rp.append(rb);
     else rp=rp.append(s.charAt(i));
  }
System.out.print("\nString after replacing: "+rp);

System.out.print("\nEnter character to remove from original string: ");
rm=sc.next().charAt(0);

StringBuffer rmv=new StringBuffer();  
for(i=0;i<len;i++)
  {
    if(Character.compare(s.charAt(i),rm)!=0)
       rmv=rmv.append(s.charAt(i));
  }
System.out.print("\nString after removing: "+rmv);

} 
}
