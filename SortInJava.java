import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class SortInJava
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
sc.nextLine();
String[] name=new String[a];
for(int i=0;i<a;i++)
{
name[i]=sc.nextLine();
}
Arrays.sort(name);
System.out.println(Arrays.toString(name));
}
}