package singleton;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		// private constructor so it can't be accessed directly
	}

	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void sendMessage(String message) {
		System.out.println("Message from singleton: " + message);
	}
}
