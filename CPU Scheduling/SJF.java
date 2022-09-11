import java.util.*; 
public class task1_sjf {

    //Shihab Rumee Chowdhury ID - 18201064
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter total no of process:");
        int n = sc.nextInt();
        int pid[] = new int[n];
        int arv_time[] = new int[n]; 
        int burst_time[] = new int[n]; 
        int comp_time[] = new int[n]; 
        int turnar_time[] = new int[n]; 
        int wait_time[] = new int[n];  
        int f[] = new int[n];  
        int st=0, tot=0;
        float av_wt=0, av_tt=0;

        for(int i=0;i<n;i++){
            ////////////////////////

        System.out.println ("enter process no " + (i+1) + "'s arrival time:");
        arv_time[i] = sc.nextInt();
        System.out.println ("enter process no " + (i+1) + "'s burst time:");
        burst_time[i] = sc.nextInt();
        pid[i] = i+1;
        f[i] = 0;
    }
    boolean a = true;
    while(true){
        int c=n, min=999;
        if (tot == n) 
    break;
    for (int i=0; i<n; i++){
        ///////////////////////////
    if ((arv_time[i] <= st) && (f[i] == 0) && (burst_time[i] < min)){
    min=burst_time[i];
    c=i;
    }
    }
    if (c==n)
    st++;
    else{
        ///////////////////////////////
    comp_time[c]=st+burst_time[c];
    st+=burst_time[c];
    turnar_time[c]=comp_time[c]-arv_time[c];
    wait_time[c]=turnar_time[c]-burst_time[c];
    f[c]=1;
    tot++;
    }
    }
    System.out.println("\n pid  arrival burst complete turn waiting");
    for(int i=0;i<n;i++){

    av_wt+= wait_time[i];
    av_tt+= turnar_time[i];
    System.out.println( pid[i]+"\n arival time : "+arv_time[i]+"\n burst time : "+burst_time[i]+"\n completion time : "+comp_time[i]+"\n turn-around time : "+turnar_time[i]+"\n waiting time : "+wait_time[i]);
    
    }

    System.out.println ("\n Average turn-around time : "+ (float)(av_tt/n));
    System.out.println ("\n Average waiting time : "+ (float)(av_wt/n));
    sc.close();
    }
    }