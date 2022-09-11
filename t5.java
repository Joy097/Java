import java .util.Scanner;
public class t5{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int u = sc.nextInt();
    
   
    for(int i=1;i<=u;i++)
    {
      for(int j =u-1 ; j>=i;j--)
      {System.out.print(" ");
    }
      
      for(int j =1 ; j<=i;j++)
      {System.out.print(j);
    }
    System.out.println();
    }
   
   
 
   sc.close();
  }
  }