import java.util.*;
import java.util.Scanner;
public class MoveZeros
{
public static void moveZeros(int[] nums)
{
int count=0;
for(int i=0;i<nums.length;i++)
{
if(nums[i]!=0)
{
nums[count++]=nums[i];
}
}
while(count<nums.length)
{
nums[count++]=0;
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] nums=new int[a];
for(int i=0;i<a;i++)
{
nums[i]=sc.nextInt();
}
MoveZeros m=new MoveZeros();
m.moveZeros(nums);
for(int b:nums)
{
System.out.print(b+" ");
}
}
}