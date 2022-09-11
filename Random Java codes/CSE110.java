public class CSE110 {
    
    public static void main(String args[]) {
        
        int[] imagine=new int[6];
        int dragons=1, sum=0;
        
        while(dragons<imagine.length){
            
            int y=imagine[imagine[dragons]];
            System.out.println("y:"+y);
            sum+=2*y;
            
            System.out.println("sum: "+sum);
            
            while(y<dragons){
                if(y%2==0)
                    imagine[y++] = 2*imagine[y]+ 1;
                else
                    imagine[y++] = 3*imagine[y-1]+ 2;
                    
                System.out.println(imagine[y-1]);
            }
            
            ++dragons;
        }
        
        
    }
}
