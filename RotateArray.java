import java.util.*;
public class RotateArray
{
public void rotate(int[] nums,int k)
{
int n=nums.length;
k %= n;
reverse(nums, 0, n-1);
reverse(nums, 0, k-1);
reverse(nums, k, n-1);
}
private void reverse(int[] nums,int start,int end)
{
while(start<end)
{
int temp=nums[start];
nums[start]=nums[end];
nums[end]= temp;
start++;
end--;
}
}
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
RotateArray r=new RotateArray();
r.rotate(nums,k);
for(int m:nums)
{
System.out.print(m+" ");
}
sc.close();
}
}
























