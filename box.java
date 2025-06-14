
  
public class box{  
    //instance variables of the class  
    int peri, vol;  
    
    box()
    {  
        System.out.println("This a default constructor named box\nSee calculations below via constructor overloading-");  
    }  
    
    box(int l, int b, int h)
    {
        vol=l*b*h;
        peri=4*vol;
        System.out.println("Volume="+vol+"\nPerimeter="+peri);
    }

    box(int ts)
    {
        System.out.println("Total Surface Area="+ts);
    }
    
    public static void main(String[] args) {  
        int l=10, b=11, h=12;

        //object creation  
        box emp = new box();  
        //System.out.println(emp);  
        
        box vp= new box(l, b, h);  
        //System.out.println(vp);  

        box tsa=new box(2*(l*b + b*h+ h*l));
        //System.out.println(tsa);

    }  
} 
