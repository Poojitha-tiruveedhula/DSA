import java.util.*;
import java.util.Scanner;
public class PrefixOfAWordInSentence
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String sentence=sc.nextLine();
String searchword=sc.nextLine();
System.out.println(checkPrefix(sentence,searchword));
}
public static int checkPrefix(String sentence,String searchword)
{
String[] sentences=sentence.split(" ");
for(int i=0;i<sentences.length;i++)
{
if(sentences[i].startsWith(searchword))
{
 return i+1;
}
}
return -1;
}
}
