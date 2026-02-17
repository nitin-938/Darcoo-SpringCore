package com.my.spring.model;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int id;

	private String name, gender;

	private Address address;
	
	private List<Integer> mylist;
	
	private Set<Integer> setofContacts;
	
	private Map<Integer,String> map;
	

	public Employee() {
		super();
		System.out.println("Employee.Employee()");
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, String gender, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.mylist = list;
		this.setofContacts = setofContacts;
		this.map = map;
	}
	
	
	public List<Integer> getList() {
		return mylist;
	}

	

	public List<Integer> getMylist() {
		return mylist;
	}

	

	public Set<Integer> getSetofContacts() {
		return setofContacts;
	}

	public void setSetofContacts(Set<Integer> setofContacts) {
		this.setofContacts = setofContacts;
	}

	public void setMylist(List<Integer> mylist) {
		this.mylist = mylist;
	}

	
	public Map<Integer, String> getMap() {
		return map;
	}

	public void setList(List<Integer> mylist) {
		this.mylist = mylist;
		System.out.println("Employee.setList");
	}

	

	public void setMap(Map<Integer, String> map) {
		this.map = map;
		System.out.println("Employee.setMap");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", mylist="
				+ mylist + ", setofContacts=" + setofContacts + ", map=" + map + "]";
	}




	
	
}
