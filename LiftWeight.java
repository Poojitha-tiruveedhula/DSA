import java.util.*;
import java.util.Scanner;
public class LiftWeight
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(MaxWeight(a));
}
public static Boolean MaxWeight(int[] a)
{
int cap=300;
int b=0;
for(int i=0;i<a.length;i++)
{
b=b+a[i];
}
if(b>cap)
{
return false;
}
 return true;
}}