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

public class PostorderTraversal
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
List<Integer> result=postorderTraversal(roots);
for(int val:result)
{
System.out.print(val+" ");
}
}


public static List<Integer> postorderTraversal(TreeNode root)
{
List<Integer>list=new ArrayList<Integer>();
if(root==null)
return list;
Stack<TreeNode>stack1=new Stack<>();
Stack<TreeNode>stack2=new Stack<>();
stack1.push(root);

while(!stack1.empty())
{
TreeNode node=stack1.pop();
stack2.push(node);

if(node.left!=null)
stack1.push(node.left);
if(node.right!=null)
stack1.push(node.right);

}
while(!stack2.empty())
{
list.add(stack2.pop().val);
}
return list;
}
}

