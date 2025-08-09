import java.util.*;
import java.util.Scanner;
public class PowerOfTwo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
System.out.println(IsPowerOfTwo(s));
}
public static boolean IsPowerOfTwo(int s)
{
if(s==0)
{
return false;
}
while(s!=1)
{
if(s%2!=0)
{
return false;
}
else
{
s=s/2;
}}
return true;
}
}