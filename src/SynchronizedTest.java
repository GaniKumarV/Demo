
public class SynchronizedTest {
	
	public static void main(String[] args) {
		
		StoreInfo info = new StoreInfo();
		Producer producer = new Producer(info);
		Consumer consumer = new Consumer(info);
		
		producer.start();
		consumer.start();
	}

}
