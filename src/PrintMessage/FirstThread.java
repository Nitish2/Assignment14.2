package PrintMessage;

/**
 * Printing the message “Welcome to AcadGild” for 10 times each after 3 second
 * and in the same code start the thread more than one time and doing exception
 * handling if any exception occurs * @author Hp
 *
 */
class FirstThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(" Welcome to AcadGild " + i);
			try {
				Thread.sleep(
						3000); /*
								 * this thread will sleep for 3000 milliseconds
								 * before executing the next statement.
								 */
			} catch (InterruptedException interrupted) { // Interrupted
															// exception will be
															// thrown
				System.err.println("You cannot start a thread twice");
			}
		}
	}
}
