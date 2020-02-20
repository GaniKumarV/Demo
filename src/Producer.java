
public class Producer extends Thread{
	
	
	StoreInfo si;

	public Producer(StoreInfo si) {
		super();
		this.si = si;
	}
	
	public void run() {
		
		
		for(int i=0;i<=10;i++) {
			
			si.produce(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Producer produced:::::"+i);
		}
	}

}
