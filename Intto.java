import java.util.*;
import java.io.*;
class Intto
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
String s=Integer.toString(n);
if(n>=-100 && n<=100)
{
if(s.equals(Integer.toString(n)))
{
System.out.println("Good Job!");
}
}
else
System.out.println("Wrong Answer!");
}
}
