import java.util.*;
import java.util.Scanner;
public class RemoveDuplicates
{
public int removeDuplicates(int[] num)
{
if(num.length==0)
return 0;
int count=1;
for(int i=1;i<num.length;i++)
{
if(i<num.length-1 && num[i]==num[i+1])
{
continue;
}
else
{
num[count]=num[i];
count++;
}
}
return count;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] num=new int[n];
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
}
Arrays.sort(num);
RemoveDuplicates d =new RemoveDuplicates();
int m=d.removeDuplicates(num);
System.out.println(m);
for(int i=0;i<m;i++)
{
System.out.print(num[i]+" ");
}
sc.close();
}}







