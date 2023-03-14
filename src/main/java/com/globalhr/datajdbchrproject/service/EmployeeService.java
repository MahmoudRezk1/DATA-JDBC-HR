package com.globalhr.datajdbchrproject.service;

import com.globalhr.datajdbchrproject.entity.Employee;
import com.globalhr.datajdbchrproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Long countEmp(){

        return this.employeeRepo.count();
    }

    public Iterable<Employee> findEmp(){
        return this.employeeRepo.findAll();
    }

    public Employee findEmpByID(Integer id){
        Optional<Employee> emp= employeeRepo.findById(id);
        if(emp.isPresent())
            return emp.get();
        else return null;
    }

    public Employee addEmp(Employee employee){
        return employeeRepo.save(employee);

    }

    public Employee updateEmp(Employee employee){
        return employeeRepo.save(employee);

    }

    public List<Employee> findEmpByName(@PathVariable String name){
        return this.employeeRepo.findByName(name);
    }

    public void deleteById(@PathVariable  Integer id){
        employeeRepo.deleteById(id);
    }
    public int updateEmpByIdAndSalary(Double salary,Integer id){
        return employeeRepo.updateEmpByIdAndSalary(salary,id);
    }
}
