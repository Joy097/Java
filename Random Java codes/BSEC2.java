public class BSEC2 extends ASEC2 {
public int x;
public int sum;
public BSEC2(int p){
super.x = p;
y = temp + p ;
sum = p + temp + 1;
--temp;
}
public BSEC2(ASEC2 b){
super.x = b.sum;
sum = b.sum;
x = b.x;
}
public void methodB(int m, int n){
int y = 0;
y += this.y;
x = this.y + 2 + temp;
super.methodB(x, y);
sum = x + y + super.sum;
System.out.println(x + " " + sum);
}
}