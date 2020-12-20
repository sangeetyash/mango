package pageObjects;

public class HelloWorld{

    public static void main(String []args){
       System.out.println("Hello World");
       
       for(int i =0 ; i<10 ; i++)
       {
    	   if(i==3)
           {
                       System.out.println("continue Hello World at "+i);
                       continue;
           }  
           if(i==7)
           {
                       System.out.println("break Hello World at "+i);
                       break;
           }   
                                   System.out.println("i equals to "+i);

       }
    }
}