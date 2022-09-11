import java .util.Scanner;
public class t8{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int u = sc.nextInt();
    int h = sc.nextInt();
    for(int i=1;i<=u;i++)
    { for(int j =1 ; j<=h;j++)
      {
      if(i>=2&&j>=2&&i<=u-1&&j<=h-1)
      {System.out.print(" ");
      }
      
      else
      {System.out.print(j);
      }}     
     
      System.out.println();
    }
    
    sc.close(); }}
   
  