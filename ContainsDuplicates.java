import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ContainsDuplicates
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int nums[]=new int[m];
for(int i=0;i<m;i++)
{
nums[i]=sc.nextInt();
}
System.out.println(containsDuplicate(nums));
}

public static boolean containsDuplicate(int[] nums)
{
Map<Integer,Integer> a=new HashMap<Integer,Integer>();
for(int i=0;i<nums.length;i++)
if(a.containsKey(nums[i]))
{
return true;
}
else
{
a.put(nums[i],i);
}
return false;
}}



