package datastructures;

import java.util.*;
class node
{
	int info;
	node link;
}
public class linkedlist {
	
	static node start=null;
	static node temp=null;
	 /*node createnode(int i)
	 {
		 node newnode=null;
		 newnode=new node();
		 newnode.info=i;
		 newnode.link=null;
		 return newnode;
	 }*/
	 
	 static void insert(int i)
	 {
		 node newnode=new node();
		 newnode.info=i;
		 newnode.link=null;
		 if(start==null)
		 {
		 start=newnode;
		 temp=newnode;
		 return;
		 }
		 temp.link=newnode;
		 temp=temp.link;
		 //start=newnode;
		
		 
	 }
	 static void insertatb(int i)
	 {
		 node n=new node();
		 n.info=i;
		 n.link=start;
		 start=n;
	 }
	 static void insertatend(int i)
	 {
		 node n=new node();
		 n.info=i;
		 n.link=null;
		 node ptr=start;
		 while(ptr.link!=null)
		 {
			  ptr=ptr.link;
		 }
		 ptr.link=n;
		 
	 }
	 static void deletefront()
	 {
		 if(start==null)
		 {
			 System.out.println("Empty");
		 }
		 else
		 {
		 node ptr=start;
		 start=start.link;
		 System.out.println("Node from front"+ptr.info);
		 }
	 }
	 static void deletefromend()
	 {
		 if(start==null)
		 {
			 System.out.println("Empty");
			 return;
		 }
		 else
		 {
		 node temp;
		 node ptr=start;
		 node prev=null;
		 while(ptr.link!=null)
		 {
			 prev=ptr;
			 ptr=ptr.link;
		 }
		 temp=ptr;
		 prev.link=null;
		 System.out.println("Node from end::"+temp.info);
		 }
	 }
	 static void traverse()
	 {
		 node ptr=null;
		 ptr=start;
		 while(ptr!=null)
		 {
			 System.out.println(ptr.info);
			 ptr=ptr.link;
		}
	 }
	 
static void anyplaceinsert(int i,int val)
{
	node n=new node();
	n.info=val;
	n.link=null;
	node ptr;
	ptr=start;
	node prev=null;
	int count=0;
	if(i==0)
	{
		start=n;
		temp=n;
	}
	else
	{
		while(count!=i && ptr!=null)
		{
			prev=ptr;
			ptr=ptr.link;
			count++;
		}
		n.link=ptr;
		prev.link=n;
		
	}
}

public static void reverse()
{
	node prev=null;
	node ptr=start;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    linkedlist l=new linkedlist();
    Scanner sc=new Scanner(System.in);
   while(true)
   {
	   System.out.println("1. Insert");
	   System.out.println("2. Insert at Beginning");
	   System.out.println("3. Transversal");
	   System.out.println("4. Insert at End");
	   System.out.println("5.Delete at Beginning");
	   System.out.println("6. Delete at End");
	   System.out.println("7. Insert at any place");
	   System.out.println("Enter Choice");
	   int c=sc.nextInt();
	   switch(c)
	   {
	        case 1:
	       {
		   System.out.println("Enter number to enter:");
		   int n=sc.nextInt();
		   insert(n);
		   break;
	        }
	       
	         case 2:
	        {
		   System.out.println("Enter number for beginning");
		   int n=sc.nextInt();
		   insertatb(n);
		   break;
	        }
	        
	         case 3:
	         {
	        	 traverse();
	        	 break;
	         }
	         case 4:
	         {
	        	 System.out.println("Enter number to insert at end");
	        	 int n=sc.nextInt();
	        	 insertatend(n);
	        	 break;
	         }
	         case 5:
	         {
	        	 deletefront();
	        	 break;
	         }
	         case 6:
	         {
	        	 deletefromend();
	        	 break;
	         }
	         case 7:
	         {
	        	 System.out.println("Enter index and value");
	        	 int i=sc.nextInt();
	        	 int val=sc.nextInt();
	        	 anyplaceinsert(i,val);
	         }
	         default:
	         {
	        	 System.out.println("Wrong choice");
	        	 continue;
	         }
	         
	   }
	   
	   System.out.println("Do you wanna continue 1. to continue");
	   int choice=sc.nextInt();
	   if(choice!=1)
		   return;
	   else
		   continue;
   }
	}

}

