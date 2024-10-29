package org.Payload;

public class PojoBodyData {
	String name;
	String job;

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setJob(String job) {
		this.job=job;
	}

	public String getJob() {
		return job;
	}

public PojoBodyData(String name, String job) {
	
	this.name=name;
	this.job=job;
}	
	
}








