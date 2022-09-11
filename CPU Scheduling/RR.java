package lab.pkg4;

import java.util.Scanner;

public class task3_RR{

//Shihab Rumee Chowdhury ID -18201064

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Number of Process : ");
        int n = sc.nextInt();
        int[] pd = new int[n];
        int[] br_t = new int[n];
        
        System.out.println("Give Time Quantum : ");
        int qnt = sc.nextInt();
        
        for(int i=0; i<n;i++){
            System.out.println("Give Burst time of process no. "+ (i+1));
            pd[i] = i+1;
            br_t[i] = sc.nextInt();
        }
        time(pd,n,br_t,qnt);
    }

    
    static void WaitingTime(int[] p, int n, int[] br_t, int[] w_t, int q) 
    
    {
        int[] r_bt = new int[n];
        for(int i = 0; i<n; i++){
            r_bt[i] = br_t[i];
        }
        int t = 0;
        while(true){
            boolean c = true;
            
            for(int i = 0; i<n; i++){
                if(r_bt[i]>0){
                    c = false;
                    if(r_bt[i]>q ){
                        t+=q;
                        r_bt[i] -= q;
                    }
                    else{
                        t=t+ r_bt[i];
                        w_t[i] = t-br_t[i];
                        r_bt[i] = 0;
                     }}}
            
             if(c == true){
                break;
            }}}

    static void Turn_around_time(int[] p, int n, int[] br_t, int[] w_t, int[] tr_t) {
        for(int i=0; i<n; i++){
            tr_t[i] = br_t[i] + w_t[i];
        }
    }
    
    

    static void time(int[] process, int n, int[] br_t, int qnt) {
        int w_t[] = new int[n];
        int tr_t[] = new int[n];
        
        Waiting_time(process, n, br_t, w_t, qnt);
        Turn_around_time(process, n, br_t, w_t, tr_t);
        double total_tr_t = 0, total_w_t=0;
        
        for(int i=0; i<n; i++){
            total_tr_t+=tr_t[i];
            total_w_t+=w_t[i];
            System.out.println("Processes : "+ (i+1) +"   Completion time : "+ tr_t[i] +"   Turnaround time : "+ tr_t[i] +"   Waiting time : "+w_t[i]);
        }
        System.out.println("Average turn-around time="+((float)total_tr_t/(float)n));
        System.out.println("Average waiting time="+((float)total_w_t/(float)n));
    }
}