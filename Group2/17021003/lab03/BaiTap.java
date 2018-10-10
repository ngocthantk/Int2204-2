public class BaiTap {
//1//

public int USCLN(int a, int b) {
a = Math.abs(a);
b = Math.abs(b);
while (a != b) {
if (a > b) {
a = a - b;
} else {
b = b - a;
}

}
return a;

}

public int Fibonacci(int n) {
int f0 = 0;
int f1 = 1;
int fn = 1;

if (n < 0) {
return -1;
} else if (n == 0 || n == 1) {
return n;
} else {
for (int i = 2; i < n; i++) {
f0 = f1;
f1 = fn;
fn = f0 + f1;
}
}
return fn;

}

public static void main(String[] args) {
BaiTap s = new BaiTap();
System.out.println(s.USCLN(9, 6));
System.out.println(s.Fibonacci(6));
}

}