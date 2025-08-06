import java.util.*;
import java.util.Scanner;
public class GreatestCharacterThanTarget
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
char[] letters =new char[a];
for(int i=0;i<a;i++)
{
letters[i]=sc.next().charAt(0);
}
char target=sc.next().charAt(0);
System.out.println(nextGreatestLetter(letters,target));
}
public static char nextGreatestLetter(char[] letters,char target)
{
for(char a:letters)
{
if(a>target)
{
return a;
}}
return letters[0];

}}