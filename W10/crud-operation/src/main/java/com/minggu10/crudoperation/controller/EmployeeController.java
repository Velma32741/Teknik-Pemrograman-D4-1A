package com.minggu10.crudoperation.controller;

/**
 *
 * @author FAKHRI
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.minggu10.crudoperation.model.Employee;
import com.minggu10.crudoperation.service.EmployeeService;

//buat class menjadi Controller  
@RestController
public class EmployeeController
{
//autowire EmployeeService 
@Autowired
EmployeeService employeeService;
//buat get mapping yang mengambil semua detail employee dari database   
@GetMapping("/employee")
private List<Employee> getAllEmployee()
{
return employeeService.getAllEmployee();
}
//buat get mapping yang mengambil detail dari employee tertentu  
@GetMapping("/employee/{id}")
private Employee getEmployee(@PathVariable("id") int id)
{
return employeeService.getEmployeeById(id);
}
//buat delete mapping that menghapus employee tertentu  
@DeleteMapping("/employee/{id}")
private void deleteEmployee(@PathVariable("id") int id)
{
employeeService.delete(id);
}
//buat post mapping yang memposting detail employee di database
@PostMapping("/employee")
private int saveEmployee(@RequestBody Employee employee)
{
employeeService.saveOrUpdate(employee);
return employee.getId();
}
//buat put mapping yang mengupdates detail employee   
@PutMapping("/employee")
private Employee update(@RequestBody Employee employee)
{
employeeService.saveOrUpdate(employee);
return employee;
}
}