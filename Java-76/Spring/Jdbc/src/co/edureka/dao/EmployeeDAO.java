package co.edureka.dao;

import java.util.List;

import co.edureka.entity.Employee;

public interface EmployeeDAO 
{
 public void saveEmp(Employee emp);
 public void updateEmp(Employee emp);
 public void deleteEmp(Integer eno); 
 public List<Employee> getEmployees();
}
