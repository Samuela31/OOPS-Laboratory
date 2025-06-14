import java.util.*;

class Patient{  
    void details(String pid,String name,int ph,int age,String mail){
        System.out.println("Patient Details: "+'\n');
        System.out.println("Patient ID: "+pid+'\n');
        System.out.println("Patient name: "+name+'\n');
        System.out.println("Patient contact: "+ph+'\n');
        System.out.println("Patient age: "+age+'\n');
        System.out.println("Patient email: "+mail+'\n');
    }  
}  

class General extends Patient{  
   void doc_details(String dname, String vreason){
        System.out.println("Doctor Details: "+'\n');
        System.out.println("Doctor name: "+dname+'\n');
        System.out.println("Reason for visit: "+vreason+'\n');
   }  
}  

class Pediatric extends Patient{  
   void ch_details(String dname, String vaccine, String symptom){
        System.out.println("Pediatric Details:"+'\n');
        System.out.println("Doctor name: "+dname+'\n');
        System.out.println("Vaccine status: "+vaccine+'\n');
        System.out.println("Symptoms: "+symptom+'\n');
   }  
}  

class Reception extends Patient{  
   void recep(int fees, String vmonth){
        System.out.println("Reception Details:"+'\n');
        System.out.println("Fees: "+fees+'\n');
        System.out.println("Month: "+vmonth+'\n');
   }  
}  

class TestInheritance{  
  public static void main(String args[]){ 
      String pid, pname, mail,dname,vreas,symp,month,vacc;
      int contact, age,fees;

      Scanner sc= new Scanner(System.in);

      System.out.print("Enter patient name: ");
      pname=sc.nextLine();

      System.out.print("Enter patient ID: ");
      pid=sc.nextLine();

      System.out.print("Enter patient phone number: ");
      contact=sc.nextInt(); 

      System.out.print("Enter patient age: ");
      age=sc.nextInt();
      sc.nextLine(); // add this line to consume the newline character

      System.out.print("Enter patient email: ");
      mail=sc.nextLine();

      System.out.print("Enter doctor name: ");
      dname=sc.nextLine();

      System.out.print("Enter visit reason: ");
      vreas=sc.nextLine();

      System.out.print("Enter symptoms: ");
      symp=sc.nextLine();

      System.out.print("Enter fees: ");
      fees=sc.nextInt();
      sc.nextLine(); // add this line to consume the newline character

      System.out.print("Enter month: ");
      month=sc.nextLine();

      System.out.print("Enter vaccine status: ");
      vacc=sc.nextLine();

      General gen=new General();
      gen.details(pid,pname,contact,age,mail);  
      gen.doc_details(dname,vreas);  

      Pediatric ped=new Pediatric(); 
      ped.ch_details(dname,vacc,symp); 

      Reception r=new Reception(); 
      r.recep(fees,month); 

  }
}  