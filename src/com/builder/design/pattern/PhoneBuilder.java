package com.builder.design.pattern;

public class PhoneBuilder {

	private int pid;
	private String pname;
	private String proceId;
	private int ram;

	public PhoneBuilder setPid(int pid) {
		this.pid = pid;
		return this;
	}

	public PhoneBuilder setPname(String pname) {
		this.pname = pname;
		return this;
	}

	public PhoneBuilder setProceId(String proceId) {
		this.proceId = proceId;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone getPhone() {
		
		return new Phone(pid, pname, proceId, ram);
	}

}
