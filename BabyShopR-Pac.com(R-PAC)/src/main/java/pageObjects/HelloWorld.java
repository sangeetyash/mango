package pageObjects;

public class HelloWorld{

    public static void main(String []args){
       System.out.println("Hello World");
       String a,b;
       a="Order confirm successfully. RPO No. - 1000042779,1000042780,1000042781,1000042782,1000042783";
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
       
       System.out.println("RPO No. ->"+a.substring(37));
    }
}