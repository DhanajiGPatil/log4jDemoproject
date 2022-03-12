package demologPack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LDemo1 {
	 
	
	static final Logger log=Logger.getLogger(LDemo1.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.setLevel(Level.ERROR);
		
		entry();
		read();
		payment();
		subscription();
		
	}
	
	static void entry() {
		
		System.out.println("inside entry method..");
		log.info("this is info method.....");
		
	}
	
	static void read() {
		
		System.out.println("inside read method..");
		log.debug("this is debug method.....");
	
	}
	
	static void payment() {
		
		System.out.println("inside payment method..");
		log.warn("this is warning method...");

	}
	static void subscription() {
		
		System.out.println("inside subscription method..");

		log.fatal("this is fatal method....");
		System.out.println(10/0);
		log.error("this is error method....");

	}

}
