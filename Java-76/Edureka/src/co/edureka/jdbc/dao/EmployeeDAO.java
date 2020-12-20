package co.edureka.jdbc.dao;

import java.util.List;

import co.edureka.jdbc.entity.Employee;

public interface EmployeeDAO 
{
 public void saveEmp(Employee emp) throws Exception;
 public void updateEmp(Employee emp) throws Exception;
 public void deleteEmp(Integer eno) throws Exception;
 public Employee searchEmployee(Integer eno) throws Exception;
 public List<Employee> getEmployees() throws Exception;
}
