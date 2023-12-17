package polymorfizim;

public class Main {

	public static void main(String[] args) {
		
	
		/*
		 * BaseLogger[]loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(),new
		 * DatabaseLoger(),new CustomerManager()};
		 * 
		 * for (BaseLogger logger : loggers) {
		 * 
		 * logger.log("log mesajı"); }
		 */
		
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLoger());
		
		customerManager.log("mesajınız alındı");
		customerManager.toString();
	
	}

}
