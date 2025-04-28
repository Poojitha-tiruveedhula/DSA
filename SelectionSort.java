import java.util.Scanner;
public class Selectionsort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0;i<n;i++)
for(int j=i+1;j<n;j++)
if(arr[j]<arr[i])
{
int c=arr[i];
arr[i]=arr[j];
arr[j]= c;
}
for(int m:arr)
System.out.print(m+" ");
sc.close();
}}

