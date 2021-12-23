import java.util.*;
import java.io.*;
public class Diamond{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.print("Enter number of rows:");
int rows = scan.nextInt();
int i, j;
for(i=0; i<rows; i++){
for(j=rows-i; j>1; j--){
System.out.print(" ");
}
for(j=0; j<=i; j++){
System.out.print("* ");
}System.out.println();
}
for(i=0;i<rows;i++){
for(j=0;j<i;j++){
System.out.print(" ");
}
for(int k=0;k<rows-i;k++){
System.out.print("*"+" ");
}System.out.println();
}
}
}