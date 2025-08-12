import java.util.*;
import java.util.Scanner;
public class FindWordsContainingCharacters
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String words[]=sc.nextLine().split(" ");
char x=sc.next().charAt(0);
System.out.println(findWordsContaining(words,x));
}
public static List<Integer> findWordsContaining(String[] words,char x)
{
ArrayList<Integer>result=new ArrayList<>();
for(int i=0;i<words.length;i++)
{
if(words[i].contains(String.valueOf(x)))
{
result.add(i);
}
}
return result;
}
}