import java.util.*;
import java.io.*;

public class lab_6 {
    public static void main(String[] args) throws Exception {
          BufferedReader z=new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        int row=Integer.parseInt(z.readLine());
        int column=Integer.parseInt(z.readLine());
        String []process=new String [row];
        int [][]max=new int [row][column];
        int [][]alllocation=new int [row][column];
        int [][]need=new int [row][column];
        int [][]available=new int [row+1][column];
        LinkedList<Integer> track=new LinkedList<Integer>();

        String s3 = z.readLine();
        StringTokenizer st3=new StringTokenizer(s3, " ");
        int n=0;
        while(st3.hasMoreTokens()) {

            process[n]=st3.nextToken();
            n++;
        }

        for(int i = 0; i < row; i++) {
            String s=z.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            for(int j = 0; j<column; j++) {
                max[i][j] = Integer.parseInt(st.nextToken());

            }}
        for (int i=0; i < row; i++) {
            String s = z.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            for(int j = 0; j< column; j++) {
                alllocation[i][j] = Integer.parseInt(st.nextToken());
                need[i][j] = max[i][j] - alllocation[i][j];
            }
        }
        System.out.println("Need Matrix:");
        for(int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j< column; j++) {
                System.out.print(need[i][j]+ " ");
            }
        }
        System.out.println();
        String s = z.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int cnt = 0;
        while(st.hasMoreTokens()) {
            available[0][cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }
        cnt = 0;
        for(int i =0;;i++) {
            i = i % row;
            boolean fl = true;
            for (int j = 0 ; j < column; j++) {
                if (need[i][j] <= available[cnt][j]) {

                }
                else {
                    fl = false;
                    break;
                }
                if(fl && j == (column-1) && !track.contains(i)) {
                    for(int k =0; k < column; k++) {
                        available[cnt+1][k] = available[cnt][k] + alllocation[i][k];

                    }
                    track.addLast(i);
                    cnt++;
                }
            }
            if(track.size() == row) {
                break;
            }
        }
        System.out.println("\nSafe Sequence:");
        for(int i = 0; i < track.size(); i++) {
            System.out.print(process[track.get(i)]+" ");
        }
        System.out.println();
        System.out.println("\nChange in available resource matrix : ");
        for(int i = 1; i < available.length; i++ ) {
            System.out.println();
            for(int j = 0; j < column; j++) {
                System.out.print(available[i][j]+" ");
            }
        }
        System.out.println();
    }
}