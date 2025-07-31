import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Singlenumber
{
public static void printAllUnique(int[] nums)
{
Map<Integer,Integer> b=new HashMap<>();
for(int c:nums)
{
b.put(c,b.getOrDefault(c,0)+1);
}
for(Map.Entry<Integer,Integer>entry:b.entrySet())
{
if(entry.getValue()==1)
{
System.out.println(entry.getKey()+" ");
}}}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int[] nums=new int[m];
for(int i=0;i<m;i++)
{
nums[i]=sc.nextInt();
}
printAllUnique(nums);
sc.close();
}
}
