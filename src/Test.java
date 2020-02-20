import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.TreeSet;

public class Test {

	public void m1(StringBuffer sb) {

		System.out.println("String Buffer Version");
	}

	public void m1(String s) {

		System.out.println("String version::::::");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BookShop bookshop = new Boo

		int x = 4;

		int y = x--;

		System.out.println(x + ":::" + y);

		byte b = (byte) 130;

		System.out.println(b);

		byte b1 = (byte) 128;

		System.out.println(b1);

		Test t = new Test();

		t.m1(new StringBuffer("gani"));

		t.m1("gani love");
		//t.m1(null);

		
		Runtime r1 = Runtime.getRuntime();
		
		TreeSet ts = new TreeSet();
		
		//ts.add(null);
		ts.add("gani");
		
		System.out.println(ts);
		
		
		
		IdentityHashMap hm = new IdentityHashMap();
		
		Integer i1 = new Integer(10);
		
		Integer i2 = new Integer(10);
		
		
		hm.put(i1, "pavan");
		hm.put(i2, "gani");
		
		System.out.println(hm);
		
		
		List l = new ArrayList();
		
		l.add(10);
		l.add(5);
		l.add(1);
		l.add("gani");
		
		Collections.sort(l);
		
		System.out.println(l);
		
		

	}

}
