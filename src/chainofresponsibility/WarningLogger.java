package chainofresponsibility;

public class WarningLogger extends Logger {

	public WarningLogger() {
		this.level = Logger.WARNING;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Warning message: " + message);
	}

}
