package threads;

public class IRCTC {
	
	//void confirmTicket() {// 2 threads are excecuting same time
		synchronized void confirmTicket() {
		for (int i = 0; i < 7; i++) {
			System.out.println(i);
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}

	synchronized void leaveMe() {
			System.out.println("called  notifyAll");
			//notify();//prints only one thread output
			notifyAll();
		}
}
