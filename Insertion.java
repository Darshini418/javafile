import java.util.*;
import java.io.*;
public class Insertion{
public static void insertionSort(int array[]){
int n = array.length;
for(int j=1;j<n;j++){
int key = array[j];
int i = j-1;
while((i>-1) && (array[i]>key)){
array[i+1] = array[i];
i--;
}
array[i+1] = key;
}
}
public static void main(String[] args){
int[] arr1={78,89,27,47,28,56,43,56};
System.out.println("Before InsertionSort");
for(int i:arr1){
System.out.print(i+" ");
}
System.out.println();
insertionSort(arr1);
System.out.println("Ater InsertionSort");
for(int i:arr1){
System.out.print(i+" ");
}
}
}