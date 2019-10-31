class BeanThread extends Thread
{
	int b;
	double bb;
	public void setNumber(int b)
	{
		this.b=b;
		bb=b/1000;
		if(b%1000 != 0)
			bb+=0.5;
	}
	public void run()
	{
		System.out.printf("pack, %.1f box, %.2f Yuan # ",bb,bb*50.0*58.00);
	}
}