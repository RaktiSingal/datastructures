package datastructures;
import java.util.*;
public class onedarray {
static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Maximum number of elements you can enter:");
		int size=sc.nextInt();
		System.out.println("Enter elements you want to enter:");
		 n=sc.nextInt();
		System.out.println("Enter elements:");
		int a[]=new int[size];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		while(true)
		{
		System.out.println("Operations that you can perform");
		System.out.println("1. Inserting an element");
		System.out.println("2. Deleting any element");
		System.out.println("3. Searching an element");
		System.out.println("4. Sorting");
		System.out.println("5. Merging two arrays");
		System.out.println("Enter your choice::");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter number you want to insert and index/position:");
			int num=sc.nextInt();
			int position=sc.nextInt();
			insert(a,num,position,size);
		}
		if(choice==2)
		{
			System.out.println("Enter position of element you want to delete");
			int position=sc.nextInt();
			delete(a,position);
		}
		if(choice==3)
		{
			System.out.println("How do you want to search elements");
			System.out.println("1. Linear Search");
			System.out.println("2. Binary Search");
			System.out.println("Enter your choice::");
			int choice2=sc.nextInt();
			    
			        if(choice2==1)
			        {
			        	System.out.println("Enter Number you want to search:");
			        	int num=sc.nextInt();
			        	linearsearch(a,num);
			        }
			        if(choice2==2)
			        {
			        	System.out.println("Enter Number you want to search:");
			        	int num=sc.nextInt();
			        	Arrays.sort(a);
			        	binarysearch(a,num);
			        }
		}
		if(choice==4)
		{
			System.out.println("How do you want to sort elements");
			System.out.println("1. Bubble sort");
			System.out.println("2. Selection sort");
			System.out.println("3. Insertion sort");
			System.out.println("Enter your choice::");
			int choice3=sc.nextInt();
			
			       if(choice3==1)
			       {
			    	   bubblesort(a);
			       }
			       if(choice3==2)
			       {
			    	   selectionsort(a);
			       }
			       if(choice3==3)
			       {
			    	   insertionsort(a);
			       }
		}
		if(choice==5)
		{
			System.out.println("Enter number of elements of 2nd set:");
			int n2=sc.nextInt();
			System.out.println("Enter Elements:");
			int b[]=new int[n2];
			for(int i=0;i<n2;i++)
			{
				b[i]=sc.nextInt();
			}
			merge(a,b,n2);
		}
		
		
		System.out.println(" Press 6 to display or 0  to continue ");
		int display=sc.nextInt();
		if(display==6)
			display(a);
		System.out.println("Do want to continue with operations. Press 0 to end and 1 to continue");
		int terminate=sc.nextInt();
		if(terminate==0)
			return;
		if(terminate==1)
			continue;
		
		}
	}
	public static void insert(int a[],int num,int position,int size)
	{
	  if(size==n)
	  {
		  System.out.println("Array is full cannot insert more");
		  return;
	  }
	  else
	  {
		  for(int i=n;i>=position;i--)
		  {
			  a[i]=a[i-1];
		  }
		  n++;
		  a[position]=num;
		  System.out.println("Element is added");
	  }
	}
	public static void delete(int a[],int position)
	{
		for(int i=position;i<n;i++)
		{
			a[i]=a[i+1];
		}
		n--;
		System.out.println("Element deleted");
	}
    public static void linearsearch(int a[],int num)
    {
    	for(int i=0;i<n;i++)
    	{
    		if(a[i]==num)
    		{
    		   System.out.println("Element found at position "+i);
    		   return;
    		}
    	}
    	System.out.println("Element not found");
    	return;
    }
    public static void binarysearch(int a[],int num)
    {
    	int l=0,h=n-1,m;
    	m=(l+h)/2;
    	System.out.println(m);
    	System.out.println(num);
    	if(a[m]==num)
		{
			System.out.println("Number found at position:"+m);
			return;
		}
    	while(l<h && a[m]!=num)
    	{
    		System.out.println("in");
    		if(a[m]==num)
    		{
    			System.out.println("Number found at position:"+m);
    			return;
    		}
    		if(a[m]>num)
    		{
    			h=m-1;
    		}
    		if(a[m]<num)
    		{
    			l=m+1;
    		}
    		m=(l+h)/2;
    	}
    	System.out.println("Number Not Found");
    	return;
    	
    }
    public static void bubblesort(int a[])
    {
    	
    }
    public static void selectionsort(int a[])
    {
    	
    }
    public static void insertionsort(int a[])
    {
    	
    }
    public static void merge(int a[],int b[],int n2)
    {
    	
    }
    public static void display(int a[])
    {
    	for(int i=0;i<n;i++)
    		System.out.println(a[i]);
    }
}
