import java.util.*;
import java.io.*;
class Datatypes{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
try
{
long x=sc.nextLong();{
System.out.println(x+" can be fitted in:");
if(x>=-128 && x<=127)System.out.println("* byte");
System.out.println("* byte");
if(x>=-2147483648 && x<=2147483647)
System.out.println("*int");
if(x>=-32768 && x<=3278)
System.out.println("* short");
}
System.out.println("* long");
}
catch(Exception e)
{
System.out.println(sc.next()+"can't be fitted anywhere.");
}
}
}
}