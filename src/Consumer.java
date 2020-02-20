
public class Consumer extends Thread {

	StoreInfo si;

	int result;

	public Consumer(StoreInfo si) {
		super();
		this.si = si;
	}

	public void run() {

		for (int i = 0; i <= 10; i++) {
			result = si.consumes();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Consumer consumes:::::"+result);
		}
	}

}
