import java.util.*;
import java.io.*;
class Series{
public static void main(String[] args){
    double temp;
Scanner in = new Scanner (System.in);
int t=in.nextInt();
for(int i=0;i<t;i++){
    temp=0.0;
int a = in.nextInt();
int b = in.nextInt();
int n = in.nextInt();
  for (int j=0;j<n;j++)
  {
      temp=temp+(Math.pow(2,j)*b);
      System.out.print(a+(int)temp+" ");

  }
  System.out.println();
}
in.close();
}
}