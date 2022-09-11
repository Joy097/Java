import java.util.Scanner;

public class Lab3task3{
  public static void main(String[]args){
    Scanner szd= new Scanner(System.in);
    System.out.println("Enter my word");
    String word= szd.nextLine();
    for(int i=0;i<word.length();i++){
      if(word.charAt(i)!=' ');
    int code=word.codePointAt(i);
    System.out.println(word.charAt(i)+" : "+code);
  }
}
}
    
