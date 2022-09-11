class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    Pen(String c, String t){
        this.color = c;
        this.type = t;
    }


}


class Student{
    String name;
    int age;
    int id;

    public void printinfo(){
        System.out.println(this.name+" - "+this.id+" - "+this.age);
    }

    


}

public class OOPS{


    public static void main (String args[]){

        Pen pen1 = new Pen("orange","ball");

        ///////Without Creating Constructor////////

        //pen pen2 = new Pen(); Pen() is the constructor
        //pen2.color = "black";
        //pen2.type = "ballpoint";

        ///////////////////////////////////////////

        //Pen pen3 = new Pen() ;
        //pen3.color = "red" ;


        pen1.printColor();
   //     pen2.printColor();
     //   pen3.printColor(); 

        Student a1 = new Student();
        Student a2 = new Student();

        a1.name="abir";
        a1.id=18201167;
        a1.age=44;
 
        a2.name="ashik";
        a2.id=18301457;
        a2.age=88;

        a1.printinfo();
        a2.printinfo();

       }

}