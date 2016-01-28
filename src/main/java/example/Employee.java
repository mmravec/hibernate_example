package example;

import java.util.Date;

public class Employee {
	
	private int id;
	private String name;
	private String address;
	private int salary;
	private Date insert_time;
	
	public Employee(){
		insert_time = new Date();
	}
	
	public Employee(int id, String name, String address, int salary,Date insert_time) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.insert_time = new Date();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}
}
