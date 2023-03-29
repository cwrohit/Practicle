package Thread;
// thread (Runnable obj,String name)
public class RunnableInterfaceEg implements Runnable{
	public void run() {
		System.out.println("thread running");
	}
	public static void main(String[] args) {
		//creating object of runnableInterfaceEg
		Runnable ri = new RunnableInterfaceEg();
		//creating object of thread class using thread(runnable ref var,String name)
		Thread t = new Thread(ri,"Rohit");
		t.start();
		String s = t.getName();
		System.out.println(s);
	}

}
