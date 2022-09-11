public class class5{
public static void main (String [] args)  {
        MyString t1 = new MyString ("WINTERFELL") ;
        
      
        System.out.println (t1.length ()) ;
        
        
        t1.charAt (3) ;
        
       
        t1.startsWith ("WINTER") ;
        
       
        t1.endsWith ("FELL") ;
        
      
        t1.replaceFirst ('L' , 'e') ;
        System.out.println () ;
  
        
        t1.replaceAll ('L' , 'e')  ;
        System.out.println () ;
        
        
        t1.replaceLast ('L' , 'e') ;
        System.out.println () ;
        
        
        t1.toLowerCase () ;
        
       
        t1.toUpperCase () ;
        
        
        t1.equals("WINTERFELL") ;
        
       
        t1.equalsIgnoreCase ("WintERfell") ;
        
        
        t1.compareTo ("TERFELL") ;
        
        
        t1.compareToIgnoreCase ("wINTERFEll") ;
        
        
        t1.substring (1) ;
        
       
        t1.substring (3,7) ;
}}
