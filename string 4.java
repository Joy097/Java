import java.util.Scanner;

public class Lab3task4{
  public static void main(String[]args){
    Scanner szd= new Scanner(System.in);
    System.out.println("Enter my word");
    String word= szd.nextLine();
   int []wordArray= new int[91];
   for(int i=0;i<word.length();i++){
     int code= (int)word.charAt(i);
     ++wordArray[code];
   }
   for(int j=65;j<91;j++){
     System.out.println((char)j+"which is "+j+" was seen "+wordArray[j]+" times ");
   }
  }
}
    