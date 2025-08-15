import java.util.*;
import java.util.Scanner;
public class MagicalNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
//int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int[][] lib=new int[b][c];
for(int i=0;i<b;i++)
{
for(int j=0;j<c;j++)
{
lib[i][j]=sc.nextInt();
}}
System.out.println(magicalnumber(lib,b,c));
}
public static int magicalnumber(int[][] lib, int b,int c)
{
int magicalsum=0;
for(int i=0;i<b;i++)
{
int oddsum=0;
for(int j=0;j<c;j++)
{
if(lib[i][j]%2!=0)
{
oddsum+=lib[i][j];
}}
if(oddsum%2==0)
{
magicalsum++;
}
}
return magicalsum;
}
}

