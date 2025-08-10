import java.util.*;
import java.util.Scanner;
public class ReverseInteger
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println(reverse(a));
}
public static int reverse(int a)
{
int rev=0;
while(a!=0)
{
int digit=a%10;
if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
{
return 0;
}
rev=(rev*10)+digit;
a=a/10;

}
return rev;
}
}