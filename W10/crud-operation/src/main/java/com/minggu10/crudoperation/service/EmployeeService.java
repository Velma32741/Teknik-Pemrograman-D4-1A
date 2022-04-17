package com.minggu10.crudoperation.service;

/**
 *
 * @author FAKHRI
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minggu10.crudoperation.model.Employee;
import com.minggu10.crudoperation.repository.EmployeeRepository;
//definisikan logika bisnis  
@Service
public class EmployeeService
{
@Autowired
EmployeeRepository employeeRepository;
//mendapatkan semua record employee dengan menggunakan metode findaAll() dari CrudRepository  
public List<Employee> getAllEmployee()
{
List<Employee> employee = new ArrayList<Employee>();
employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));
return employee;
}
//mendapatkan record tertentu dengan menggunakan metode findById() dari CrudRepository  
public Employee getEmployeeById(int id)
{
return employeeRepository.findById(id).get();
}
//menyimpan record tertentu dengan menggunakan metode save() dari CrudRepository  
public void saveOrUpdate(Employee employee)
{
employeeRepository.save(employee);
}
//menghapus record tertentu dengan menggunakan metode deleteById() dari CrudRepository  
public void delete(int id)
{
employeeRepository.deleteById(id);
}
//updating  record  
public void update(Employee employee, int id)
{
employeeRepository.save(employee);
}
}