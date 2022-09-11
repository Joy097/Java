public class ABC{
  int a,b,c,d;
  public ABC(){
    //  this(5,5,5);
    System.out.println("ami 1st constructor e ");
    
//    a=b=10;
//    c=20;
  }
  public ABC(int a, int b, int c){
    //  this();
    System.out.println("ami 2nd constructor e ");
    this.a=a;
    this.b=b;
    this.c=c;
    //  this();
    System.out.println("constructor e Details print kori");
    printDetail();
  }
  public ABC(int a, int b, int c, int d){
    this(a,b,c);
    this.d=d;
    System.out.println("ami 3rd constructor e ");
  }
  
  public void printDetail(){
    System.out.println("Details printing");
    System.out.println("A "+a);
    System.out.println("B "+b);
    System.out.println("C "+c);
    //  QuizDeclaration();
    
  }
  public void QuizDeclaration(){
    
    System.out.println("Yes, yes, Ajke quiz day");
    this.QuizDeclaration2();//this.QuizDeclaration2() & QuizDeclaration2() is same here
  }
  public void QuizDeclaration2(){
    System.out.println("its the day of crying");
    QuizDeclaration2(this);
  }
  public void QuizDeclaration2(ABC obj){
    
    System.out.println("parameter taking obj");
  }
   public void QuizDeclaration3(){
    System.out.println(this);
  }
  public void printA(int a){
    a=10;
    System.out.println("A's local value is "+a);
    System.out.println("A's instance value is "+this.a);
  }
  //tester class
  public static void main(String []args){
    // ABC a= new ABC();
    // a.printDetail();
//    ABC b = new ABC(40,50,60);
//    b.printA(90);
    // b.printDetail();
//    ABC c = new ABC(400,500,600);
//    c.printDetail();
    ABC d = new ABC(40,50,60,70);
    d.QuizDeclaration();
    d.QuizDeclaration3();
    System.out.println(d);
    // d.printA(90);
  }
}