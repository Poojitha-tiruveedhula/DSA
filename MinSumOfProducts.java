import java.util.*;
import java.util.Scanner;
public class MinSumOfProducts
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] b=new int[a];

int[] d=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
d[i]=sc.nextInt();
}
System.out.println(minproduct(b,d));
}
public static int minproduct(int[] b,int[] d)
{
Arrays.sort(b);
Arrays.sort(d);
for(int i=0;i<d.length/2;i++)
{
int temp=d[i];
d[i]=d[d.length-1-i];
d[d.length-1-i]=temp;
}
int sum=0;
for(int i=0;i<b.length;i++)
{
sum+=b[i]*d[i];
}
return sum;
}
}



