package datastructures;
class no
{
	int info;
	no left;
	no right;
	public no(int item)
	{
		info=item;
		left=right=null;
	}
}
public class binarytree {
	no head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      binarytree t=new binarytree();
      t.head=new no(1);
      t.head.left=new no(2);
      t.head.right=new no(3);
     // t.insert(4);
      t.print(t.head);
	}
	
	static void print(no ptr)
	{
		if(ptr!=null)
		{
			print(ptr.left);
			System.out.println(ptr.info);
			print(ptr.right);
		}
			
	}

}
