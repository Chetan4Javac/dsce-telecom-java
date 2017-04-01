package me.bean;

public class Student {

	private String name;
	private String usn;

	public Student() {
		super();
	}

	public Student(String name, String usn) {
		super();
		this.name = name;
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// some logic t set
		this.name = name;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

}
