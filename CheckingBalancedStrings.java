import java.util.*;
import java.util.Scanner;
public class CheckingBalancedStrings
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String nums=sc.nextLine();
System.out.println(isBalanced(nums));
}
public static Boolean isBalanced(String nums)
{
int evensum=0;
int oddsum=0;
for(int i=0;i<nums.length();i++)
{
if(i%2==0)
{
evensum+=nums.charAt(i)-'0';
}
else
{
oddsum+=nums.charAt(i)-'0';
}}
return oddsum==evensum;
}}