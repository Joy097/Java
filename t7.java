import java .util.Scanner;
public class t7{
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
      for(int o =2 ; o<=i;o++)
      {System.out.print(o+1);
    }
    System.out.println();
    }
   
   
 
   sc.close();
  }
  }