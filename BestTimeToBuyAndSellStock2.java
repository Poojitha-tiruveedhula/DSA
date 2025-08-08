import java.util.*;
import java.util.Scanner;
public class BestTimeToBuyAndSellStock2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[] prices=new int[a];
for(int i=0;i<a;i++)
{
prices[i]=sc.nextInt();}
System.out.println(maxProfit(prices));
}
public static int maxProfit(int[] prices)
{
int max_profit=0;
for(int i=0;i<prices.length-1;i++)
{
if(prices[i]<prices[i+1])
{
max_profit+=prices[i+1]-prices[i];
}}
return max_profit;
}}
