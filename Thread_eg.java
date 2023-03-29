package Thread;
// directly we use thread class without extend
//with &without set name we can name the thread
public class Thread_eg {
	public void run() {
		System.out.println("Rohit");
	}
	public static void main(String[] args) {
//creating an object of the thread class using the thread constructor
		Thread_eg obj = new Thread_eg();
		obj.run();
		Thread t = new Thread("Rahul");
		Thread t1 = new Thread();
		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("Thread 0:"+t.getName());
		System.out.println("Thread 1"+t.getName());
		
	}

}
