import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearching
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int m[]=new int[a];
for(int i=0;i<a;i++)
{
m[i]=sc.nextInt();
}
int key=sc.nextInt();
int res=binarysearch(m,key);
if(res>=0)
{
System.out.println(res);
}
else
{
System.out.println("no");
}
}
public static int binarysearch(int[] m,int key)
{
Arrays.sort(m);
return Arrays.binarySearch(m,key);
}
}


