package Thread;

public class Threade extends Thread{
	public void run() {
		System.out.println("i am thread...thread is running");
	}	
	public static void main(String[] args) {
		Threade t = new Threade();
		t.start();
		t.start();
	}

}
