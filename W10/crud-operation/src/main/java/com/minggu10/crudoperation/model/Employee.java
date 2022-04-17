package com.minggu10.crudoperation.model;

/**
 *
 * @author FAKHRI
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//buat class menjadi Entity   
@Entity
//definisikan class mnejadi Table  
@Table
public class Employee
{
//definisikan id sebagai primary key  
@Id
@Column
private int id;
@Column
private String name;
@Column
private String status;
@Column
private int salary;
public int getId()
{
return id;
}
public void setId(int id)
{
this.id = id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public String getStatus()
{
return status;
}
public void setStatus(String status)
{
this.status = status;
}
public int getSalary()
{
return salary;
}
public void setSalary(int salary)
{
this.salary = salary;
}
}