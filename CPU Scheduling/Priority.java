import java.util.Arrays;
import java.util.Scanner;

public class task2_priority {
    public static void main(String[] args) {
//Shihab Rumee Chowdhury ID - 18201064

        System.out.print("enter number of process: ");
        Scanner sc = new Scanner(System.in);
        int pro = sc.nextInt();
        String p1[] = new String[pro];

        int p = 1;
        for (int i = 0; i < pro; i++) {
            p1[i] = "P" + p;
            p++;
        }
        System.out.println(Arrays.toString(p1));
        System.out.print("Enter Burst Time for  process: " + pro );
        int br_t[] = new int[pro];
        for (int i = 0; i < pro; i++) {
            br_t[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(br_t));
        System.out.print("Enter Priority for process: " + pro );
        int prt[] = new int[pro];
        for (int i = 0; i < pro; i++) {
            prt[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(prt));
int x;
String z;
for (int i = 0; i < pro - 1; i++) {
      for (int j = 0; j < pro - 1; j++) {
            if (prt[j] > prt[j + 1]) {
                   x = prt[j];
                    prt[j] = prt[j + 1];
                    prt[j + 1] = x;
                    x = br_t[j];
                    br_t[j] = br_t[j + 1];
                    br_t[j + 1] = x;
                    z = p1[j];
                    p1[j] = p1[j + 1];
                    p1[j + 1] = z;

                }}}

        int tr_t[] = new int[pro + 1];
        int wt_t[] = new int[pro + 1];

        for (int i = 0; i < pro; i++) 
        {
            tr_t[i] = br_t[i] + wt_t[i];
            wt_t[i + 1] = tr_t[i];
        }

        int total_wt_t = 0;
        int total_tr_t = 0;
        double av_wt_t;
        double avg_ta_t;
        for (int i = 0; i < pro; i++) {
            System.out.println("Process "+p1[i] + " Burst Time : " + br_t[i] + " Waiting Time : " + wt_t[i] + " Turn-around Time : " + (tr_t[i]));
            total_tr_t += (wt_t[i] + br_t[i]);
            total_wt_t += wt_t[i];
        }
        av_wt_t = total_wt_t / (double) pro;
        avg_ta_t = total_tr_t / (double) pro;

        System.out.println("\n Average Wating Time : " + av_wt_t);
        System.out.println("\n Average Turn-around Time : " + avg_ta_t);
    }
}