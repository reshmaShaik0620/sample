package sample;
public class New_Year_Gift {
	Chocolates ch_gft[];
	Sweets sw_gft[];
	int gft_wt=0;
	public New_Year_Gift(Sweets s[],Chocolates c[])
	{
		this.sw_gft=s;
		this.ch_gft=c;
	}
	public void find_weight()
	{
		for(int i=0;i<sw_gft.length;i++)
		{
			gft_wt+=sw_gft[i].cost;
		}
		for(int i=0;i<ch_gft.length;i++)
		{
			gft_wt+=ch_gft[i].cost;
		}
		System.out.println("Total Weight of Children's gift is:"+gft_wt);
	}
	public void sort_chocolates()
	{
		for(int i=0;i<ch_gft.length-1;i++)
		{
			for(int j=0;j<ch_gft.length-i-1;j++)
			{
				if(ch_gft[j].cost>ch_gft[j+1].cost)
				{
					Chocolates tmp=ch_gft[j];
					ch_gft[j]=ch_gft[j+1];
					ch_gft[j+1]=tmp;
				}
			}
		}
	}
	public void find_candies()
	{
		System.out.println("Candies in the Children's Gift whose cost is less than 100 is:");
		for(int i=0;i<ch_gft.length;i++)
		{
			if(ch_gft[i].cost>=100)
			{
				break;
			}
			System.out.println("Name:"+ch_gft[i].name);
			System.out.println("Flavour:"+ch_gft[i].flavour);
			System.out.println("Cost:"+ch_gft[i].cost);
		}
	}
}