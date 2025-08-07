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

public class PreorderTraversal
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
List<Integer> result=preorderTraversal(roots);
for(int val:result)
{
System.out.print(val+" ");
}
}


public static List<Integer> preorderTraversal(TreeNode root)
{
List<Integer>list=new ArrayList<Integer>();
if(root==null)
return list;
Stack<TreeNode>stack=new Stack<>();
stack.push(root);

while(!stack.empty())
{
TreeNode node=stack.pop();
list.add(node.val);
if(node.right!=null)
stack.push(node.right);
if(node.left!=null)
stack.push(node.left);
}
return list;
}
}

