import java.util.*;
import java.util.Scanner;
public class ValidParenthesisString
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(checkValidString(s));
}
public static boolean checkValidString(String s)
{
int low=0;
int high=0;
for(int i=0;i<s.length();i++)
if(s.charAt(i)=='(')
{
low++;
high++;
}
else if(s.charAt(i)==')')
{
if(low>0)
{
low--;
}
high--;
}
else
{
if(low>0)
{
low--;
}
high++;
}
if(high>0)
{
return false;
}return low==0;
}
}