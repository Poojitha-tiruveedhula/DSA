import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Sorting
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<a.length;i++)
a[i]+=sc.nextInt();
Arrays.sort(a);
System.out.println(Arrays.toString(a));
}
}

