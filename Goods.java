import java.util.*;
public class Goods
{
	int []goods=new int[3];	
	int i=0;
	String str;
	public void setGoods()
	{
		System.out.println("Plz enter the number u want to purchase.");
		System.out.println("The flow is cup, macha, and coffee bean.");
		System.out.println("Use # to separate the number.");
		Scanner scanner=new Scanner(System.in);
		if(scanner.hasNext())
			str=scanner.next();
		Scanner scan=new Scanner(str);
		System.out.println("Input complete.");
		String regex="[^0123456789.]+";
		scan.useDelimiter(regex);
		while(scan.hasNext())
		{
			try
			{
				str=scan.next();
				goods[i] = Integer.parseInt(str);
				i++;
			}
			catch(InputMismatchException exp)
			{
				String t=scan.next();
			}
		}	
	}
	public int[] getGoods()
	{
		return goods;
	}

}