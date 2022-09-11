import java.util.Scanner;
public class e2
{public static void main(String[]args)
  {Scanner sc= new Scanner(System.in);
  int a[] = new int[5];
  System.out.println("give the numbers");
  for(int i =0 ; i<a.length ;i++)
  {a[i] = sc.nextInt();
  }
  int s;
  for(int x =0 ; x<a.length ;x++)
  {for(int y =0 ; y<a.length ;y++)
    {if(a[x]<a[y])
    {s=a[x];
      a[x]=a[y];
      a[y]=s;
    }}}
  for(int u =0 ; u<a.length ;u++)
  {
  System.out.println(a[u]);
  }
  sc.close();
}}