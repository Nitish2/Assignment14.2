package PrintMessage;

public class ThreadDemo {

	public static void main(String[] args) {
		try {
			FirstThread ft = new FirstThread(); // Creating an object of the
												// first thread
			Thread thread1 = new Thread(ft);
			thread1.start(); // Starting the thread
			thread1.start(); // Starting the thread again
		} catch (Exception IllegalThreadException) {

			System.err.println(" You cannot start a thread twice");

		}
	}

}
