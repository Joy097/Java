public class star{
  public static void main(String[]args){
    int i;
    int j;
    int l;
    int m;
    for(i=1;i<=4;i++)
    {for(j=3;j>=i;j--)
      { System.out.print(" ");
    }
    for(l=1;l<=i;l++)
      { System.out.print("U");
    }
    for(m=2;m<=i;m++)
      { System.out.print("U");
    }
    System.out.println();
    }
    for(i=1;i<=3;i++)
    {for(j=1;j<=i;j++)
      { System.out.print(" ");
    }
    for(l=3;l>=i;l--)
      { System.out.print("U");
    }
    for(m=2;m>=i;m--)
      { System.out.print("U");
    }
    System.out.println();
    }
  }}