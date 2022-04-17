package com.minggu10.crudoperation.repository;

/**
 *
 * @author FAKHRI
 */
import org.springframework.data.repository.CrudRepository;
import com.minggu10.crudoperation.model.Employee;
//repository yang mengextends CrudRepository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}