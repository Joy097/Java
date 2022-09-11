class Puzzle{
    int x;
    void methodA(){
        int z;
        x=5; 
        z=x+methodB(x);
        System.out.println(x+" "+z);
        z=methodB(z+2)+x;
        System.out.println(x+" "+z);
        methodB(x,z);
        System.out.println(x+" "+z);
    }
    int methodB(int y){
       
        return x+3;
    
        System.out.println(z+" "+x);
    }
}