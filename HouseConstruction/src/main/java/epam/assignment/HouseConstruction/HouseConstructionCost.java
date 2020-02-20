package epam.assignment.HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HouseConstructionCost implements MaterialPrice{

	private int materialStandard,automation;
	private double area,totalCost;
	PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
	Scanner sc=new Scanner(System.in);
	public void input()
	{	
		out.println("Enter the area of land");
		area=sc.nextDouble();
		out.println("Enter the material standard choice(1/2/3):\n1. Standard material\n2. Above Standard Material\n3. High standard material");
		materialStandard=sc.nextInt();
		if(materialStandard==3)
		{
		out.println("Do you want fully automated home? (1/2):\n1. Yes\n2. No");
		automation=sc.nextInt();
		}
	}
	public void cost()
	{
		if(materialStandard==1)
			totalCost=area*standard;
		else if(materialStandard==2)
			totalCost=area*aboveStandard;
		else if(materialStandard==3)
		{	
			if(automation==1)
				totalCost=area*highStandardAutomated;
			else 
				totalCost=area*highStandard;
		}
		else 
			{
				out.println("Invalid choice.Please try again!!!");
				input();
				cost();
			}
		out.println("The total cost of contruction is"+totalCost);
		
	}
	
}
