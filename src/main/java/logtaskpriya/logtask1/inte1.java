package logtaskpriya.logtask1;

	import java.io.FileDescriptor;
	import java.io.FileOutputStream;
	import java.io.PrintStream;
	import java.util.Scanner;
	import org.apache.log4j.Logger;


	public class inte1 {
		 static Logger log = Logger.getLogger(inte1.class.getName());
		public static void calculateInterest()
		{
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			
			
			log.info("Enter the principal amount :");
			try {
			double princpalamount=sc.nextDouble();
			log.info("Enter the time period :");
			double timeperiod=sc.nextDouble();
			log.info("Enter the rate of interest per annum :");
			double rateofinterest=sc.nextDouble();
			//sc.close();
			log.info("Simple Interest :"+(princpalamount*timeperiod*rateofinterest)/100);
			log.info("Compound Interest :"+((princpalamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpalamount));
			
			}
			catch (Exception e) {
				log.error("Enter a valid input ... ");
				
			}
			
			log.info("-------------------------------------");
			
		}

	}
}
