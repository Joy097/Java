import java .util.Scanner;
public class t6{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int u = sc.nextInt();
    
   
    for(int x=u;x>=1;x--)
    {
      for(int j =x-1 ; j>=1;j--)
      {System.out.print(" ");
    }
      
      for(int j =x ; j<=u;j++)
      {System.out.print(j);
    }
    System.out.println();
    }
   
   
   sc.close();
  }
  }