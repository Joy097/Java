public class LinearArray{
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
   
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    /*
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
    
    
  }
  */
    
  }
  // Prints the contents of the source array
  public static void printArray(int [] source){
    for(int i=0;i<source.length;i++){
      System.out.println(source[i]+",");
    }
  }
  public static int [] copyArray(int[]source,int len){
    int y[]=new int[len];
    for(int i=0;i<len;i++){
      y[i]=source[i];
}
    return y;
  }
  public static void printReverse(int [] source){
    for(int i=source.length-1;i>0;i--){
      System.out.print(source[i]+" , ");
  }
  }
  public static void reverseArray(int[] source){
  int[]b=new int[source.length];
        int j=b.length-1;
        for(int i=0;i<b.length;i++){
            b[i]=source[j];
            j--;
        }
        
    }
  public static int[] shiftLeft(int[]source,int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<source.length-1;j++){
                source[j]=source[j+1];
            }                    
            source[source.length-1]=0;
        }
        return source;
  }
   public static int[] rotateLeft(int[]source,int k){   
        for(int i=0;i<k;i++){
         int l=source[0];
            for(int j=0;j<source.length-1;j++){
                source[j]=source[j+1];
            }
            
          source[source.length-1]=l;
        }
        return source;
  }
  
    public static int[] shiftRight(int[]source,int k){
        for(int i=0;i<k;i++){
            for(int j=source.length-1;j>0;j--){
                source[j]=source[j-1];
            }                    
            source[0]=0;
        }
        return source;
  }
     public static int[] rotateRight(int[]source,int k){
     for(int i=0;i<k;i++){
            int l=source[source.length-1];
            for(int j=source.length-1;j>0;j--){
                source[j]=source[j-1];
            }
           source[0]=l;
        }
     
     return source;
    
     }
     public static boolean insert(int[]arr,int size,int elem,int index){
      for(int i=0;i<size;i++){
            int lost=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=lost;
        }
      return false;
}
}   
  
  
  
  
  

