package sample;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	int num_sweets;
    	int num_chocolates;
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter total number of Sweets in the Gift:");
    	num_sweets=sc.nextInt();
    	Sweets s[]=new Sweets[num_sweets];
    	for(int i=0;i<num_sweets;i++)
    	{
    		System.out.println("Enter details of sweet "+(i+1)+":");
    		System.out.print("Name:");
    		String sname=sc.next();
    		System.out.print("Quantity:");
    		int squantity=sc.nextInt();
    		System.out.print("Cost:");
    		int scost=sc.nextInt();
    		s[i]=new Sweets(sname,squantity,scost);
    	}
    	System.out.println("Enter total number of Chocolates in the Gift:");
    	num_chocolates=sc.nextInt();
    	Chocolates c[]=new Chocolates[num_chocolates];
    	for(int i=0;i<num_chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name:");
    		String cname=sc.next();
    		System.out.print("Flavour:");
    		String cflavour=sc.next();
    		System.out.print("Cost:");
    		int ccost=sc.nextInt();
    		c[i]=new Chocolates(cname,cflavour,ccost);
    	}
    	New_Year_Gift ng=new New_Year_Gift(s,c);
    	ng.find_weight();
    	ng.sort_chocolates();
    	ng.find_candies();
    	sc.close();
    }
}