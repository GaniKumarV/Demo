package com.merge.examples;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ABC {

	String name;
	String id;
	String salary;
	String status;
	String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		List abc = new ArrayList();
		ABC a = new ABC();

		a.setId("2");
		a.setName("ZEE");
		
		a.setStatus("1");
		a.setDept("prime");
		
		abc.add(a);
		
		ABC a1 = new ABC();

		a1.setId("4");
		a1.setName("gani");
		
		a1.setStatus("2");
		
		
		abc.add(a1);
		
		//ABC[name=john,id=null,salary=12200,status=null]
		
		List b = new ArrayList();
		ABC abc2 = new ABC();
		abc2.setId("2");
		abc2.setName("John");
		abc2.setSalary("12000");
		
		b.add(abc2);
		
		ABC abc3 = new ABC();
		abc3.setId("4");
		abc3.setName("John");
		abc3.setSalary("12000");
		b.add(abc3);

		List<ABC> abcFinal = mergeABC(abc, b);
		
		System.out.println(abcFinal);
	}


	@Override
	public String toString() {
		return "ABC [name=" + name + ", id=" + id + ", salary=" + salary + ", status=" + status + ", dept=" + dept
				+ "]";
	}

	public static List<ABC> mergeABC(List<ABC> obj1, List<ABC> obj2){
		
		 ABC retVal = new ABC();
		 
		 List <ABC> list = new ArrayList();
		
		for (ABC abc : obj1) {
			
			for (ABC abc2 : obj2) {
				
				if(abc.getId().equalsIgnoreCase(abc2.getId())){
					
					 	retVal.name   = ((abc.name   != null) ? abc.name   : abc2.name   );
					    retVal.id     = ((abc.id     != null) ? abc.id     : abc2.id     );
					    retVal.salary = ((abc.salary != null) ? abc.salary : abc2.salary );
					    retVal.status = ((abc.status != null) ? abc.status : abc2.status );
					
				}
			}
			list.add(retVal);
			
		}

	    return list;
	}

	@SuppressWarnings("unchecked")
	public static <T> T mergeObjects(T first, T second) throws IllegalAccessException, InstantiationException {
		Class<?> clazz = first.getClass();
		Field[] fields = clazz.getDeclaredFields();
		Object returnValue = clazz.newInstance();
		for (Field field : fields) {
			field.setAccessible(true);
			Object value1 = field.get(first);
			Object value2 = field.get(second);
			Object value = (value1 != null) ? value1 : value2;
			field.set(returnValue, value);
		}
		return (T) returnValue;
	}

}
