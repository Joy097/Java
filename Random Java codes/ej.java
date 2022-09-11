import java.util.Scanner;
public class ej
{public static void main(String[]args)
  {Scanner sc= new Scanner(System.in);
  int a[] = new int[10];
  System.out.println("give the numbers");
  for(int i =0 ; i<a.length ;i++)
  { a [i]=sc.nextInt();
  }
  for(int j =a.length-1 ; j>=0 ;j--)
  {System.out.println(a[j]);
  }
  sc.close();
}}