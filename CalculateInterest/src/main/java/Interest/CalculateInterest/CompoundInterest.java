package Interest.CalculateInterest;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.*;
import java.util.Scanner;

public class CompoundInterest extends Interest{
private double compoundInterest;
		
	public void calculate()
	{	
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));

		compoundInterest=principal*(Math.pow((1+(rateOfInterest/100)),time));
		out.println("The Simple Interest is "+compoundInterest);
	}
	

}
