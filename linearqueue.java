package datastructures;
import java.util.*;
public class linearqueue {
static int front=1,rear,n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter maximum size::");
n=sc.nextInt();
int a[]=new int[n+1];
System.out.println("Enter no of elements you want to insert");
rear=sc.nextInt();
if(n<rear)
{
	System.out.println("Size is less please enter right values");
	return;
}
System.out.println("Enter elements:");
for(int i=1;i<=rear;i++)
	a[i]=sc.nextInt();
while(true)
{
	
	
	System.out.println("Select action to perform::");
	System.out.println(" 1. Insert/push");
	System.out.println(" 2. Pop/Delete");
	System.out.println("Enter choice:");
	int c=sc.nextInt();
	if(c==1)
	{
		if(rear==n)
		{
			System.out.println("Queue is already full cannot insert");
			
		}
		else
		{
			System.out.println("Enter item to insert");
			int item=sc.nextInt();
			insert(item,a);
		}
	}
	if(c==2)
	{
		if(front==0)
		{
			System.out.println("Cannot delete , empty queue");
		}
		else
		{
			delete(a);
		}
	}
	
	System.out.println("To display select 1");
	int d=sc.nextInt();
	if(d==1)
		display(a);
	System.out.println("Do want to continue Press 1 to continue and 0 to end");
	int ch=sc.nextInt();
	if(ch==0)
		return;
	else
		continue;
	}
	}
	public static void insert(int item,int a[])
	{
		     rear++;
			a[rear]=item;
	}
	public static void delete(int a[])
	{
		int item;
		if(rear==front)
		{
			item=a[front];
			rear=0;
			front=0;
			System.out.println("Deleted "+item);
		}
		else
		{
			item=a[front];
			front++;
			System.out.println("Deleted "+item);
		}
		
	}
	public static void display(int a[])
	{
		for(int i=front;i<=rear;i++)
			System.out.println(a[i]);
	}

}
