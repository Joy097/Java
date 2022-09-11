import java.util.Scanner;

public class Lab3task6{
  public static void main(String[]args){
    Scanner szd= new Scanner(System.in);
    System.out.println("Enter my word");
    String word= szd.nextLine();
    String string=" The End ";
    System.out.println("How many lines of outputs do you want to see");
int n=szd.nextInt();
for(int i=0;i<=n;i++){
  if(i%2==1){
    System.out.println(word);
  }
  else{
    System.out.println(word.concat(string));
  }
}
  }
}
