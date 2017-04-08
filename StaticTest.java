// Demonstrate static variables, methods, and blocks.
class StaticTest {
static int a=3;
static int b=1;
static void meth(int x) {
System.out.println("x = " + x);
System.out.println("a = " + a);
System.out.println("b = " + b);
a++;
b++;
}
static {
System.out.println("Static block initialized.");
b = a * 4;
}
public static void main(String args[]) {
meth(42);
meth(43);
meth(45);
}
}