package datastructures;

public class xandycoordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,4};
		int y[]= {2,5};
     point2d p=new point2d(x,y);
     System.out.println(p.dist2d(p));
	}

}
class point2d
{
	int x[],y[];
	point2d(int x[],int y[])
	{
		this.x=x;
		this.y=y;
	}
	double dist2d(point2d p)
	{
		double res=Math.ceil(Math.sqrt(Math.pow(p.x[1]-p.x[0],2)+Math.pow(p.y[1]-p.y[0],2)));
		return res;
	}
}
