package Interest.CalculateInterest;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class InterestTest {

		public static void main(String[] args) throws Exception{

		int number;
		char choice;
		SimpleInterest simpleInterest=new SimpleInterest();
		CompoundInterest compoundInterest=new CompoundInterest();

		Scanner sc=new Scanner(System.in);

		do
		{	
			PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
			out.println("choose \n1. Simple Interest\n2.Compound Interest");
					
			number=sc.nextInt();
			switch(number){
			case 1:
				simpleInterest.input();
				simpleInterest.calculate();
				break;
			case 2:
				compoundInterest.input();
				compoundInterest.calculate();
				break;
			default:
				out.println("Invalid number !please try again!!");
				//out.close();
			}
			out.println("Do you want to continue??");
			choice=sc.next().charAt(0);
		}
		while(choice=='y');
		if(choice!='y')
			System.exit(0);
		
	}

}
/*class test
{
	public static void main(String args[])throws 
	{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World");
		bw.close();
	}
}
*/
