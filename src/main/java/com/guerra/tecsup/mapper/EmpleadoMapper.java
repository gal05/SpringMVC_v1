package com.guerra.tecsup.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guerra.tecsup.model.Empleado;

public class EmpleadoMapper {
	
	
	public Empleado mapRow(ResultSet rs, int rowNum) throws SQLException {
		Empleado emp = new Empleado();
		emp.setEmployeeId(rs.getInt("employee_id"));
		emp.setLogin(rs.getString("login"));
		emp.setPassword(rs.getString("password"));
		emp.setFirstname(rs.getString("first_name"));
		emp.setLastname(rs.getString("last_name"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
	}
}


