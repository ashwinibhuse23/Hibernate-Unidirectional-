package one_to_one.unidirectional.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_master")

public class Employee {
	@Id
	@Column(name="empno")
	private Integer empNo;
	@Column(name="emp_name",length=40)
	private String name;
	@Column(name="emp_sal")
	private int sal;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_id")
	private Passport passportRef;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empNo, String name, int sal, Passport passportRef) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.sal = sal;
		this.passportRef = passportRef;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Passport getPassportRef() {
		return passportRef;
	}

	public void setPassportRef(Passport passportRef) {
		this.passportRef = passportRef;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", sal=" + sal + ", passportRef=" + passportRef + "]";
	}
	

}
