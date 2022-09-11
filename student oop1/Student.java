public class Student{
  String name;
  String adress;
  String ID;
  double cgpa;

    public Student (String name, String adress, String ID, double cgpa) {
      this.name = name;
      this.adress = adress;
      this.ID = ID;
      this.cgpa = cgpa;
    }
      
      public String getName() {
        return name;
      
      }
        public void setName(String name) {
        this.name = name;
    }
          public String getAdress() {
        return adress;
    }
       public void setAdress(String adress) {
        this.adress = adress;
    }
        public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
      public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

     public void showInfo(){
          
        System.out.println(getName());
          System.out.println(getAdress());    
        System.out.println(getCGPA());    
        System.out.println(getID());
    
  }
}