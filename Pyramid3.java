import java.util.*;
import java.io.*;
public class Pyramid3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.close();
printpattern(n);
}
public static void printpattern(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
if(j==1||j==i||i==n)
System.out.print(j);
else
System.out.print(" ");
}
System.out.println();
}
}
}