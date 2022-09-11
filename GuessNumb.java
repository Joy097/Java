import java.util.Scanner;

public class GuessNumb {
    

    public static void main(String[] args){
          
        int a = (int)(Math.random()*100);

        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Guess the number :");
        int d = sc.nextInt();


        if(d == -1){
            System.out.println("Gave up already !! The number is : "+a);
            break;
        }
        else if(d>a){
            System.out.println("The number is greater than generated number !!");
        }
        
        else if(d<a){
            System.out.println("The number is smaller than generated number !!");
        }

        else {
            System.out.println("yaaay !! the number is : "+a);
            break;
        }

        }

        }



    }

