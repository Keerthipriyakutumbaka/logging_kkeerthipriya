package logtaskpriya.logtask1;

	import java.util.Scanner;
	import org.apache.log4j.Logger;


	public class logging {
		static Logger log = Logger.getLogger(logging.class.getName());
		public static void costEvaluator() {
			Scanner sc2= new Scanner(System.in);
			
			
			log.info("CONSTRUCTION COST ESTIMATION");
			log.info("Variants Available");
			log.info("1. Construction with standard materials");
			log.info("2. Construction with above standard materials");
			log.info("3. Construction with high standard materials");
			log.info("4. Construction with high standard materials and fully automated");
			log.info("Enter your choice (1-4): ");
			try {
			int ch=sc2.nextInt();
			switch(ch)
			{
			case 1:
				log.info("Enter the area of house: ");
				log.info("Cost ="+sc2.nextDouble()*1200 +" INR");
				break;
			case 2:
				log.info("Enter the area of house: ");
				log.info("Cost ="+sc2.nextDouble()*1500 +" INR");
				break;
			case 3:
				log.info("Enter the area of house: ");
				log.info("Cost ="+sc2.nextDouble()*1800 +" INR");
				break;
			case 4:
				log.info("Enter the area of house: ");
				log.info("Cost ="+sc2.nextDouble()*2500 +" INR");
				break;
			default:
				log.error("Enter a valid input ... ");
				
			
				
			}}
			
			catch (Exception e) {
			
				log.fatal("Enter a valid input ... ");
				
			}
			sc2.close();
			
		}

	}
}
