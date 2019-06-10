package concept.thiskeyword;

public class StaticKeyword {

    static int i; 
      
    // start of static block  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    // end of static block 
    public static void main(String args[]) { 
    	  
        
        System.out.println(StaticKeyword.i);  
    } 
} 
 

