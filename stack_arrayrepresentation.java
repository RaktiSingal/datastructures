package datastructures;
import java.util.*;
public class stack_arrayrepresentation {
      static int size,top;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter maximum size::");
    	size=sc.nextInt();
    	int a[]=new int[size];
    	System.out.println("Enter no of elements you want to insert");
    	top=sc.nextInt();
    	System.out.println("Enter elements:");
    	for(int i=1;i<=top;i++)
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
        		System.out.println("Enter element to insert::");
        		int item=sc.nextInt();
        		if(top==size)
        			System.out.println("Full");
        		else
        			{
        			push(item,a);
        			System.out.println("Item pushed");
        			}
        	}
        	else if(c==2)
        	{
        		if(top==0)
        			System.out.println("Cannot delete , stack empty");
        		else
        		{
        			pop(a);
        		}
        	}
        	else
        		System.out.println("Wrong option selected");
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
	public static void push(int item,int a[])
	{
		a[top+1]=item;
		top++;
	}
	public static void pop(int a[])
	{
		int temp=a[top];
		System.out.println("Item "+temp+" deleted");
		top--;
	}
     public static void display(int a[])
     {
    	for(int i=1;i<=top;i++)
    		System.out.println(a[i]+" ");
     }
}
