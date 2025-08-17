import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
public class SortNumbers
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] m=new int[a];
for(int i=0;i<a;i++)
{
m[i]=sc.nextInt();
}
Arrays.sort(m);
System.out.println(Arrays.toString(m));
}
}