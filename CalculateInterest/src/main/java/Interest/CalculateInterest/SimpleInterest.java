package Interest.CalculateInterest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleInterest extends Interest{
	private double simpleInterest;
	
	
	public void calculate()
	{
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));

		simpleInterest=principal*rateOfInterest*time/100;
		out.println("The Simple Interest is "+simpleInterest);
	}
	

}
