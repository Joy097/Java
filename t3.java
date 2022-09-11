import java .util.Scanner;
public class t3{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   int u = sc.nextInt();
    for(int i=1;i<=u;i++)
    {for(int j =1 ; j<=i;j++)
      {System.out.print(j);
    }
    System.out.println();
    }
    sc.close();
  }}