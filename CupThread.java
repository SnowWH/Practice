class CupThread extends Thread
{
	int c;
	double cb;
	public void setNumber(int c)
	{
		this.c=c;
		cb=c/1000;
		if(c%1000 != 0)
			cb+=0.5;
	}
	public void run()
	{
		System.out.printf("cup, %.1f box, %.2f Yuan # ",cb,cb*1000.0*0.05);
	}
}