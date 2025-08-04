import java.util.Scanner;
import java.util.*;
class TreeNode
{
int val;
TreeNode left,right;
TreeNode(int val)
{
this.val=val;
}}
public class ConvertArrayToBST
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int nums[] =new int[n];
for(int i=0;i<n;i++)
{
nums[i]=sc.nextInt();
}
ConvertArrayToBST d=new ConvertArrayToBST();
TreeNode root=d.sortedArrayToBST(nums);
//d.printLevelOrder(root);
System.out.println(Arrays.toString(nums));
}
public TreeNode sortedArrayToBST(int[] nums)
{
return insert(nums,0,nums.length);
}
TreeNode insert(int[] nums, int start,int end){
if(start==end)
return null;
int mid=(start+end)/2;
TreeNode node=new TreeNode(nums[mid]);
node.left=insert(nums,start,mid);
node.right=insert(nums,mid+1,end);
return node;
}
}