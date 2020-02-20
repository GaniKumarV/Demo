
public class StoreInfo {

	int result;
	boolean available;

	public synchronized void produce(int data) {

		while (available == true) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available = true;
		result = data;
		notifyAll();

	}

	public synchronized int consumes() {

		while (available == false) {

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();

		return result;
	}

	/*
	 * public void produce(int i) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
