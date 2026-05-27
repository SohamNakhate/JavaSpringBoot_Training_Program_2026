package rcoem.demo.domain;

public class Employee {
	private int emp_id; 
	private String empName; 
	private String email;
	
	//Constructors
	public Employee(int emp_id, String empName, String email) {
		super();
		this.emp_id = emp_id;
		this.empName = empName;
		this.email = email;
	} 
	
	public Employee() {
	}

	//Getters and Setters
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", email=" + email + "]";
	}
	

	
	
	
}
