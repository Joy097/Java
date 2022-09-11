class student {

    String name;
    int id;


    student(String n, int i){
        this.name = n;
        this.id = i;
    }

    student(student s2){   //copying parameters

        this.name=s2.name;
        this.id=s2.id; 

    }


    student(){

    }

    public void print(){
        System.out.println(this.name+" - "+this.id);
    }
    
}

public class oops2{
public static void main (String args[]){


student s1 = new student("Robi",45); //parameter object

student s2 = new student(s1); //copy object

student s3 = new student(); // basic object
s3.name = "akash";
s3.id = 18889775;


s1.print();
s2.print();
s3.print();

}
}
