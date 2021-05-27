package com.hcl.employee.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
	public Employee() {
		
	}
	private int emp_id;
    private String emp_name;
    private String emp_address;
	

}
