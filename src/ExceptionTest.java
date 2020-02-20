
public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int i=10/0;
		}catch(ArithmeticException e) {
			//System.out.println("hello");
			
			e.printStackTrace();
		}

	}
	
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
	 * ExceptionTest.main(ExceptionTest.java:7)
	 */


}
