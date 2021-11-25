import java.util.Scanner;
public class Table{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int N=in.nextInt();
if(N>=3||N<=30){
for(int i=1;i<=10;i++){
System.out.println(N+"X "+i+"="+N*i);
}
 }
  }
}