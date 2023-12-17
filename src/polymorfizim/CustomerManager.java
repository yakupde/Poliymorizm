package polymorfizim;

public class CustomerManager extends BaseLogger {
	
	private BaseLogger baseLogger;
	
	
	


	public CustomerManager( BaseLogger baseLogger) {

		this.baseLogger=baseLogger;
	}



	public void add() {
		
		System.out.println("müşteri eklendi");
	
		
	}
	
}
