class Delivery
{
	public static void main(String[] args)
	{
		Goods starbuck=new Goods();
		int []g=new int[3];
		starbuck.setGoods();
		g=starbuck.getGoods();
		CupThread cup=new CupThread();
		MachaThread macha=new MachaThread();
		BeanThread bean= new BeanThread();
		cup.setNumber(g[0]);
		macha.setNumber(g[1]);
		bean.setNumber(g[2]);
		cup.start();
		macha.start();
		bean.start();
	}
}
