

public class Lab3task7{
  public static void main(String[]args){
   
    String a = "dog";
    String b = "dodge";
    String c = "dodge viper";
    String d = "dog";
    String e = "dog is here";
    String f = "dog was here but died yesterday";
     String g = "NO ONE STAYS";
      String h = "    ONE    ";
       Integer i =Integer.valueOf(120) ;
      
    int x = a.compareTo(b);
    
    System.out.println(x);
  int y = b.compareToIgnoreCase(c);
  System.out.println(y);
  
  
   System.out.println(b.startsWith("dog"));
  System.out.println(c.endsWith("viper"));
  System.out.println(a.equals(d));
  System.out.println(a.equalsIgnoreCase(e));
   System.out.println(e.indexOf("d"));
   System.out.println(e.lastIndexOf("e"));
    System.out.println(e.length());
  System.out.println(e.replace("dog","he")); 
   System.out.println(f.substring(17));
    System.out.println(f.toCharArray());
   System.out.println(g.toLowerCase());
   System.out.println(f.toUpperCase());
     System.out.println(h.trim());
     System.out.println(i);
   
   
   }}