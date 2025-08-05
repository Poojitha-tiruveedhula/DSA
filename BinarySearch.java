import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] nums=new int[a];
for(int i=0;i<a;i++)
{
nums[i]=sc.nextInt();
}
int target=sc.nextInt();
int result=search(nums,target);
System.out.println(result);
}

public static int search(int[] nums,int target)
{
int n=Arrays.binarySearch(nums,target);
if(n>=0)
{
return n;
}
else
{
return -1;
}
}}