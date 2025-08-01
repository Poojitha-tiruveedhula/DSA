import java.util.Scanner;
public class TwoSum
{
public int[] twosum(int[] arr,int target)
{
int n=arr.length;
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]+arr[j]==target)
{
return new int[]{i,j};
}
}}
return new int[]{};
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
{
 arr[i]=sc.nextInt();
}
int target=sc.nextInt();
TwoSum m=new TwoSum();
int[] res=m.twosum(arr,target);

if(res.length==2)
{
System.out.println(res[0]+" " +res[1]);
}
else
{
System.out.println("no numbers will be added to target");
}
sc.close();
}






} 