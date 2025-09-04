package com.kh.employee.model.vo;

import java.util.Objects;

public class Employee {
	private String empId;
	private String empName;
	private String empNo;
	private String email;
	private String phone;
	private String deptCode;
	private String jobCode;
	private String salLevel;
	private int salary;
	private float bonus;
	private String managerId;
	private String hireDate;
	private String entDate;
	private String entYn;
	
	public Employee() {
		super();
	}

	public Employee(String empId, String empName, int salary, String jobCode, String deptCode) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
	}

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public Employee(String empId, String empName, String empNo, String email, String phone, String deptCode,
			String jobCode, String salLevel, int salary, float bonus, String managerId, String hireDate, String entDate,
			String entYn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.salLevel = salLevel;
		this.salary = salary;
		this.bonus = bonus;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.entYn = entYn;
		}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empNo=" + empNo + ", email=" + email
				+ ", phone=" + phone + ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", salLevel=" + salLevel
				+ ", salary=" + salary + ", bonus=" + bonus + ", managerId=" + managerId + ", hireDate=" + hireDate
				+ ", entDate=" + entDate + ", entYn=" + entYn + "]";
		
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpNo() {
		return empNo;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public String getJobCode() {
		return jobCode;
	}
	public String getSalLevel() {
		return salLevel;
	}
	public int getSalary() {
		return salary;
	}
	public float getBonus() {
		return bonus;
	}
	public String getManagerId() {
		return managerId;
	}
	public String getHireDate() {
		return hireDate;
	}
	public String getEntDate() {
		return entDate;
	}
	public String getEntYn() {
		return entYn;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bonus, deptCode, email, empId, empName, empNo, entDate, entYn, hireDate, jobCode, managerId,
				phone, salLevel, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Float.floatToIntBits(bonus) == Float.floatToIntBits(other.bonus)
				&& Objects.equals(deptCode, other.deptCode) && Objects.equals(email, other.email)
				&& Objects.equals(empId, other.empId) && Objects.equals(empName, other.empName)
				&& Objects.equals(empNo, other.empNo) && Objects.equals(entDate, other.entDate)
				&& Objects.equals(entYn, other.entYn) && Objects.equals(hireDate, other.hireDate)
				&& Objects.equals(jobCode, other.jobCode) && Objects.equals(managerId, other.managerId)
				&& Objects.equals(phone, other.phone) && Objects.equals(salLevel, other.salLevel)
				&& salary == other.salary;
	}
	
	
	
}
