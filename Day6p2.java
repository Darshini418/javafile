import java.util.*;
import java.io.*;
public class Day6p2{
public static void main(String[] args){
int n,i,j;
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
if(j==1||i==n)
{
System.out.print(" ");
}
}
for(j=1;j<i;j++)
{
if(j==i-1&&j<n-1)
{
System.out.print(j+1);
}
else
{
System.out.print(" ");
}
}
System.out.print("\n");
}
}
}