package com.tka.infosysInfo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_id;
	private String employee_name;
	private String employee_profile;
	private double employee_Salary;
	private String employee_dateofjoin;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_profile() {
		return employee_profile;
	}

	public void setEmployee_profile(String employee_profile) {
		this.employee_profile = employee_profile;
	}

	public double getEmployee_Salary() {
		return employee_Salary;
	}

	public void setEmployee_Salary(double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}

	public String getEmployee_dateofjoin() {
		return employee_dateofjoin;
	}

	public void setEmployee_dateofjoin(String employee_dateofjoin) {
		this.employee_dateofjoin = employee_dateofjoin;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_profile="
				+ employee_profile + ", employee_Salary=" + employee_Salary + ", employee_dateofjoin="
				+ employee_dateofjoin + "]";
	}

}
