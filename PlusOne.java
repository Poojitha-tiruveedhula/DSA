import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class PlusOne
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int digits[]=new int[a];
for(int i=0;i<a;i++)
{
digits[i]=sc.nextInt();
}
System.out.println(Arrays.toString(plusone(digits)));
sc.close();
}
static int[] plusone(int[] digits)
{
int n=digits.length;
for(int i=n-1;i>=0;i--)
{
if(digits[i]<9)
{
digits[i]++;
return digits;
}
digits[i]=0;
}
int[] m=new int[n+1];
m[0]=1;
return m;
}}