import java.util.*;
import java.util.Scanner;
public class FindingTheIndexOfTheFirstOccurrenceInAString
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String haystack=sc.nextLine();
String needle=sc.nextLine();
System.out.println(strstr(haystack,needle));
}
public static int strstr(String haystack,String needle)
{
for(int i=0;i<haystack.length()-needle.length()+1;i++)
{
if(haystack.charAt(i)==needle.charAt(0))
{
if(haystack.substring(i,needle.length()+i).equals(needle))
{
return i;
}}


}
return -1;}}













