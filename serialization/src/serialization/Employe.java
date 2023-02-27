package serialization;

import java.io.Serializable;

public class Employe implements Serializable {
	
//	private static final long serialversionUID=129348938L;
//   
//	transient int a;
//	static int b;
//	String name;
//	int age;
//	public Employe(int a,int b, String name, int age) {
//		super();
//		this.a = a;
//		this.b=b;
//		this.name = name;
//		this.age = age;
//	}
	
	private int id;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	private String department;
	private int age;
	public Employe(int id, String name, String department, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + "]";
	}
	
	

}
