package Thread;

public class Sleep_Method extends Thread{
		public void run() {
			for (int i=0;i<=5;i++) {
				try {
					Thread.sleep(1000); //thread will sleep for 1000 mill sc
				}
				catch(InterruptedException ie) {
					System.out.println(ie);
				}
				System.out.println(i);
				}
			}
		public static void mian(String[] args) {
			Sleep_Method t = new Sleep_Method();
			Sleep_Method t1 = new Sleep_Method();
			t.start();
			t1.start();
		}}
		