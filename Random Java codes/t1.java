import java.util.Scanner;
public class t1
{public static void main(String[]args)
  {Scanner suck = new Scanner(System.in);
  System.out.println("give");
  int a = suck.nextInt();
  if(a%2 == 0)
  {if(a>10)
    {System.out.println("even big 10");
  }
  else if(a<10)
  {System.out.println("even less 10");
  }
  }
  else
  {if(a>10)
    {System.out.println("odd big 10");
  }
  else if(a<10)
  {System.out.println("odd less 10");
  }
  }
  suck.close();
}}