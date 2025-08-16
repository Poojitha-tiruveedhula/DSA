import java.util.*;
import java.util.Scanner;
public class GreatestNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println(greatestnum(a,b,c));
}
public static int greatestnum(int a,int b,int c)
{
int m=(a>b)?(a>c?a:c):(a>b?a:b);
return m;
}
}
