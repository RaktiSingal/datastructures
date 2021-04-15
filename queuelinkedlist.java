package datastructures;

import java.util.Scanner;

public class queuelinkedlist {
static node start=null;
static node temp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist l=new linkedlist();
	    Scanner sc=new Scanner(System.in);
	   while(true)
	   {
		   System.out.println("1. Insert");
		   System.out.println("2. Delete");
		   System.out.println("3. Traverse");
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
			   delete();
			   break;
		        }
		         case 3:
		         {
		        	 traverse();
		        	 break;
		         }
		        default:
		        {
		        	System.out.println("Wrong choice");
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
	static void delete()
	 {
		 if(start==null)
		 {
			 System.out.println("Empty");
		 }
		 else if(start==temp)
		 {
			 start=null;
			 temp=null;
		 }
		 else
		 {
		 node ptr=start;
		 start=start.link;
		 System.out.println("Node from front"+ptr.info);
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

}
