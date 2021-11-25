import java.util.Scanner;
class Solution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("=====================");
for(int i=0;i<3;i++)
{
String s=sc.next();
int x=sc.nextInt();
System.out.println(""+s+"     "+x+"");
}
System.out.println("=====================");
}
}

output:
--------
Microsoft Windows [Version 10.0.19041.1348]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Indira\Desktop\work\java\javafile>javac Solution.java

C:\Users\Indira\Desktop\work\java\javafile>java Solution
=====================
java 100 cpp 65 python 50
java     100
cpp     65
python     50
=====================

