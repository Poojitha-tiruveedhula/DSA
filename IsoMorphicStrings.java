import java.util.*;
import java.util.Scanner;
public class IsoMorphicStrings
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String t=sc.nextLine();
System.out.println(Isomorphic(s,t));
}
public static Boolean Isomorphic(String s,String t)
{
HashMap<Character,Character>hm=new HashMap<Character,Character>();
for(int i=0;i<s.length();i++)
{
if(hm.containsKey(s.charAt(i)))
{
if(!hm.get(s.charAt(i)).equals(t.charAt(i)))
{
return false;
}
}
else
{
if(hm.containsValue(t.charAt(i)))
{
return false;
}
hm.put(s.charAt(i),t.charAt(i));
}
}
return true;
}
}