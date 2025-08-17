import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicatesFromList
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
java.util.List<Integer> list=new ArrayList<>();
for(int i=0;i<a;i++)
{
list.add(sc.nextInt());
}
java.util.Set <Integer>set=new java.util.LinkedHashSet<>(list);

for(int m:set)
{
System.out.print(m+" ");
}}
}
