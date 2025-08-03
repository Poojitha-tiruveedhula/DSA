import java.util.Scanner;
import java.util.*;
public class LongestCommonPrefix
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
String str[]=new String[n];
for(int i=0;i<n;i++)
{
str[i]=sc.nextLine();
}
System.out.println(longestCommonPrefix(str));
}
public static String longestCommonPrefix(String str[])
{
Arrays.sort(str);
String a=str[0];
String b=str[str.length-1];
int index=0;
while(index<a.length())
{
if(a.charAt(index)==b.charAt(index))
{
index++;
}
else
{
break;
}}
return index==0?"":a.substring(0,index);
}
}

