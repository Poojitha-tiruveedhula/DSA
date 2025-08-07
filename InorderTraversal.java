import java.util.*;
import java.util.Stack;
import java.util.Scanner;
class TreeNode
{
int val;
TreeNode left,right;
TreeNode(int val)
{
this.val=val;
}}

public class InorderTraversal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int root=sc.nextInt();
int left=sc.nextInt();
int right=sc.nextInt();
TreeNode roots=new TreeNode(root);
if(left!=-1)
roots.left=new TreeNode(left);
if(right!=-1)
roots.right=new TreeNode(right);
List<Integer> result=inorderTraversal(roots);
for(int val:result)
{
System.out.print(val+" ");
}
}


public static List<Integer> inorderTraversal(TreeNode root)
{
List<Integer>list=new ArrayList<Integer>();
Stack<TreeNode>stack=new Stack<TreeNode>();
TreeNode a=root;
while(a!=null || !stack.empty())
{
while(a!=null)
{
stack.push(a);
a=a.left;
}
a=stack.pop();
list.add(a.val);
a=a.right;
}
return list;
}
}

