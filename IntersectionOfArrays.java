import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class IntersectionOfArrays
{
public static int[] intersect(int[] num1,int[] num2)
{
int a[]=new int[1001];
for(int b:num1)
{
a[b]++;
}
ArrayList <Integer>list=new ArrayList<>();
for(int c:num2)
{
if(a[c]>0)
{
list.add(c);
a[c]--;
}
}
int m=list.size();
int res[]=new int[m];
for(int i=0;i<m;i++)
{
res[i]=list.get(i);
}
return res;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int num1[]=new int[n1];
for(int i=0;i<n1;i++)
{
num1[i]=sc.nextInt();
}
int n2=sc.nextInt();
int num2[]=new int[n1];
for(int i=0;i<n2;i++)
{
num2[i]=sc.nextInt();
}
int[] o=intersect(num1,num2);
for(int p:o)
{
System.out.print(p+" ");
}
sc.close();
}
















}