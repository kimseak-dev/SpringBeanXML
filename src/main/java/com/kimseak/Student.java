package com.kimseak;

public class Student {

	/* 1
	private String studentName;
	
	public void studentInit(){
		System.out.println("student init method is called");
	}
	
	public void studentDestory(){
		System.out.println("student destroy method is called");
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public void sayHello(){
		System.out.println("say hello spring framework...");
	}
	*/
	
	private Address address;
	
	public Student(Address address){
		this.address = address;
	}
	
	public void showInfo(){
		System.out.println("student address is: " + address.getAddress());
	}

}
