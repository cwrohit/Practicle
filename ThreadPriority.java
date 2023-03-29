package Thread;

public class ThreadPriority extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}}
	public static void main(String[] args) {
		ThreadPriority t = new ThreadPriority();
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		t2.setPriority(MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority());
	t.start();
	t1.start();
	t2.start();
	t1.setName("RD Boy");
	System.out.println(t1.getName());
	}}
