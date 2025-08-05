import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
public class ContainsDuplicates2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] nums=new int[n];
for(int i=0;i<n;i++)
{
nums[i]=sc.nextInt();
}
int k=sc.nextInt();
System.out.println(containsDuplicate(nums,k));
}
public static boolean containsDuplicate(int[] nums,int k)
{
Map<Integer,Integer>a=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
if(!a.containsKey(nums[i]))
{
a.put(nums[i],i);
}
else
{
int pastIndex=a.get(nums[i]);
if(Math.abs(pastIndex-i)<=k)
{
return true;
}
else
{
a.put(nums[i],i);
}
}
}
return false;
}
}