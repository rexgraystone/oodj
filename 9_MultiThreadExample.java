/*
	9. Write a Java program to create multiple threads.
*/

class MultiThread implements Runnable {
	private String threadName;

	MultiThread (String name) {
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
class MultiThreadExample {
	public static void main(String args[]) {
		MultiThread mt1 = new MultiThread ("King");
		Thread t1 = new Thread (mt1);
		t1.start();
		MultiThread mt2 = new MultiThread ("Queen");
		Thread t2 = new Thread (mt2);
		t2.start();
	}
}