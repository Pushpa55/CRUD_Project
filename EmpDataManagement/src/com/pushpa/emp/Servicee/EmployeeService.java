package com.pushpa.emp.Servicee;
	
	import java.util.List;

	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import com.pushpa.emp.model.Employee;

	public interface EmployeeService {

		public abstract List<Employee> employeesList();

		public abstract Employee getEmployeeRecord(HttpServletRequest request, HttpServletResponse response);

		public abstract boolean updateEmployeeRecord(HttpServletRequest request, HttpServletResponse response);

		public abstract int addNewEmployeeRecord(HttpServletRequest request, HttpServletResponse response);

		public abstract int deleteEmployeeRecord(HttpServletRequest request, HttpServletResponse response);

}

