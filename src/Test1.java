import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Test1 {

	public void test(long l) {

		System.out.println("long version..............");
	}

	public void test(int s) {

		System.out.println("int version..............");

	}

	public static void main(String[] args) {

		// ()->System.out.println("hello world");

		Test1 test = new Test1();
		test.test(5);

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// Remove elements smaller than 10 using
		// Iterator.remove()
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int x = (Integer) itr.next();
			if (x == 2)
				itr.remove();
		}

		System.out.println("Modified ArrayList : " + al);

		List<Employee> emplist = new ArrayList<>();

		Employee e1 = new Employee();

		e1.setEmpId(100);
		e1.setName("gani");

		Employee e2 = new Employee();

		e2.setEmpId(200);
		e2.setName("sumi");

		emplist.add(e1);
		emplist.add(e2);

		// System.out.println(emplist.get(0));

		Employee emp = emplist.get(0);

		System.out.println(emp.getEmpId());

		String name = emp.getName();

		if (name == null) {

			// return null;
		}

		/*
		 * int empId = e1.getEmpId(); System.out.println(empId);
		 */

	}
}