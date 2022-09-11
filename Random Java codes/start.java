import java.util.Scanner;
public class start{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int z = 0;
    
    System.out.println("enter the numbers of chocolates and children which should be greater than zero and less than 150" );
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    
    
    if(X%Y==0){
      System.out.println("you have to buy "+z+" chocolates");
    }
    else if(X%Y!=0){
      z = X%Y ; 
      System.out.println("you have to buy "+z+" chocolates");
    }
    sc.close();
  }}
      