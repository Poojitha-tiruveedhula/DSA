public class Stack
{
String[] name;
int cap;
int top;
Stack(int size)
{
cap=size;
name=new String[cap];
top=-1;
}
Stack()
{
cap=5;
name=new String[cap];
top=-1;
}
void Push(String s)
{
if(top+1>=cap)
{
System.out.println("overflow");
}
else
{
top++;
name[top]=s;
System.out.println("push success");
}
}
String Pop()
{
if(top<0)
{
System.out.println("underflow");
return null;
}
else
{
String s=name[top];
top--;
System.out.println("success pop");
return s;
}}
String Peek()
{
if(top<0)
{
System.out.println("underflow");
return null;
}
else
{
String s=name[top];
return s;
}
}
boolean isEmpty()
{
return(top<0);
}
void display()
{
for(int i=0;i<=top;i++)
System.out.println(name[i]);
}
public static void main(String[] args)
{
Stack a=new Stack();
a.Push("pooja");
a.Push("Aryan");
a.Push("myra");
String s=a.Pop();
System.out.println(s);
s=a.Peek();
System.out.println(s);
}
}

