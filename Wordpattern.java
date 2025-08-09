import java.util.*;
import java.util.Scanner;
public class Wordpattern
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String pattern=sc.nextLine();
String s=sc.nextLine();
System.out.println(wordPattern(pattern,s));
}
public static boolean wordPattern(String pattern,String s)
{
String[] arr=s.split(" ");
if(pattern.length()!=arr.length)
{
return false;
}
HashMap<Character,String> hm=new HashMap<Character,String>();
for(int i=0;i<pattern.length();i++)
{
char ch=pattern.charAt(i);
Boolean containsKey=hm.containsKey(ch);
if(hm.containsValue(arr[i]) && !containsKey)
{
return false;
}
if(containsKey && !hm.get(ch).equals(arr[i]))
{
return false;
}
else
{
hm.put(ch,arr[i]);
}
}
return true;
}
}















