import java.util.*;
class Delivery
{
	public static void main(String[] args)
	{
		int c=3;
		int m=4;
		int b=5;
		Goods starbuck=new Goods(c,m,b);
		starbuck.price();
	}
}

class Goods
{
	int cup;
	int macha;
	int bean;
	double cb;
	double mb;
	double bb;
	Goods(int c,int m,int b)
	{
		cup=c;
		macha=m;
		bean=b;
		cb=cup/1000;
		if(cup%1000 !=0)
			cb+=0.5;
		mb=macha/100;
		if(macha%100 !=0)
			mb+=0.5;
		bb=bean/50;
		if(bean%50 !=0)
			bb+=0.5;
	}
	public void price()
	{
		System.out.printf("cup, %.1f box, %.2f Yuan \n",cb,cb*1000.0*0.05);
		System.out.printf("pack, %.1f box, %.2f Yuan \n",bb,bb*100.0*10.05);
		System.out.printf("pack, %.1f box, %.2f Yuan \n",cb,cb*50.0*58.00);
	}
}
