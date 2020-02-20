package Interest.CalculateInterest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Interest {
	double rateOfInterest,time,principal;
	public abstract void calculate();
	void input()
	{
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.println("Enter the Principal amount:");
		Scanner sc=new Scanner(System.in);
		principal=sc.nextDouble();
		out.println("Enter rate of interest");
		rateOfInterest=sc.nextDouble();
		out.println("Enter time");
		time=sc.nextDouble();
	}
	
	

}
