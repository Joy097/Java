public class ASEC2{
public static int temp = 2;
public int sum;
public int y;
public int x = 2;
public ASEC2(){
y = temp - 2 + x;
sum = temp + 3;
temp -= 2;
}
public void methodB(int m, int n){
int x = 0;
y += m + (temp++);
x += 2 + n;
sum = sum + x + y;
System.out.println(y+ " " + sum);
}
}


