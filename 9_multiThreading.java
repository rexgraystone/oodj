/*
	9. Write a Java program to create multiple threads.
*/

class multiThread implements Runnable {
	private String threadName;

	multiThread (String name) {
		threadName = name;
		System.out.println("Creating a thread - " +threadName);
	}

	synchronized public void run() {
		try {
			System.out.println("Running thread - " +threadName);
			for (int i=1; i>-10; i--); {
				System.out.println(threadName+ " -" );
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(threadName+ " Existing");
	}
}
class multiThreading {
	public static void main(String args[]) {
		multiThread mt1 = new multiThread ("King");
		Thread t1 = new Thread (mt1);
		t1.start();
		multiThread mt2 = new multiThread ("Queen");
		Thread t2 = new Thread (mt2);
		t2.start();
	}
}