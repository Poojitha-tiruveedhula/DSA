import java.util.*;
import java.util.Scanner;
public class CountingEvenOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
int even=0;
int odd=0;
for(int c:b)
{
if(c%2==0)
{
even++;
}
else
{
odd++;
}
}
System.out.println(even);
System.out.println(odd);
}
}