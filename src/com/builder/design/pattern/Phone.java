package com.builder.design.pattern;

public class Phone {

	private int pid;
	private String pname;
	private String proceId;
	private int ram;

	public Phone(int pid, String pname, String proceId, int ram) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.proceId = proceId;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Phone [pid=" + pid + ", pname=" + pname + ", proceId=" + proceId + ", ram=" + ram + "]";
	}

}
