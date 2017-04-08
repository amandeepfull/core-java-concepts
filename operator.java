import java.io.*;
import java.util.*;
class abc
{
public static int add(int a)
{
return a++;
}

public static void main(String agr[])
{
int a=5;
a=add(a++);
System.out.println(a);
}
}