import java.util.*;
import java.util.Scanner;
public class PrefixOfWordInSentence
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String sentence=sc.nextLine();
String wordsearch=sc.nextLine();
System.out.println(checkPrefix(sentence,woordsearch));
}
public static int checkPrefix(String sentence,String wordsearch)
{
for(int i=0;i<sentence.length;i++)
{
if(sentence[i].startsWith(wordsearch))
{
i+1;
}
else
{
return -1;
}
}
}
