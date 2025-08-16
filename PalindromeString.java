import java.util.*;
import java.util.Scanner;
public class PalindromeString
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
System.out.println(reversestring(a));
}
public static boolean reversestring(String a)
{
String reverse="";
for(int i=a.length()-1;i>=0;i--)
{
reverse=reverse+a.charAt(i);
}
return a.equals(reverse);

}
}