package com.zpt.crud.bean;

public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Deptment dept;

    
    public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String gender, String email, Deptment dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.email = email;
		this.dept = dept;
	}

	public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

	public Deptment getDept() {
		return dept;
	}

	public void setDept(Deptment dept) {
		this.dept = dept;
	}

}