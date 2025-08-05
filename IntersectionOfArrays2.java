import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class IntersectionOfArrays2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
int nums1[]=new int[a];
for(int i=0;i<a;i++)
{
nums1[i]=sc.nextInt();
}

int b=sc.nextInt();
int nums2[]=new int[b];
for(int i=0;i<b;i++)
{
nums2[i]=sc.nextInt();
}

int[] m=intersection(nums1,nums2);
for(int num:m)
{
System.out.print(num+" ");
}
sc.close();
}

public static int[] intersection(int[] nums1,int[] nums2)
{
Set<Integer>a=new HashSet<>();
Set<Integer>b=new HashSet<>();
for(int num:nums1)
{
a.add(num);
}
for(int num:nums2)
{
if(a.contains(num))
{
b.add(num);
}
}
int res[]=new int[b.size()];
int i=0;
for(int num:b)
{
res[i++]=num;
}
return res;
}
}
