class Triangle
{
	int height;
	int bottom;
	Triangle(int height,int bottom)
	{
		this.height=height*10;
		this.bottom=bottom*10;
	}
	Triangle ()
	{
		height=50;
		bottom=50;
	}
	public void setNumber(int height,int bottom)
	{
		this.height=height*10;
		this.bottom=bottom*10;
	}
	public int getHeight()
	{
		return (int)(height/10);
	}
	public int getBottom()
	{
		return (int)(bottom/10);
	}
	public void printTriangle()
	{
		char [][]t=new char[height][bottom];
		double tan=((double)(bottom)/(double)(height))/2.0;
		for (int i=0;i<height;i++)
			for(int j=0;j<bottom;j++)
				t[i][j]=' ';		
		for(int i=0;i<height;i++)
			for(int j=(int)(bottom/2.0-tan*(double)(i+1));j<(int)(bottom/2.0+tan*(double)(i+1));j++)
			{
				t[i][j]='*';
			}
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<bottom;j++)
				System.out.printf("%c",t[i][j]);
			System.out.println();
		}
	}
}

class IsoscelesTriangle
{
	public static void main(String[] args)
	{
		int b=3;
		int h=5;
		Triangle dysjx=new Triangle(h,b);
		dysjx.printTriangle();
	}
}
