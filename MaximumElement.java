import java.util.*;
import java.util.Scanner;
public class MaximumElement
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
System.out.println(maxele(m));
}
public static int maxele(int m[])
{
int max=m[0];
for(int i=0; i<m.length;i++)
{
if(m[i]>max)
{
max=m[i];
}}
return max;
}
}
