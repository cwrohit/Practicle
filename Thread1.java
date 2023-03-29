package Thread;

public class Thread1 extends Thread{
	public void run() {
		System.out.println(" thread2");
	}
	public static void main(String[] args) {
		Thread1 obj = new Thread1();
		obj.start();
		obj.setName("thread1");
		String s = obj.getName();
		System.out.println(s);
		
		
	}

}
