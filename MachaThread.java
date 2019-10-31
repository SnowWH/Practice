class MachaThread extends Thread
{
	int m;
	double mb;
	public void setNumber(int m)
	{
		this.m=m;
		mb=m/1000;
		if(m%1000 != 0)
			mb+=0.5;
	}
	public void run()
	{	
		System.out.printf("pack, %.1f box, %.2f Yuan # ",mb,mb*100.0*10.05);
	}
}